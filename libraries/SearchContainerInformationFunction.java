package libraries;

import objects.SearchContainerInformationObject;
import static supports.CommonFunctions.*;
import data.SearchContainerInformationData;

public class SearchContainerInformationFunction {

    SearchContainerInformationObject obj = new SearchContainerInformationObject();

    public void selectLink(){
        click(obj.searchLnk);
        click(obj.containerInformationLnk);
    }

    public void fillForm(String container){
        click(obj.areaDdl);
        click(obj.selectAreaDdl);


        if ((SearchContainerInformationData.inYard).equalsIgnoreCase("false")) {
            if (isSelected(obj.inYardChk)==true){
                click(obj.inYardChk);
            };
        } else {
            if (isSelected(obj.inYardChk)!=true){
                click(obj.inYardChk);
            };
        }

        if ((SearchContainerInformationData.batch).equalsIgnoreCase( "false")) {
            if (isSelected(obj.batchChk)==true){
                click(obj.batchChk);
            };
        } else {
            if (isSelected(obj.batchChk)!=true){
                click(obj.batchChk);
            };
        }

        fillIn(obj.containerTxt, container);
    }

    public void search(){
        click(obj.searchBtn);
        click(obj.exportExcelBtn);
    }
}
