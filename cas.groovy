import jenkins.model.*
import org.jenkinsci.plugins.cas.*
import hudson.security.*

def instance = Jenkins.getInstance()
def casprotocol = new protocols.Cas20Protocol('', '', '', false, false,
  '')

def casRealm = new CasSecurityRealm("https://www.pin1.harvard.edu/cas",
 casprotocol,
 false,
 false,
 true)

instance.setSecurityRealm(casRealm)
instance.save()
