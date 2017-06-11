package ofxProtocol;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import ofxHome4J.OfxClient;

/**
 * @author kevin
 * 
 *         This class modifies the HTTP Request and adds the appropriate OFX
 *         header to the request.
 * 
 */
class OFXHeader {
	private String ofxUid;
	private List<String> ofxHeaders;
	private String ofxVersion;

	{
		ofxHeaders = Arrays.asList(new String[] { "OFHEADER:100", "DATA:OFXSGML", "SECURITY:NONE", "ENCODING:USASCII",
				"CHARSET:1252", "COMPRESSION:NONE", "OLDFILEUID:NONE" });
	}

	OFXHeader(OfxClient client) {
		this.ofxUid = UUID.randomUUID().toString();
		this.ofxVersion = client.getOfxVersion();
		ofxHeaders.add("VERSION:"+ ofxVersion);
		ofxHeaders.add("NEWFILEUID:"+ this.ofxUid);
	}

	String generateHeader(){
		StringBuffer headers = new StringBuffer();
		ofxHeaders.forEach(header -> headers.append(header).append("\r\n"));
		return headers.toString();
	}
/*	@Override
	public Response intercept(Chain chain) throws IOException {
		Request req = chain.request();
		StringBuffer body = new StringBuffer();
		
		ofx_header.forEach(header -> body.append(header).append("\r\n"));
		
		RequestBody rb = RequestBody.create(MediaType.parse("application/x-ofx;charset=1252"), body.toString());
		req.newBuilder().post(rb).build();
		
		return chain.proceed(req);
	}*/

}
