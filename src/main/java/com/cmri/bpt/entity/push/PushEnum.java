package com.cmri.bpt.entity.push;

public class PushEnum {

	public static final String SendCase = "Cmd_Case_Send";
	public static final String SendCase_Msg = "任务下发";

	public static final String StopCase = "Cmd_Case_Stop";
	public static final String StopCase_Msg = "任务停止";

	public static final String AgentUpdate = "Cmd_Agent_Update";
	public static final String AgentUpdate_Msg = "升级Agent";

	public static final String JarUpdate = "Cmd_Jar_Update";
	public static final String JarUpdate_Msg = "升级Jar";

	public static final String ReceiveCaseLog = "Cmd_CaseLog_Receive";
	public static final String ReceiveCaseLog_Msg = "停止任务日志";

	public static final String StopCaseLog = "Cmd_CaseLog_Stop";
	public static final String StopCaseLog_Msg = "回收任务日志";

	public static final String ShutdownUe = "Cmd_Ue_Shutdown";

	public static final String RestartUe = "Cmd_Ue_Restart";

	public static final String FlyModeOfUe = "Cmd_Ue_Flymode";

	public static final String UeOriginatingCall = "Cmd_Ue_OriginatingCall";

	public static final String UeTerminatingCall = "Cmd_Ue_TerminatingCall";

	public static final String UeSyncTime = "Cmd_Ue_SyncTime";

	public static final String UeExpireCallNumber = "Cmd_Ue_ExpireCall";

	public static final String UeStoreCallNumber = "Cmd_Ue_StoreCall";

	public static final String UeWifiOn = "Cmd_Ue_OpenWifi";

	public static final String UeWifiOff = "Cmd_Ue_CloseWifi";
}
