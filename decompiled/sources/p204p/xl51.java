package p204p;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xl51 extends q0f1 {
    /* JADX INFO: renamed from: W */
    public static String m91376W(String str) {
        return btz0.m30489M(new j691(new p39("    ", 7), wl51.m88464N0(str)), "\n");
    }

    /* JADX INFO: renamed from: Z */
    public static String m91377Z(String str) throws IOException {
        int length;
        List listM88465O0 = wl51.m88465O0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM88465O0) {
            if (!wl51.m88460J0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!zn91.m96537Y(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList2.add(Integer.valueOf(length));
        }
        Integer num = (Integer) g6f.m43693G0(arrayList2);
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listM88465O0.size();
        q5s0 q5s0Var = new q5s0(24);
        int iM46714K = h6f.m46714K(listM88465O0);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listM88465O0) {
            int i = length + 1;
            String str3 = null;
            if (length < 0) {
                h6f.m46722S();
                throw null;
            }
            String str4 = (String) obj2;
            if (((length != 0 && length != iM46714K) || !wl51.m88460J0(str4)) && (str3 = (String) q5s0Var.invoke(wl51.m88500x0(iIntValue, str4))) == null) {
                str3 = str4;
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            length = i;
        }
        StringBuilder sb = new StringBuilder(length3);
        g6f.m43752x0(arrayList3, sb, "\n", null, null, null, 124);
        return sb.toString();
    }

    /* JADX INFO: renamed from: d0 */
    public static String m91378d0(String str) {
        if (wl51.m88460J0("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List listM88465O0 = wl51.m88465O0(str);
        int length = str.length();
        listM88465O0.size();
        q5s0 q5s0Var = new q5s0(24);
        int iM46714K = h6f.m46714K(listM88465O0);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listM88465O0) {
            int i2 = i + 1;
            String strSubstring = null;
            if (i < 0) {
                h6f.m46722S();
                throw null;
            }
            String str2 = (String) obj;
            if ((i != 0 && i != iM46714K) || !wl51.m88460J0(str2)) {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!zn91.m96537Y(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1 && str2.startsWith("|", i3)) {
                    strSubstring = str2.substring("|".length() + i3);
                }
                if (strSubstring == null || (strSubstring = (String) q5s0Var.invoke(strSubstring)) == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList.add(strSubstring);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        g6f.m43752x0(arrayList, sb, "\n", null, null, null, 124);
        return sb.toString();
    }
}
