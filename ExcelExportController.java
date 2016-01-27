public with sharing class ExcelExportController {

    public Opportunity[] opportunities {get;set;}
    public Integer oppSize {get;set;}

    //xls variables:
    public String xmlheader {get;set;}
    public String endfile{get;set;}

    public ExcelExportController() {

        xmlheader ='<?xml version="1.0"?><?mso-application progid="Excel.Sheet"?>';
        endfile = '</Workbook>';
        opportunities = [SELECT Id, Name, StageName, Amount FROM Opportunity LIMIT 10];
        oppSize = opportunities.size();
    }
}
