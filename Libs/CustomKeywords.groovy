
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String


def static "com.ContactCenter.Utilities.CustomBrowser.ccAgentBrowser"(
    	String Username	) {
    (new com.ContactCenter.Utilities.CustomBrowser()).ccAgentBrowser(
        	Username)
}

def static "com.ContactCenter.Utilities.LoginHelper.loginIntoApplication"(
    	String ContactCenterURL	
     , 	String Username	
     , 	String Password	) {
    (new com.ContactCenter.Utilities.LoginHelper()).loginIntoApplication(
        	ContactCenterURL
         , 	Username
         , 	Password)
}

def static "com.AstriskValidation.AstriskValidation.AGENTNAILUP"(
    	String Username	
     , 	String Password	) {
    (new com.AstriskValidation.AstriskValidation()).AGENTNAILUP(
        	Username
         , 	Password)
}

def static "com.AstriskValidation.AstriskValidation.AGENTLOGOUT"() {
    (new com.AstriskValidation.AstriskValidation()).AGENTLOGOUT()
}
