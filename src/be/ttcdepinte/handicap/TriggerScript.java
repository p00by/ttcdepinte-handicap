package be.ttcdepinte.handicap;

public class TriggerScript {

	private static final String tables = 
	"ATTACHMENT;ATTM_PK\n" + 
	"ATTACHMENTLINK;ATLN_PK\n" + 
	"CONFIGURATION;CNFG_PK\n" + 
	"CONTENT;CNTN_PK\n" + 
	"CONTENTORDER;CNRD_PK\n" + 
	"CONTENTORDERUPDATE;CRPD_PK\n" + 
	"CONTENTREQUEST;CNRQ_PK\n" + 
	"CONTENTTYPE;CNTP_PK\n" + 
	"CONTENTTYPERELATION;CTPR_PK\n" + 
	"CONTENTUPDATE;CNPD_PK\n" + 
	"CUSTOMER;CSTM_PK\n" + 
	"DATATYPE;DTTP_PK\n" + 
	"DBTABLE;DBTB_PK\n" + 
	"DISEASE;DISS_PK\n" + 
	"EXPERIMENT;XPRM_PK\n" + 
	"EXPERIMENTKEYWORD;XPKW_PK\n" + 
	"EXPERIMENTKEYWORDMAP;XPKM_PK\n" + 
	"EXPERIMENTRUN;XPRN_PK\n" + 
	"EXPERIMENTRUNREQUEST;XRRQ_PK\n" + 
	"EXPERIMENTRUNSTEP;XPRS_PK\n" + 
	"EXPERIMENTRUNSTEPCONTENT;XRSC_PK\n" + 
	"EXPERIMENTRUNSTEPUPDATE;XRSU_PK\n" + 
	"EXPERIMENTSTEP;XPST_PK\n" + 
	"EXPERIMENTSTEPCONTENTTYPE;XSCT_PK\n" + 
	"EXPERIMENTSTEPROLE;XPSR_PK\n" + 
	"EXPERIMENTSTEPSCENARIO;XSSC_PK\n" + 
	"EXPERIMENTSTEPTEST;XSTS_PK\n" + 
	"EXPERIMENTSTEPWORKFLOW;XSWF_PK\n" + 
	"EXPERIMENTTEMPLATE;XPTM_PK\n" + 
	"EXPERIMENTTEMPLATEVALIDATOR;XTVR_PK\n" + 
	"FUNCTIONALITY;FNCT_PK\n" + 
	"FUNCTIONALITYGRANT;FNGR_PK\n" + 
	"FUNCTIONALITYGROUP;FNGP_PK\n" + 
	"GROUPS;GRPS_PK\n" + 
	"LABELTEMPLATE;LBTM_PK\n" + 
	"LABELTEMPLATEPRINTER;LTPR_PK\n" + 
	"LABSETTING;LBST_PK\n" + 
	"LOCATION;LCTN_PK\n" + 
	"LOCATIONTYPE;LCTP_PK\n" + 
	"LOCATIONTYPECONTENTTYPE;LTCT_PK\n" + 
	"LOCATIONTYPERELATION;LTRL_PK\n" + 
	"LOCATIONTYPEROLE;LCTR_PK\n" + 
	"MODULE;MODL_PK\n" + 
	"ORDERCONTENT;RDCN_PK\n" + 
	"ORDERGROUP;RDGR_PK\n" + 
	"ORDERS;ORDR_PK\n" + 
	"ORDERUPDATE;RDPD_PK\n" + 
	"PERSPECTIVE;PRSP_PK\n" + 
	"PERSPECTIVECOMPONENT;PRCM_PK\n" + 
	"PERSPECTIVEROLE;PRRL_PK\n" + 
	"PRINTER;PRNT_PK\n" + 
	"PRINTERJOB;PRJO_PK\n" + 
	"PROJECT;PRJC_PK\n" + 
	"PROVIDER;PRVD_PK\n" + 
	"QCCONFIGURATION;QCCN_PK\n" + 
	"QCRESULT;QCRS_PK\n" + 
	"QCRULE;QCRL_PK\n" + 
	"QCSTATISTICS;QCST_PK\n" + 
	"QCTYPE;QCTP_PK\n" + 
	"REPORTTEMPLATE;RPTM_PK\n" + 
	"REQUEST;RQST_PK\n" + 
	"RESULT;RSLT_PK\n" + 
	"RESULTOBSERVATIONPOINT;RSBP_PK\n" + 
	"RESULTUPDATE;RSPD_PK\n" + 
	"ROLE;ROLE_PK\n" + 
	"RULE;RULE_PK\n" + 
	"RULEEVALUATION;RLVL_PK\n" + 
	"SCENARIO;SCNR_PK\n" + 
	"SCENARIOROLE;SCRL_PK\n" + 
	"SCENARIOSTEP;SCST_PK\n" + 
	"SLIMS;SLMS_PK\n" + 
	"SOURCE;SORC_PK\n" + 
	"STATUS;STTS_PK\n" + 
	"TABLEFIELD;TBFL_PK\n" + 
	"TABLEFIELDCONTENTTYPE;TFCT_PK\n" + 
	"TABLEFIELDDATEVALUE;TFDV_PK\n" + 
	"TABLEFIELDEXPERIMENTSTEP;TFXS_PK\n" + 
	"TABLEFIELDEXPERIMENTTEMPLATE;TFXT_PK\n" + 
	"TABLEFIELDFLOATVALUE;TFFV_PK\n" + 
	"TABLEFIELDINTVALUE;TFIV_PK\n" + 
	"TABLEFIELDLOCATIONTYPE;TFLT_PK\n" + 
	"TABLEFIELDRIGHT;TFRG_PK\n" + 
	"TABLEFIELDSTRINGVALUE;TFSV_PK\n" + 
	"TABLEFIELDTEXTVALUE;TFTV_PK\n" + 
	"TEST;TEST_PK\n" + 
	"TESTCONTENTTYPE;TSCT_PK\n" + 
	"TESTGROUP;TSGR_PK\n" + 
	"TESTTESTGROUP;TTGR_PK\n" + 
	"USERGROUP;SRGR_PK\n" + 
	"USERS;USER_PK\n" + 
	"WORKLIST;WRKL_PK\n" + 
	"WORKLISTEXPERIMENTRUNSTEP;WLXR_PK\n" + 
	"WORKLISTTEMPLATE;WLTM_PK\n";
	
	public static void main(String[] args) {
		
		String[] tableSplit = tables.split("\n");
		for (String tableBlah: tableSplit) {
			String table = tableBlah.split(";")[0];
			String pk = tableBlah.split(";")[1];
			//System.out.println("<createSequence sequenceName=\"" + pk.substring(0,4).toLowerCase() + "_seq\"/>");
		}
		
		for (String tableBlah: tableSplit) {
			String table = tableBlah.split(";")[0];
			String pk = tableBlah.split(";")[1];
			String sequence = pk.toLowerCase().substring(0, 4) + "_seq";
			
			System.out.println("<createProcedure>");
			System.out.println("create trigger " +  pk.toLowerCase().substring(0, 4) + "_trigger before insert on " + table);
			System.out.println("for each row");
			System.out.println("when (new." + pk + " is null)");
			System.out.println("begin");
			System.out.println(" select " + sequence + ".nextval into :new." + pk + " from dual;");
			System.out.println("end;");
			System.out.println("</createProcedure>");
			System.out.println("<rollback>");
			System.out.println("drop trigger " +  pk.toLowerCase().substring(0, 4) + "_trigger");		
			System.out.println("</rollback>");

			System.out.println();
			
		}
		
	}
	
}
