# Harvard-MIT Data Center jenkins

This is a child of the official Jenkins docker image.

It adds a number of plugins, such as CAS authentication, LDAP
authentication, etc.

The # of executors is set automatically to the number of cores available
to the container.

Default authentication is performed through CAS.
