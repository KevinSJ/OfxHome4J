package ofxHome4J;

import javax.annotation.Generated;

/**
 * This is intended to be the client to communicate with the bank through OFX
 * protocol
 * 
 * @author Kevin
 *
 */
public class OfxClient {
	private static final String DEFAULT_APP_ID = "QWIN";
	private static final String DEFAULT_APP_VERSION = "2500";
	private static final String DEFAULT_OFX_VERSION = "102";

	private Institution inst;
	// (optional need for OFX version >= 103)
	private String clientId;
	private String appId;
	private String appVersion;
	private String ofxVersion;

	/**
	 * private constructor
	 */
	private OfxClient() {

	}

	@Generated("SparkTools")
	private OfxClient(Builder builder) {
		this.inst = builder.inst;
		this.clientId = builder.clientId;
		this.appId = builder.appId == null ? DEFAULT_APP_ID : builder.appId;
		this.appVersion = builder.appVersion == null ? DEFAULT_APP_VERSION : builder.appVersion;
		this.ofxVersion = builder.ofxVersion == null ? DEFAULT_OFX_VERSION : builder.ofxVersion;
	}

	/**
	 * Creates builder to build {@link OfxClient}.
	 * 
	 * @return created builder
	 */
	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder to build {@link OfxClient}.
	 */
	@Generated("SparkTools")
	public static final class Builder {
		private Institution inst;
		private String clientId;
		private String appId;
		private String appVersion;
		private String ofxVersion;

		private Builder() {
		}

		public Builder withInst(Institution inst) {
			this.inst = inst;
			return this;
		}

		public Builder withClientId(String clientId) {
			this.clientId = clientId;
			return this;
		}

		public Builder withAppId(String appId) {
			this.appId = appId;
			return this;
		}

		public Builder withAppVersion(String appVersion) {
			this.appVersion = appVersion;
			return this;
		}

		public Builder withOfxVersion(String ofxVersion) {
			this.ofxVersion = ofxVersion;
			return this;
		}

		public OfxClient build() {
			return new OfxClient(this);
		}
	}

	/**
	 * @return the inst
	 */
	public Institution getInst() {
		return inst;
	}

	/**
	 * @return the clientId
	 */
	public String getClientId() {
		return clientId;
	}

	/**
	 * @return the appId
	 */
	public String getAppId() {
		return appId;
	}

	/**
	 * @return the appVersion
	 */
	public String getAppVersion() {
		return appVersion;
	}

	/**
	 * @return the ofxVersion
	 */
	public String getOfxVersion() {
		return ofxVersion;
	}

}
