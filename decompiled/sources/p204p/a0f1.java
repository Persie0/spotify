package p204p;

import androidx.car.app.model.Alert;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a0f1 {

    /* JADX INFO: renamed from: a */
    public static final byte[] f11072a = new byte[0];

    /* JADX INFO: renamed from: b */
    public static final hvl0 f11073b = vbg1.m85153x(a7j0.m24943A("efbbbf"), a7j0.m24943A("feff"), a7j0.m24943A("fffe0000"), a7j0.m24943A("fffe"), a7j0.m24943A("0000feff"));

    /* JADX INFO: renamed from: a */
    public static final void m24340a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder sbM77254m = s571.m77254m(j, "length=", ", offset=");
            sbM77254m.append(j2);
            sbM77254m.append(", count=");
            sbM77254m.append(j2);
            throw new ArrayIndexOutOfBoundsException(sbM77254m.toString());
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m24341b(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m24342c(ywy ywyVar, tbn0 tbn0Var) throws IOException {
        try {
            IOException iOException = null;
            for (tbn0 tbn0Var2 : ywyVar.mo40345g(tbn0Var)) {
                try {
                    if (whg1.m88142o(ywyVar, tbn0Var2).f116737b) {
                        m24342c(ywyVar, tbn0Var2);
                    }
                    ywyVar.mo40344f(tbn0Var2);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    public static final int m24343d(char c, int i, int i2, String str) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: e */
    public static final int m24344e(int i, String str, int i2, String str2) {
        while (i < i2) {
            if (wl51.m88497u0(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ int m24345f(String str, char c, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return m24343d(c, i, i2, str);
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m24346g(String[] strArr, String[] strArr2, Comparator comparator) {
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static final int m24347h(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (wj50.m88282u(cCharAt, 31) <= 0 || wj50.m88282u(cCharAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: i */
    public static final int m24348i(int i, int i2, String str) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: j */
    public static final int m24349j(int i, int i2, String str) {
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char cCharAt = str.charAt(i3);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: k */
    public static final String[] m24350k(String[] strArr, String[] strArr2, Comparator comparator) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : strArr2) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m24351l(String str) {
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    /* JADX INFO: renamed from: m */
    public static final int m24352m(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' > c || c >= 'G') {
            return -1;
        }
        return c - '7';
    }

    /* JADX INFO: renamed from: n */
    public static final int m24353n(gqa gqaVar) {
        return (gqaVar.readByte() & 255) | ((gqaVar.readByte() & 255) << 16) | ((gqaVar.readByte() & 255) << 8);
    }

    /* JADX INFO: renamed from: o */
    public static final int m24354o(int i, String str) {
        if (str == null) {
            return i;
        }
        try {
            long j = Long.parseLong(str);
            if (j > 2147483647L) {
                return Alert.DURATION_SHOW_INDEFINITELY;
            }
            if (j < 0) {
                return 0;
            }
            return (int) j;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* JADX INFO: renamed from: p */
    public static final String m24355p(int i, int i2, String str) {
        int iM24348i = m24348i(i, i2, str);
        return str.substring(iM24348i, m24349j(iM24348i, i2, str));
    }
}
