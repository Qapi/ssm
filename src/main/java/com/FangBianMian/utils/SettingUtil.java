package com.FangBianMian.utils;

import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * ���������ļ������ṩ��ȡ�ķ���
 */
public class SettingUtil {

	public static String FILE_COMMON = "/common.properties";
	private static Map<String, Properties> pools = new HashMap<String, Properties>();
	
	/**
	 * ����ϵͳ���������ļ�
	 * 
	 * @param uri
	 * @return
	 */
	public static Properties loadSetting(String uri) {
		Properties prop = pools.get(uri);
		if (prop == null) {
			// û�м��������
			InputStream is = SettingUtil.class.getResourceAsStream(uri);
			if (is == null) {
				throw new IllegalArgumentException("Resource [" + uri + "] not found");
			}
			prop = new Properties();
			try {
				prop.load(is);
			} catch (IOException e) {
				throw new IllegalArgumentException(e);
			}
			pools.put(uri, prop);
		}
		return prop;
	}

	/**
	 * ��ȡcommon.properties�ļ��е�ֵ
	 * 
	 * @param key
	 * @return
	 */
	public static String getCommonSetting(String key) {
		Properties prop = loadSetting(FILE_COMMON);
		return prop.getProperty(key);
	}
}
