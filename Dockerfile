FROM jenkins
USER root
RUN apt-get -y update
RUN apt-get -y install sudo
COPY sudoers /etc/sudoers
USER jenkins
ENV JAVA_OPTS="-Dhudson.Main.development=true -Djenkins.install.runSetupWizard=false"
COPY executors.groovy /usr/share/jenkins/ref/init.groovy.d/executors.groovy
RUN /usr/local/bin/install-plugins.sh ldap thinBackup hipchat cas-plugin
