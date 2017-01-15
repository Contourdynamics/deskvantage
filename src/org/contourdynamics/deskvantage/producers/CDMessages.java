package org.contourdynamics.deskvantage.producers;

import org.apache.deltaspike.core.api.message.MessageBundle;
import org.apache.deltaspike.core.api.message.MessageTemplate;

@MessageBundle
public interface  CDMessages {
	 @MessageTemplate("Please enter the password")
	 String PasswordRequired();
	 
	 @MessageTemplate("Please Enter Username")
	 String UsernameRequired();
	 
	 @MessageTemplate("Password or Username not Valid!")
	 String LoginStatusFailure();
	 
	 @MessageTemplate("Customer: Save Successful")
	 String CustomerSavedSuccess();
	 
	 @MessageTemplate("Customer: Save Failure")
	 String CustomerSavedFailure();
	 
	 @MessageTemplate("Customer: Save Failure To Initiate Process")
	 String CustomerSavedFailureProcess();
	 
	 @MessageTemplate("Customer: Description is required")
	 String CustomerDescriptionRequired();
	 
	 @MessageTemplate("Customer: Type is required")
	 String CustomerTypeRequired();
	 
	 @MessageTemplate("Customer: Select Any Record from List")
	 String CustomerListSelectionRequired();
	 
	 @MessageTemplate("Device Model: Save Successful")
	 String DeviceModelSavedSuccess();
	 
	 @MessageTemplate("Device Model: Save Failure")
	 String DeviceModelSavedUnSuccess();

	 @MessageTemplate("Device Model: Model Name is Manadatory")
	 String DeviceModelDescriptionRequired();
	 
	 @MessageTemplate("Device Model: Select Any Record from List")
	 String DeviceModelListSelectionRequired();
}
