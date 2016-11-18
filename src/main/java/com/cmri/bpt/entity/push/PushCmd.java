package com.cmri.bpt.entity.push;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PushCmd {

	public PushType type = PushType.Start;
	public Integer code = PushCode.OK;
	public String data = null;

	public enum PushType {

		Start(0), Stop(-1);

		private int value = -1;

		PushType(int value) {
			this.value = value;
		}

		public int getValue() {
			return this.value;
		}

	}

	public static class PushCode {

		public static final int OK = 0;

		// 寻呼测试
		public static class PagingTest {
			public int base = 100;
			// 空闲态寻呼
			public int idlePaging = base + 1;
			// 系统消息修改触发TAU
			public int tauPaging = base + 2;

		}

		// 语音测试
		public static class VoiceTest {

		}

		// 业务保持测试
		public static class ServiceRetentionTest {
			public int base = 300;
		}

		public static class MixTest {
			public int base = 400;
			public int randomTest = base + 1;
			public int groupTest = base + 2;

		}

	}

	public String Serialize() {

		StringBuilder builder = new StringBuilder();
		builder.append("<type>" + type + "</type>");
		builder.append("<code>" + code + "</code>");
		builder.append("<data>" + data + "</data>");
		return builder.toString();
	}

	public static PushCmd Deserialize(String cmd) {

		String regex = "<type>(?<type>.*)</type><code>(?<code>.*)</code><data>(?<data>.*)</data>";

		Pattern pattern = Pattern.compile(regex);

		Matcher match = pattern.matcher(cmd);

		if (match.matches()) {
			PushCmd pcmd = new PushCmd();

			pcmd.type = PushType.valueOf(match.group("type"));
			pcmd.code = Integer.valueOf(match.group("code"));
			pcmd.data = match.group("data");

			return pcmd;

		} else {
			return null;
		}

	}

}
