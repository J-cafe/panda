package org.malagu.panda.dbconsole.datasource;

import java.io.Serializable;

import org.apache.commons.dbcp.BasicDataSource;

public class SerializableBasicDataSource extends BasicDataSource implements Serializable {
	private static final long serialVersionUID = 1L;

}
