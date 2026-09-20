package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class stc {

    /* JADX INFO: renamed from: a */
    public static final char[] f213883a = new char[117];

    /* JADX INFO: renamed from: b */
    public static final byte[] f213884b = new byte[126];

    static {
        for (int i = 0; i < 32; i++) {
        }
        m79238a('b', 8);
        m79238a('t', 9);
        m79238a('n', 10);
        m79238a('f', 12);
        m79238a('r', 13);
        m79238a('/', 47);
        m79238a('\"', 34);
        m79238a('\\', 92);
        byte[] bArr = f213884b;
        for (int i2 = 0; i2 < 33; i2++) {
            bArr[i2] = 127;
        }
        bArr[9] = 3;
        bArr[10] = 3;
        bArr[13] = 3;
        bArr[32] = 3;
        bArr[44] = 4;
        bArr[58] = 5;
        bArr[123] = 6;
        bArr[125] = 7;
        bArr[91] = 8;
        bArr[93] = 9;
        bArr[34] = 1;
        bArr[92] = 2;
    }

    /* JADX INFO: renamed from: a */
    public static void m79238a(char c, int i) {
        if (c != 'u') {
            f213883a[c] = (char) i;
        }
    }
}
