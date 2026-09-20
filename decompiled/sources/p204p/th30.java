package p204p;

import io.ably.lib.types.Param;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import p196j$.net.URLDecoder;

/* JADX INFO: loaded from: classes16.dex */
public abstract class th30 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f220314a = 0;

    static {
        HashMap map = new HashMap();
        map.put("json", "application/json");
        map.put("xml", "application/xml");
        map.put("html", "text/html");
        map.put("msgpack", "application/x-msgpack");
    }

    /* JADX INFO: renamed from: a */
    public static void m80821a(StringBuilder sb, Param[] paramArr) {
        if (paramArr == null || paramArr.length <= 0) {
            return;
        }
        sb.append('?');
        sb.append(paramArr[0].key);
        sb.append('=');
        sb.append(paramArr[0].value);
        for (int i = 1; i < paramArr.length; i++) {
            sb.append('&');
            sb.append(paramArr[i].key);
            sb.append('=');
            sb.append(paramArr[i].value);
        }
    }

    /* JADX INFO: renamed from: b */
    public static HashMap m80822b(String str) {
        HashMap map = new HashMap();
        try {
            for (String str2 : str.split("&")) {
                int iIndexOf = str2.indexOf(61);
                String strDecode = URLDecoder.decode(str2.substring(0, iIndexOf), "UTF-8");
                map.put(strDecode, new Param(strDecode, URLDecoder.decode(str2.substring(iIndexOf + 1), "UTF-8")));
            }
        } catch (UnsupportedEncodingException unused) {
        }
        return map;
    }

    /* JADX INFO: renamed from: c */
    public static String m80823c(Param[] paramArr, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (paramArr.length > 0) {
            int length = paramArr.length;
            boolean z = true;
            int i = 0;
            while (i < length) {
                Param param = paramArr[i];
                sb.append(z ? '?' : '&');
                sb.append(param.key);
                sb.append('=');
                sb.append(m80824d(param.value));
                i++;
                z = false;
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    public static String m80824d(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        StringBuilder sb = new StringBuilder(bytes.length);
        for (byte b : bytes) {
            if (b < 97 ? b < 65 ? b < 48 ? b == 45 || b == 46 : b <= 57 : b <= 90 || b == 95 : b <= 122 || b == 126) {
                sb.append((char) b);
            } else {
                sb.append('%');
                sb.append("0123456789ABCDEF".charAt((b >> 4) & 15));
                sb.append("0123456789ABCDEF".charAt(b & 15));
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: e */
    public static Param[] m80825e(Map map) {
        if (map != null) {
            return (Param[]) map.values().toArray(new Param[map.size()]);
        }
        return null;
    }
}
