package p204p;

import android.text.TextUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m6f1 {

    /* JADX INFO: renamed from: a */
    public static final ura0 f140509a = new ura0("MetadataUtils", null);

    /* JADX INFO: renamed from: b */
    public static final String[] f140510b;

    /* JADX INFO: renamed from: c */
    public static final String f140511c;

    static {
        String[] strArr = {"Z", "+hh", "+hhmm", "+hh:mm"};
        f140510b = strArr;
        f140511c = "yyyyMMdd'T'HHmmss".concat(String.valueOf(strArr[0]));
    }

    /* JADX INFO: renamed from: a */
    public static void m61011a(List list, JSONArray jSONArray) {
        try {
            list.clear();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    list.add(new kld1(jSONArray.getJSONObject(i)));
                } catch (IllegalArgumentException unused) {
                }
            }
        } catch (JSONException unused2) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    /* JADX WARN: Code duplicated, block: B:17:0x003c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0044  */
    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0058  */
    /* JADX WARN: Code duplicated, block: B:28:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:52:0x0102  */
    /* JADX WARN: Code duplicated, block: B:59:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static Calendar m61012b(String str) {
        String strSubstring;
        int iIndexOf;
        int i;
        String strSubstring2;
        char cCharAt;
        String[] strArr;
        int length;
        String str2;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        ura0 ura0Var = f140509a;
        if (zIsEmpty) {
            ura0Var.m83848a("Input string is empty or null", new Object[0]);
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            ura0Var.m83848a("Input string is empty or null", new Object[0]);
        } else {
            try {
                strSubstring = str.substring(0, 8);
            } catch (IndexOutOfBoundsException unused) {
                ura0Var.m83850c("Error extracting the date", new Object[0]);
                strSubstring = null;
            }
            if (TextUtils.isEmpty(strSubstring)) {
                ura0Var.m83848a("Invalid date format", new Object[0]);
                return null;
            }
            try {
                if (TextUtils.isEmpty(str)) {
                    ura0Var.m83848a("string is empty or null", new Object[0]);
                } else {
                    iIndexOf = str.indexOf(84);
                    i = iIndexOf + 1;
                    if (iIndexOf != 8) {
                        try {
                            strSubstring2 = str.substring(i);
                            if (strSubstring2.length() != 6) {
                                cCharAt = strSubstring2.charAt(6);
                                strArr = f140510b;
                                if (cCharAt != '+' || cCharAt == '-') {
                                    length = strSubstring2.length();
                                    if (length != strArr[1].length() + 6 || length == strArr[2].length() + 6 || length == strArr[3].length() + 6) {
                                        strSubstring2 = strSubstring2.replaceAll("([\\+\\-]\\d\\d):(\\d\\d)", "$1$2");
                                    }
                                } else if (cCharAt == 'Z' && strSubstring2.length() == strArr[0].length() + 6) {
                                    strSubstring2 = String.valueOf(strSubstring2.substring(0, strSubstring2.length() - 1)).concat("+0000");
                                }
                            }
                        } catch (IndexOutOfBoundsException unused2) {
                            ura0Var.m83850c("Error extracting the time substring: %s", new Object[0]);
                        }
                        if (TextUtils.isEmpty(strSubstring2)) {
                            str2 = "yyyyMMdd";
                        } else {
                            strSubstring = dq60.m36618r(new StringBuilder(String.valueOf(strSubstring).length() + 1 + String.valueOf(strSubstring2).length()), strSubstring, "T", strSubstring2);
                            if (strSubstring2.length() == 6) {
                                str2 = "yyyyMMdd'T'HHmmss";
                            } else {
                                str2 = f140511c;
                            }
                        }
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTime(new SimpleDateFormat(str2).parse(strSubstring));
                        return calendar;
                    }
                    ura0Var.m83848a("T delimeter is not found", new Object[0]);
                }
                calendar.setTime(new SimpleDateFormat(str2).parse(strSubstring));
                return calendar;
            } catch (ParseException unused3) {
                ura0Var.m83850c("Error parsing string", new Object[0]);
                return null;
            }
            strSubstring2 = null;
            if (TextUtils.isEmpty(strSubstring2)) {
                strSubstring = dq60.m36618r(new StringBuilder(String.valueOf(strSubstring).length() + 1 + String.valueOf(strSubstring2).length()), strSubstring, "T", strSubstring2);
                if (strSubstring2.length() == 6) {
                    str2 = "yyyyMMdd'T'HHmmss";
                } else {
                    str2 = f140511c;
                }
            } else {
                str2 = "yyyyMMdd";
            }
            Calendar calendar2 = Calendar.getInstance();
        }
        strSubstring = null;
        if (TextUtils.isEmpty(strSubstring)) {
            ura0Var.m83848a("Invalid date format", new Object[0]);
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            ura0Var.m83848a("string is empty or null", new Object[0]);
        } else {
            iIndexOf = str.indexOf(84);
            i = iIndexOf + 1;
            if (iIndexOf != 8) {
                strSubstring2 = str.substring(i);
                if (strSubstring2.length() != 6) {
                    cCharAt = strSubstring2.charAt(6);
                    strArr = f140510b;
                    if (cCharAt != '+') {
                        length = strSubstring2.length();
                        if (length != strArr[1].length() + 6) {
                        }
                        strSubstring2 = strSubstring2.replaceAll("([\\+\\-]\\d\\d):(\\d\\d)", "$1$2");
                    } else {
                        length = strSubstring2.length();
                        if (length != strArr[1].length() + 6) {
                        }
                        strSubstring2 = strSubstring2.replaceAll("([\\+\\-]\\d\\d):(\\d\\d)", "$1$2");
                    }
                }
                if (TextUtils.isEmpty(strSubstring2)) {
                    strSubstring = dq60.m36618r(new StringBuilder(String.valueOf(strSubstring).length() + 1 + String.valueOf(strSubstring2).length()), strSubstring, "T", strSubstring2);
                    if (strSubstring2.length() == 6) {
                        str2 = "yyyyMMdd'T'HHmmss";
                    } else {
                        str2 = f140511c;
                    }
                } else {
                    str2 = "yyyyMMdd";
                }
                Calendar calendar3 = Calendar.getInstance();
                calendar3.setTime(new SimpleDateFormat(str2).parse(strSubstring));
                return calendar3;
            }
            ura0Var.m83848a("T delimeter is not found", new Object[0]);
        }
        strSubstring2 = null;
        if (TextUtils.isEmpty(strSubstring2)) {
            strSubstring = dq60.m36618r(new StringBuilder(String.valueOf(strSubstring).length() + 1 + String.valueOf(strSubstring2).length()), strSubstring, "T", strSubstring2);
            if (strSubstring2.length() == 6) {
                str2 = "yyyyMMdd'T'HHmmss";
            } else {
                str2 = f140511c;
            }
        } else {
            str2 = "yyyyMMdd";
        }
        Calendar calendar4 = Calendar.getInstance();
        calendar4.setTime(new SimpleDateFormat(str2).parse(strSubstring));
        return calendar4;
    }
}
