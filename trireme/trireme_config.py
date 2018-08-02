# Cassandra Configuration

# Contact points for your cluster, currently only the first is used
contact_points = ['172.17.0.2']

# Keyspace to work with, this doesn't have to exist yet.
keyspace = 'gcarmo'
# Replication options. Defined as a map just as you would in CQL.
replication = { 'class' : 'SimpleStrategy', 'replication_factor' : 1 }
# replication = {'class' : 'NetworkTopologyStrategy', 'dc1' : 3, 'dc2' : 2}

# Authentication Information
username = 'cassandra'
password = 'cassandra'

# Flag indicating whether this host is the migration master. Migrations are only run on the migration master
migration_master = True


# Solr Configuration
solr_url = 'http://127.0.0.1:8983/solr'
