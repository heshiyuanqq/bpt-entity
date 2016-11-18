package com.cmri.bpt.entity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;
import org.springframework.util.Assert;

import com.cmri.bpt.entity.push.PushCmd;
import com.cmri.bpt.entity.push.PushCmd.PushType;

public class PushCmdTest {

	@Test
	public void run() {

		PushCmd cmd = new PushCmd();

		cmd.type = PushType.Stop;
		cmd.code = 12;
		cmd.data = "{'a':'b'}";

		String cmdStr = cmd.Serialize();

		PushCmd cmdCpy = PushCmd.Deserialize(cmdStr);

		Assert.isTrue(cmdCpy.type == cmd.type);
		Assert.isTrue(cmdCpy.code == cmd.code);
		Assert.isTrue(cmdCpy.data.equals(cmd.data));

	}

}
