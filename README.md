# Harvard-MIT Data Center jenkins

This is a child of the official Jenkins docker image.

It adds a number of plugins, such as CAS authentication, LDAP
authentication, etc.

The # of executors is set automatically to the number of cores available
to the container.

Default authentication is performed through Harvard CAS.

Set JENKINS_VIRTUAL_HOST=http[s]://fqdn environment variable on run to configure the
Jenkins URL, also useful for proxied configurations.

NOTE, at the moment, login is not required to perform any actions. 
While authentication is performed by CAS, please configure authorization
appropriately.
