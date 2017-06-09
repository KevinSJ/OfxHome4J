package ofxHome4J;

import java.util.stream.Stream;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.SimpleXmlConverterFactory;

public class Client implements Callback<InstitutionIdListDTO> {
	private static final String BASE_URL = "http://127.0.0.1:3000/";

	public void start() {
		Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
				.addConverterFactory(SimpleXmlConverterFactory.create()).build();
		OFXHomeService ofx = retrofit.create(OFXHomeService.class);
		Call<InstitutionIdListDTO> call = ofx.searh();
		call.enqueue(this);
	}

	@Override
	public void onFailure(Call<InstitutionIdListDTO> arg0, Throwable arg1) {
		// TODO Auto-generated method stub
		arg1.printStackTrace();
	}

	@Override
	public void onResponse(Call<InstitutionIdListDTO> arg0, Response<InstitutionIdListDTO> response) {
		if (response.isSuccessful()) {
			InstitutionIdListDTO list = response.body();
			list.getInstitutionIds().stream().filter(institut -> institut.getName().contains("Chase"))
					.forEach(inst -> System.out.println(inst.toString()));
			// list.getInstitutionIds().forEach(institutionId ->
			// System.out.println(institutionId.toString()));
		} else {
			System.out.println(response.errorBody());
		}
	}
}
