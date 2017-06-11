package ofxProtocol;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import okhttp3.Interceptor;
import okhttp3.Response;

class HttpHeader implements Interceptor {
	private static final Map<String, String> OFX_HTTPHEADERS = new HashMap<>();

	static {
		OFX_HTTPHEADERS.put("User-Agent", "OFX For Java");
		OFX_HTTPHEADERS.put("Content-Type", "application/x-ofx");
		OFX_HTTPHEADERS.put("Accept", "*/*, application/x-ofx");
	}

	@Override
	public Response intercept(Chain chain) throws IOException {
		okhttp3.Request.Builder req = chain.request().newBuilder();
		OFX_HTTPHEADERS.entrySet().forEach(entry -> req.header(entry.getKey(), entry.getValue()));
		return chain.proceed(req.build());
	}
}
