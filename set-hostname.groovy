import jenkins.model.JenkinsLocationConfiguration

def VIRTUAL_HOST = System.getenv("JENKINS_VIRTUAL_HOST")

if (VIRTUAL_HOST) {
  JenkinsLocationConfiguration.get().setUrl(JENKINS_VIRTUAL_HOST)
}
