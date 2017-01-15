package org.contourdynamics.deskvantage.producers;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import org.apache.deltaspike.jpa.api.transaction.Transactional;
import org.contourdynamics.deskvantage.idm.model.Realm;
import org.picketlink.idm.IdentityManager;
import org.picketlink.idm.PartitionManager;
import org.picketlink.idm.RelationshipManager;
import org.picketlink.idm.credential.Password;
import org.contourdynamics.deskvantage.idm.model.Role;
import org.contourdynamics.deskvantage.idm.model.User;
import org.contourdynamics.deskvantage.idm.model.Grant;
import org.picketlink.annotations.PicketLink;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
/**
 * This startup bean creates a number of default users, groups and roles when the application is started.
 * 
 * @author Shane Bryzak
 */
@ApplicationScoped
@Singleton
@Startup
@Transactional(qualifier = PicketLink.class)
public class SecurityInitializer {

	public static final String REALM_CD_NAME = "deskvantage";
    
    @Inject
    private PartitionManager partitionManager;

    @PostConstruct
    public void create() throws Exception{
    	Realm cd = new Realm(REALM_CD_NAME);
    	Realm storedRealm = partitionManager.getPartition(Realm.class, cd.getName());
    	if(storedRealm == null)
    	{
    		cd.setEnforceSSL(true);
    		KeyPair keyPair = KeyPairGenerator.getInstance("RSA").generateKeyPair();
    		cd.setPrivateKey(keyPair.getPrivate().getEncoded());
    		cd.setPublickKey(keyPair.getPublic().getEncoded());
    		cd.setNumberFailedLoginAttempts(3);
    		partitionManager.add(cd);
 
        	IdentityManager cdIdentityManager = partitionManager.createIdentityManager(cd);
        	
            Role Agents = new Role("SuperAdmin");
            Role Customers = new Role("Customers");
            Role Consumer = new Role("Consumers");
            
            cdIdentityManager.add(Agents);
            cdIdentityManager.add(Customers);
            cdIdentityManager.add(Consumer);
            
            User user = new User("admin");            
            cdIdentityManager.add(user);
            Password password = new Password("admin");
            cdIdentityManager.updateCredential(user, password); 
            
            RelationshipManager relationshipManager = partitionManager.createRelationshipManager();
            relationshipManager.add(new Grant(user, Agents));
            
    	}
    }
}
