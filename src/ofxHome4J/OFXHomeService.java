package ofxHome4J;

import retrofit2.Call;
import retrofit2.http.GET;

public interface OFXHomeService {
	@GET("/dump.xml")
	Call<InstitutionIdListDTO> searh();
}
