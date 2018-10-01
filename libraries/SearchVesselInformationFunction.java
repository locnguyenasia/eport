package libraries;

import objects.SearchContainerInformationObject;
import objects.SearchVesselInformationObject;
import static supports.CommonFunctions.*;

public class SearchVesselInformationFunction {

    SearchVesselInformationObject obj = new SearchVesselInformationObject();

    public void selectLink(){
        click(SearchContainerInformationObject.searchLnk);
        click(obj.vesselInformationLnk);
    }

    public void fillForm(String vesselVoyage){
        click(obj.siteDdl);
        click(obj.selectSiteDdl);
        fillIn(obj.vesselVoyageTxt, vesselVoyage);
    }

    public void search(){
        click(obj.searchBtn);
        click(obj.exportExcelBtn);
    }

}
