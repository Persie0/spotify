package p204p;

import android.os.Build;
import com.spotify.voiceassistants.playermodels.SearchEndpointResponseKt;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public abstract class tx8 {

    /* JADX INFO: renamed from: d */
    public static int f224599d = 5;

    /* JADX INFO: renamed from: a */
    public static final byte[] f224596a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* JADX INFO: renamed from: b */
    public static final byte[] f224597b = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* JADX INFO: renamed from: c */
    public static final byte[] f224598c = {45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};

    /* JADX INFO: renamed from: e */
    public static final C1761d0 f224600e = new C1761d0();

    /* JADX INFO: renamed from: f */
    public static final String[] f224601f = {"", "", "VERBOSE", "DEBUG", "INFO", "WARN", SearchEndpointResponseKt.RESULT_ERROR, "ASSERT"};

    /* JADX INFO: renamed from: a */
    public static String m81886a(Map map, C1761d0 c1761d0) {
        StringBuilder sb = new StringBuilder("ably-java/1.2.38");
        String[] strArr = ejq.f60272a;
        if (map != null && !map.isEmpty()) {
            sb.append(" ");
            StringBuilder sb2 = new StringBuilder();
            for (String str : map.keySet()) {
                String str2 = (String) map.get(str);
                sb2.append(str);
                if (str2 != null) {
                    sb2.append("/");
                    sb2.append(str2);
                }
                sb2.append(" ");
            }
            sb.append(sb2.toString().trim());
        }
        c1761d0.getClass();
        String str3 = "android/" + Build.VERSION.SDK_INT;
        if (str3 != null) {
            sb.append(" ");
            sb.append(str3);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static C1880g0 m81887b(n6n0 n6n0Var) {
        return new C1880g0(n6n0Var);
    }

    /* JADX INFO: renamed from: c */
    public static void m81888c(String str, String str2) {
        m81896k(3, str, str2, null);
    }

    /* JADX INFO: renamed from: d */
    public static void m81889d(String str, String str2) {
        m81896k(6, str, str2, null);
    }

    /* JADX INFO: renamed from: e */
    public static void m81890e(String str, String str2, Throwable th) {
        m81896k(6, str, str2, th);
    }

    /* JADX INFO: renamed from: f */
    public static void m81891f(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        byte[] bArr3;
        if ((i4 & 16) == 16) {
            bArr3 = f224597b;
        } else {
            bArr3 = (i4 & 32) == 32 ? f224598c : f224596a;
        }
        int i5 = (i2 > 1 ? (bArr[i + 1] << 24) >>> 16 : 0) | (i2 > 0 ? (bArr[i] << 24) >>> 8 : 0) | (i2 > 2 ? (bArr[i + 2] << 24) >>> 24 : 0);
        if (i2 == 1) {
            bArr2[i3] = bArr3[i5 >>> 18];
            bArr2[i3 + 1] = bArr3[(i5 >>> 12) & 63];
            bArr2[i3 + 2] = 61;
            bArr2[i3 + 3] = 61;
            return;
        }
        if (i2 == 2) {
            bArr2[i3] = bArr3[i5 >>> 18];
            bArr2[i3 + 1] = bArr3[(i5 >>> 12) & 63];
            bArr2[i3 + 2] = bArr3[(i5 >>> 6) & 63];
            bArr2[i3 + 3] = 61;
            return;
        }
        if (i2 != 3) {
            return;
        }
        bArr2[i3] = bArr3[i5 >>> 18];
        bArr2[i3 + 1] = bArr3[(i5 >>> 12) & 63];
        bArr2[i3 + 2] = bArr3[(i5 >>> 6) & 63];
        bArr2[i3 + 3] = bArr3[i5 & 63];
    }

    /* JADX INFO: renamed from: g */
    public static String m81892g(byte[] bArr, int i) {
        if (bArr == null) {
            throw new IllegalArgumentException("Cannot serialize a null array.");
        }
        if (i < 0) {
            throw new IllegalArgumentException("Cannot have length offset: " + i);
        }
        if (i > bArr.length) {
            throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", 0, Integer.valueOf(i), Integer.valueOf(bArr.length)));
        }
        int i2 = ((i / 3) * 4) + (i % 3 <= 0 ? 0 : 4);
        byte[] bArr2 = new byte[i2];
        int i3 = i - 2;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            m81891f(bArr, i4, 3, bArr2, i5, 0);
            i4 += 3;
            i5 += 4;
        }
        if (i4 < i) {
            m81891f(bArr, i4, i - i4, bArr2, i5, 0);
            i5 += 4;
        }
        if (i5 <= i2 - 1) {
            byte[] bArr3 = new byte[i5];
            System.arraycopy(bArr2, 0, bArr3, 0, i5);
            bArr2 = bArr3;
        }
        try {
            return new String(bArr2, "US-ASCII");
        } catch (UnsupportedEncodingException unused) {
            return new String(bArr2);
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m81893h(int i, long j) {
        return Double.valueOf(j * (1.0d - (Math.random() * 0.2d)) * ((double) Math.min((i + 2) / 3.0f, 2.0f))).intValue();
    }

    /* JADX INFO: renamed from: i */
    public static void m81894i(String str, String str2) {
        m81896k(4, str, str2, null);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m81895j(String str) {
        return str == null || str.isEmpty();
    }

    /* JADX INFO: renamed from: k */
    public static void m81896k(int i, String str, String str2, Throwable th) {
        if (i >= f224599d) {
            PrintStream printStream = System.out;
            printStream.print("(" + f224601f[i] + "): ");
            if (str != null && str.length() != 0) {
                printStream.print(str.concat(": "));
            }
            if (str2 != null && str2.length() != 0) {
                printStream.print(str2);
            }
            printStream.println();
            if (th != null) {
                th.printStackTrace(printStream);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m81897l(String str, String str2) {
        m81896k(2, str, str2, null);
    }

    /* JADX INFO: renamed from: m */
    public static void m81898m(NoSuchMethodError noSuchMethodError) {
        m81896k(5, "p.yld1", "Error when trying to set SSL parameters, most likely due to an old Java API version", noSuchMethodError);
    }
}
