/*
 * JBoss, Home of Professional Open Source
 * Copyright 2013, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.contourdynamics.deskvantage.producers;

import org.contourdynamics.deskvantage.idm.entity.ApplicationAccessTypeEntity;
import org.contourdynamics.deskvantage.idm.entity.ApplicationRealmTypeEntity;
import org.contourdynamics.deskvantage.idm.entity.ApplicationTypeEntity;
import org.contourdynamics.deskvantage.idm.entity.GrantTypeEntity;
import org.contourdynamics.deskvantage.idm.entity.GroupMembershipTypeEntity;
import org.contourdynamics.deskvantage.idm.entity.GroupTypeEntity;
import org.contourdynamics.deskvantage.idm.entity.PartitionTypeEntity;
import org.contourdynamics.deskvantage.idm.entity.RealmTypeEntity;
import org.contourdynamics.deskvantage.idm.entity.RoleTypeEntity;
import org.contourdynamics.deskvantage.idm.entity.PasswordCredentialTypeEntity;
import org.contourdynamics.deskvantage.idm.entity.UserTypeEntity;
import org.contourdynamics.deskvantage.idm.entity.RelationshipIdentityTypeEntity;
import org.contourdynamics.deskvantage.idm.entity.RelationshipTypeEntity;
import org.contourdynamics.deskvantage.idm.model.Application;
import org.contourdynamics.deskvantage.idm.model.ApplicationAccess;
import org.contourdynamics.deskvantage.idm.model.ApplicationRealm;
import org.contourdynamics.deskvantage.idm.model.Grant;
import org.contourdynamics.deskvantage.idm.model.Group;
import org.contourdynamics.deskvantage.idm.model.GroupMembership;
import org.contourdynamics.deskvantage.idm.model.Realm;
import org.contourdynamics.deskvantage.idm.model.Role;
import org.contourdynamics.deskvantage.idm.model.User;
import org.picketlink.idm.config.IdentityConfiguration;
import org.picketlink.idm.config.IdentityConfigurationBuilder;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
/**
 * This bean produces the configuration for PicketLink IDM
 * 
 * 
 * @author Shane Bryzak
 *
 */
@ApplicationScoped
public class IdentityManagementConfiguration {

	private IdentityConfiguration identityConfig = null;
	
	@Produces
	public IdentityConfiguration createConfig() {
		if (identityConfig == null) {
		initJPAConfig();
		}
		return identityConfig;
	}
	@SuppressWarnings("unchecked")
	private void initJPAConfig() {
		IdentityConfigurationBuilder builder = new IdentityConfigurationBuilder();
		builder
		.named("default")
		.stores()
		.jpa()
		.supportType(
                User.class,
                Role.class,
                Group.class,
                Realm.class,
                Application.class,
                ApplicationRealm.class)
            .supportGlobalRelationship(
                Grant.class,
                GroupMembership.class,
                ApplicationAccess.class)
            .supportCredentials(true)
            .mappedEntity(
                ApplicationAccessTypeEntity.class,
                ApplicationTypeEntity.class,
                ApplicationRealmTypeEntity.class,
                PartitionTypeEntity.class,
                GrantTypeEntity.class,
                GroupMembershipTypeEntity.class,
                GroupTypeEntity.class,
                RealmTypeEntity.class,
                RoleTypeEntity.class,
                UserTypeEntity.class,
                PasswordCredentialTypeEntity.class,
                RelationshipTypeEntity.class,
                RelationshipIdentityTypeEntity.class)
                ;
		identityConfig = builder.build();
	}
}