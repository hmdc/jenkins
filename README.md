# Harvard-MIT Data Center jenkins

This is a child of the official Jenkins docker image.

It adds a number of plugins, such as CAS authentication, LDAP
authentication, etc.

The # of executors is set automatically to the number of cores available
to the container.

Default authentication is performed through Harvard CAS.

Sudo is installed along with a sudoers allowing jenkins to run the
HashBackup application as root.

Set VIRTUAL_HOST=fqdn environment variable on run to configure the
Jenkins URL, also useful for proxied configurations.
