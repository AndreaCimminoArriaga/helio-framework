package helio.framework.materialiser.mappings;

public class DataSource {
	
	private String id;
	private DataHandler dataHandler;
	private DataProvider dataProvider;
	private Integer refresh; // in ms
	
	// -- Constructor
	
	public DataSource() {
		// empty
	}
	
	public DataSource(String id, DataHandler dataHandler, DataProvider dataProvider) {
		super();
		this.id = id;
		this.dataHandler = dataHandler;
		this.dataProvider = dataProvider;
		this.refresh = null;
	}
	
	public DataSource(String id, DataHandler dataHandler, DataProvider dataProvider, Integer refresh) {
		super();
		this.id = id;
		this.dataHandler = dataHandler;
		this.dataProvider = dataProvider;
		this.refresh = refresh;
	}

	// Getters & Setters

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public DataHandler getDataHandler() {
		return dataHandler;
	}

	public void setDataHandler(DataHandler dataHandler) {
		this.dataHandler = dataHandler;
	}

	public DataProvider getDataProvider() {
		return dataProvider;
	}

	public void setDataProvider(DataProvider dataProvider) {
		this.dataProvider = dataProvider;
	}

	public Integer getRefresh() {
		return refresh;
	}

	public void setRefresh(Integer refresh) {
		this.refresh = refresh;
	}

	// -- Ancillary
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataHandler == null) ? 0 : dataHandler.hashCode());
		result = prime * result + ((dataProvider == null) ? 0 : dataProvider.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((refresh == null) ? 0 : refresh.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DataSource other = (DataSource) obj;
		if (dataHandler == null) {
			if (other.dataHandler != null)
				return false;
		} else if (!dataHandler.equals(other.dataHandler))
			return false;
		if (dataProvider == null) {
			if (other.dataProvider != null)
				return false;
		} else if (!dataProvider.equals(other.dataProvider))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (refresh == null) {
			if (other.refresh != null)
				return false;
		} else if (!refresh.equals(other.refresh))
			return false;
		return true;
	}

	


	
	
}
