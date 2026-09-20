package p204p;

import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class h6h1 {

    /* JADX INFO: renamed from: b */
    public static final h6h1 f88098b = new h6h1(new byte[0]);

    /* JADX INFO: renamed from: a */
    public final byte[] f88099a;

    public h6h1(byte[] bArr) {
        this.f88099a = bArr;
    }

    /* JADX INFO: renamed from: e */
    public static h6h1 m46724e(byte[] bArr) {
        byte[] bArr2;
        int length = bArr.length;
        if (length == 0) {
            bArr2 = new byte[0];
        } else {
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, 0, bArr3, 0, length);
            bArr2 = bArr3;
        }
        return new h6h1(bArr2);
    }

    /* JADX INFO: renamed from: f */
    public static int m46725f(byte b) {
        int[] iArr = {358984857, 11257410, 369424407, 615188036, 873771167, 1734030349, 488663950, 1985433483, 395279207};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        return b & ((iArr[7] % 395279207) ^ t3d1.m79992g((i2 & (~i)) | i3, (i & i4) | i5, i6, i7));
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m46726a() {
        byte[] bArr = this.f88099a;
        int length = bArr.length;
        if (length == 0) {
            return new byte[0];
        }
        if (length == 0) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    /* JADX INFO: renamed from: b */
    public final byte m46727b(int i) {
        int i2 = ((((~1635905385) & 436500160) | 1627617040) + ((1635905385 & 1527677400) | 1092341018)) - (-1251599269);
        int i3 = 1253207672 % 570073850;
        int i4 = ((((~1280321648) & 1509448256) | 1074834751) + ((1280321648 & 434689637) | 67544103)) - 1396684710;
        int i5 = 1309383303 % 1129033333;
        byte[] bArr = this.f88099a;
        int length = bArr.length;
        if (((length - (i + 1)) | i) >= 0) {
            return bArr[i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + (i2 ^ i3));
            sb.append(u2h1.m82254a("Akelqh1fajntGgo="));
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(length).length() + String.valueOf(i).length() + (i4 ^ i5));
        sb2.append(u2h1.m82254a("Akelqh1faDmxRUSK1T9GeQ=="));
        sb2.append(i);
        sb2.append(u2h1.m82254a("Zwk="));
        sb2.append(length);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    /* JADX INFO: renamed from: c */
    public final String m46728c() {
        Charset charsetForName = Charset.forName(u2h1.m82254a("Hn2H4l0="));
        byte[] bArr = this.f88099a;
        return new String(bArr, 0, bArr.length, charsetForName);
    }

    /* JADX INFO: renamed from: d */
    public final h6h1 m46729d(h6h1 h6h1Var) {
        byte[] bArr = h6h1Var.f88099a;
        int length = bArr.length;
        byte[] bArr2 = this.f88099a;
        int length2 = bArr2.length;
        byte[] bArr3 = new byte[length2 + length];
        System.arraycopy(bArr2, 0, bArr3, 0, length2);
        System.arraycopy(bArr, 0, bArr3, length2, length);
        return m46724e(bArr3);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h6h1) {
            return Arrays.equals(this.f88099a, ((h6h1) obj).f88099a);
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(Arrays.hashCode(this.f88099a));
    }

    public final String toString() {
        int[] iArr = {95266356, 568641516, 183483904, 553669100, 504469011, 966284502, 91904737, 2026478004, 1659239833};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int iM79992g = t3d1.m79992g((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        String string = Arrays.toString(this.f88099a);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + ((i8 % 1659239833) ^ iM79992g));
        sb.append(u2h1.m82254a("CVC1qiQNJHikW0iU1TIPZA=="));
        sb.append(string);
        sb.append(u2h1.m82254a("Ng=="));
        return sb.toString();
    }
}
