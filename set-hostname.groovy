import jenkins.model.JenkinsLocationConfiguration

def THE_VIRTUAL_HOST = System.getenv("JENKINS_VIRTUAL_HOST")

if (THE_VIRTUAL_HOST) {
  JenkinsLocationConfiguration.get().setUrl(THE_VIRTUAL_HOST)
}
