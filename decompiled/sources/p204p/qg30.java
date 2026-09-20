package p204p;

import com.comscore.android.ConnectivityType;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.ErrorInfo;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;

/* JADX INFO: loaded from: classes16.dex */
public final class qg30 {

    /* JADX INFO: renamed from: k */
    public static final MessageDigest f188357k;

    /* JADX INFO: renamed from: a */
    public String f188358a;

    /* JADX INFO: renamed from: b */
    public String f188359b;

    /* JADX INFO: renamed from: c */
    public String[] f188360c;

    /* JADX INFO: renamed from: d */
    public String f188361d;

    /* JADX INFO: renamed from: e */
    public pg30 f188362e;

    /* JADX INFO: renamed from: f */
    public int f188363f = 1;

    /* JADX INFO: renamed from: g */
    public String f188364g;

    /* JADX INFO: renamed from: h */
    public final String f188365h;

    /* JADX INFO: renamed from: i */
    public final String f188366i;

    /* JADX INFO: renamed from: j */
    public final pg30 f188367j;

    static {
        try {
            f188357k = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused) {
        }
    }

    public qg30(String str, String str2, pg30 pg30Var) {
        this.f188365h = str;
        this.f188366i = str2;
        this.f188367j = pg30Var;
    }

    /* JADX INFO: renamed from: a */
    public static String m72725a(byte[] bArr) {
        MessageDigest messageDigest = f188357k;
        messageDigest.reset();
        messageDigest.update(bArr);
        byte[] bArrDigest = messageDigest.digest();
        StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
        for (int i = 0; i < bArrDigest.length; i++) {
            sb.append("0123456789abcdef".charAt((bArrDigest[i] & 240) >> 4));
            sb.append("0123456789abcdef".charAt(bArrDigest[i] & 15));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m72726b(String str) {
        try {
            return m72725a(str.getBytes("ISO-8859-1"));
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m72727d() {
        return m72726b(new SimpleDateFormat("yyyy:MM:dd:hh:mm:ss").format(new Date()) + Integer.valueOf(new Random(100000L).nextInt()).toString()).substring(0, 8);
    }

    /* JADX INFO: renamed from: e */
    public static HashMap m72728e(List list) throws AblyException {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            int iIndexOf = str.indexOf(32);
            if (iIndexOf == -1) {
                throw AblyException.fromErrorInfo(new ErrorInfo("Invalid authenticate header (no delimiter)", ConnectivityType.UNKNOWN, 400));
            }
            String strTrim = str.substring(0, iIndexOf).trim();
            String strTrim2 = str.substring(iIndexOf + 1).trim();
            String strReplace = strTrim.toUpperCase(Locale.ROOT).replace('-', '_');
            try {
                map.put(pg30.valueOf(strReplace), strTrim2);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Failed to parse conformed form '" + strReplace + "' of raw value '" + strTrim + "'.", e);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: f */
    public static HashMap m72729f(String str) {
        HashMap map = new HashMap();
        for (String str2 : str.split(",")) {
            if (str2.contains("=")) {
                map.put(str2.substring(0, str2.indexOf("=")).trim(), str2.substring(str2.indexOf("=") + 1).replaceAll("\"", "").trim());
            }
        }
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0038 A[LOOP:0: B:10:0x0019->B:19:0x0038, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x0036 A[SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public final String m72730c(String str, String str2, byte[] bArr) {
        String str3;
        String strM72726b;
        String strM72727d;
        int iOrdinal = this.f188362e.ordinal();
        String str4 = this.f188365h;
        if (iOrdinal == 0) {
            return "Basic ".concat(vx8.m86644c(str4 + ':' + this.f188366i));
        }
        String str5 = null;
        if (iOrdinal != 1) {
            return null;
        }
        String[] strArr = this.f188360c;
        if (strArr == null) {
            str3 = null;
            break;
        }
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                str3 = null;
                break;
            }
            String str6 = strArr[i];
            if (bArr != null) {
                str3 = "auth-int";
                if (str6.trim().equals("auth-int")) {
                    break;
                }
                if (str6.trim().equals("auth")) {
                    str3 = "auth";
                    break;
                }
                i++;
            } else {
                if (str6.trim().equals("auth")) {
                    str3 = "auth";
                    break;
                }
                i++;
            }
        }
        if (str3 == null) {
            strM72726b = m72726b(this.f188364g + ':' + this.f188359b + ':' + m72726b(str + ':' + str2));
            strM72727d = null;
        } else if (str3.equals("auth")) {
            int i2 = this.f188363f;
            this.f188363f = i2 + 1;
            str5 = String.format("%08X", Integer.valueOf(i2));
            strM72727d = m72727d();
            strM72726b = m72726b(this.f188364g + ':' + this.f188359b + ':' + str5 + ':' + strM72727d + ':' + str3 + ':' + m72726b(str + ':' + str2));
        } else {
            int i3 = this.f188363f;
            this.f188363f = i3 + 1;
            str5 = String.format("%08X", Integer.valueOf(i3));
            String strM72727d2 = m72727d();
            strM72726b = m72726b(this.f188364g + ':' + this.f188359b + ':' + str5 + ':' + strM72727d2 + ':' + str3 + ':' + m72726b(str + ':' + str2 + ':' + m72725a(bArr)));
            strM72727d = strM72727d2;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("Digest username=\"");
        sb.append(str4);
        sb.append("\",realm=\"");
        sb.append(this.f188358a);
        sb.append("\",nonce=\"");
        sb.append(this.f188359b);
        sb.append("\",uri=\"");
        sb.append(str2);
        sb.append("\",algorithm=\"MD5\",");
        if (str3 != null) {
            sb.append("qop=\"");
            sb.append(str3);
            sb.append("\",nc=");
            sb.append(str5);
            sb.append(",cnonce=\"");
            sb.append(strM72727d);
            sb.append("\",");
        }
        if (this.f188361d != null) {
            sb.append("response=\"");
            sb.append(strM72726b);
            sb.append("\",opaque=\"");
            sb.append(this.f188361d);
            sb.append("\"");
        } else {
            sb.append("response=\"");
            sb.append(strM72726b);
            sb.append("\"");
        }
        return sb.toString();
    }
}
