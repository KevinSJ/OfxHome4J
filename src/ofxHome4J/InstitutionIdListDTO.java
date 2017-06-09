package ofxHome4J;

import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "insitution", strict = false)
public class InstitutionIdListDTO {
	@ElementList(name = "insitution", inline = true)
	private List<Institution> institutionIds;

	/**
	 * @return the institutionIds
	 */
	public List<Institution> getInstitutionIds() {
		return institutionIds;
	}

	/**
	 * @param institutionIds
	 *            the institutionIds to set
	 */
	public void setInstitutionIds(List<Institution> institutionIds) {
		this.institutionIds = institutionIds;
	}
}
