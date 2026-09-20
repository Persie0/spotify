package p204p;

import com.google.zxing.FormatException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gs91 extends g9g1 {

    /* JADX INFO: renamed from: e */
    public static final int[] f83915e = {1, 1, 1};

    /* JADX INFO: renamed from: f */
    public static final int[] f83916f = {1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: g */
    public static final int[] f83917g = {1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: h */
    public static final int[][] f83918h;

    /* JADX INFO: renamed from: i */
    public static final int[][] f83919i;

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f83918h = iArr;
        int[][] iArr2 = new int[20][];
        f83919i = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr3 = f83918h[i - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i2 = 0; i2 < iArr3.length; i2++) {
                iArr4[i2] = iArr3[(iArr3.length - i2) - 1];
            }
            f83919i[i] = iArr4;
        }
    }

    /* JADX INFO: renamed from: q */
    public static boolean m45625q(String str) {
        int length = str.length();
        if (length != 0) {
            int i = length - 1;
            if (m45626r(str.subSequence(0, i)) == Character.digit(str.charAt(i), 10)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public static int m45626r(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 1; i2 >= 0; i2 -= 2) {
            int iCharAt = charSequence.charAt(i2) - '0';
            if (iCharAt < 0 || iCharAt > 9) {
                throw FormatException.m2222a();
            }
            i += iCharAt;
        }
        int i3 = i * 3;
        for (int i4 = length - 2; i4 >= 0; i4 -= 2) {
            int iCharAt2 = charSequence.charAt(i4) - '0';
            if (iCharAt2 < 0 || iCharAt2 > 9) {
                throw FormatException.m2222a();
            }
            i3 += iCharAt2;
        }
        return (1000 - i3) % 10;
    }
}
