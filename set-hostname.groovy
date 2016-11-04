import jenkins.model.JenkinsLocationConfiguration

def VIRTUAL_HOST = System.getenv("VIRTUAL_HOST")

if (VIRTUAL_HOST) {
  JenkinsLocationConfiguration.get().setUrl(VIRTUAL_HOST)
}
