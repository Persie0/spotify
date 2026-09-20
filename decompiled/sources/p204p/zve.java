package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class zve extends j9g1 {

    /* JADX INFO: renamed from: e */
    public static final char[] f286694e;

    /* JADX INFO: renamed from: f */
    public static final char[] f286695f = {'T', 'N', '*', 'E'};

    /* JADX INFO: renamed from: g */
    public static final char[] f286696g = {'/', ':', '+', '.'};

    /* JADX INFO: renamed from: h */
    public static final char f286697h;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        f286694e = cArr;
        f286697h = cArr[0];
    }

    @Override // p204p.j9g1
    /* JADX INFO: renamed from: i */
    public final boolean[] mo33506i(String str) {
        int i;
        int length = str.length();
        char c = f286697h;
        if (length < 2) {
            str = c + str + c;
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = f286694e;
            boolean zM94693q = yve.m94693q(cArr, upperCase);
            boolean zM94693q2 = yve.m94693q(cArr, upperCase2);
            char[] cArr2 = f286695f;
            boolean zM94693q3 = yve.m94693q(cArr2, upperCase);
            boolean zM94693q4 = yve.m94693q(cArr2, upperCase2);
            if (zM94693q) {
                if (!zM94693q2) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (!zM94693q3) {
                if (zM94693q2 || zM94693q4) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
                str = c + str + c;
            } else if (!zM94693q4) {
                throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
            }
        }
        int i2 = 20;
        for (int i3 = 1; i3 < str.length() - 1; i3++) {
            if (Character.isDigit(str.charAt(i3)) || str.charAt(i3) == '-' || str.charAt(i3) == '$') {
                i2 += 9;
            } else {
                if (!yve.m94693q(f286696g, str.charAt(i3))) {
                    throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i3) + '\'');
                }
                i2 += 10;
            }
        }
        boolean[] zArr = new boolean[(str.length() - 1) + i2];
        int i4 = 0;
        for (int i5 = 0; i5 < str.length(); i5++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i5));
            if (i5 == 0 || i5 == str.length() - 1) {
                if (upperCase3 == '*') {
                    upperCase3 = 'C';
                } else if (upperCase3 == 'E') {
                    upperCase3 = 'D';
                } else if (upperCase3 == 'N') {
                    upperCase3 = 'B';
                } else if (upperCase3 == 'T') {
                    upperCase3 = 'A';
                }
            }
            int i6 = 0;
            while (true) {
                char[] cArr3 = yve.f276652e;
                if (i6 >= cArr3.length) {
                    i = 0;
                    break;
                }
                if (upperCase3 == cArr3[i6]) {
                    i = yve.f276653f[i6];
                    break;
                }
                i6++;
            }
            int i7 = 0;
            int i8 = 0;
            boolean z = true;
            while (i7 < 7) {
                zArr[i4] = z;
                i4++;
                if (((i >> (6 - i7)) & 1) == 0 || i8 == 1) {
                    z = !z;
                    i7++;
                    i8 = 0;
                } else {
                    i8++;
                }
            }
            if (i5 < str.length() - 1) {
                zArr[i4] = false;
                i4++;
            }
        }
        return zArr;
    }
}
