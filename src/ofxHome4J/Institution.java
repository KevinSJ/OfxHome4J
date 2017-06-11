package ofxHome4J;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "institution", strict = false)
public class Institution {
	@Element(required = false)
	private String name;
	@Element(required = false)
	private String fid;
	@Element(required = false)
	private String url;
	@Element(required = false)
	private String org;
	
	private String userName;
	
	private String password;
	

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Institution [");
		if (name != null)
			builder.append("name=").append(name).append(", ");
		if (fid != null)
			builder.append("fid=").append(fid).append(", ");
		if (url != null)
			builder.append("url=").append(url).append(", ");
		if (org != null)
			builder.append("org=").append(org).append(", ");
		if (userName != null)
			builder.append("userName=").append(userName).append(", ");
		if (password != null)
			builder.append("password=").append(password);
		builder.append("]");
		return builder.toString();
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url
	 *            the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the fid
	 */
	public String getFid() {
		return fid;
	}

	/**
	 * @param fid
	 *            the fid to set
	 */
	public void setFid(String fid) {
		this.fid = fid;
	}

	/**
	 * @return the org
	 */
	public String getOrg() {
		return org;
	}

	/**
	 * @param org the org to set
	 */
	public void setOrg(String org) {
		this.org = org;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
