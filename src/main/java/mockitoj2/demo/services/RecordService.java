package mockitoj2.demo.services;

import mockitoj2.demo.dao.DatabaseDAO;
import mockitoj2.demo.dao.NetworkDAO;

public class RecordService {
DatabaseDAO database;
NetworkDAO network;
public DatabaseDAO getDatabase() {
	return database;
}
public void setDatabase(DatabaseDAO database) {
	this.database = database;
}
public NetworkDAO getNetwork() {
	return network;
}
public void setNetwork(NetworkDAO network) {
	this.network = network;
}




}
