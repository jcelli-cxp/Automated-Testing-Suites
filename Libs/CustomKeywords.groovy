
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String


def static "com.cc51722rc1.utilities.LoginHelper.loginIntoApplication"(
    	String ContactCenterURL	
     , 	String Username	
     , 	String Password	) {
    (new com.cc51722rc1.utilities.LoginHelper()).loginIntoApplication(
        	ContactCenterURL
         , 	Username
         , 	Password)
}

def static "com.cc51722rc1.utilities.LoginHelper.agentNailUp"() {
    (new com.cc51722rc1.utilities.LoginHelper()).agentNailUp()
}

def static "com.cc51722rc1.utilities.CustomBrowser.ccAgentBrowser"(
    	String Username	) {
    (new com.cc51722rc1.utilities.CustomBrowser()).ccAgentBrowser(
        	Username)
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
