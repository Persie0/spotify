package p204p;

/* JADX INFO: loaded from: classes16.dex */
public final class p1b1 implements Cloneable {

    /* JADX INFO: renamed from: h */
    public static final xra0 f173028h = bsa0.m30425b(p1b1.class);

    /* JADX INFO: renamed from: i */
    public static final p1b1 f173029i;

    /* JADX INFO: renamed from: t */
    public static final int f173030t;

    /* JADX INFO: renamed from: a */
    public final byte[] f173031a;

    /* JADX INFO: renamed from: b */
    public final byte[] f173032b;

    /* JADX INFO: renamed from: c */
    public final byte[] f173033c;

    /* JADX INFO: renamed from: d */
    public final byte[] f173034d;

    /* JADX INFO: renamed from: e */
    public final byte[] f173035e;

    /* JADX INFO: renamed from: f */
    public final byte[] f173036f;

    /* JADX INFO: renamed from: g */
    public volatile byte[] f173037g;

    static {
        p1b1 p1b1Var = new p1b1(new byte[]{2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3}, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1}, new byte[]{0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 0, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 0, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 0, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 0, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 0, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 0, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 0, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 0, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 0, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4}, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 1, 1, 1, 1, 1, 1, 1, 1, 1}, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8}, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        f173029i = p1b1Var;
        f173030t = p1b1Var.m68784c().length;
    }

    public p1b1() {
        this.f173031a = new byte[256];
        this.f173032b = new byte[256];
        this.f173033c = new byte[256];
        this.f173034d = new byte[256];
        this.f173035e = new byte[256];
        this.f173036f = new byte[256];
        this.f173037g = null;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m68783b(int i, short s, short s2, short s3, short s4, String str) {
        boolean z;
        xra0 xra0Var = f173028h;
        if (s > 3 || s < 0) {
            xra0Var.mo27135f("VCDiff: Bad code table; opcode {} has invalid {} instruction type {}", Integer.valueOf(i), str, Short.valueOf(s));
            z = false;
        } else {
            z = true;
        }
        if (s3 > s4 || s3 < 0) {
            xra0Var.mo27135f("VCDiff: Bad code table; opcode {} has invalid {} mode {}", Integer.valueOf(i), str, Short.valueOf(s3));
            z = false;
        }
        if (s == 0 && s2 != 0) {
            xra0Var.mo27135f("VCDiff: Bad code table; opcode {} has {} instruction NOOP with nonzero size {}", Integer.valueOf(i), str, Short.valueOf(s2));
            z = false;
        }
        if (s2 < 0) {
            xra0Var.mo27135f("VCDiff: Bad code table; opcode {} has {} instruction with size less than zero {}", Integer.valueOf(i), str, Short.valueOf(s2));
            z = false;
        }
        if (s == 3 || s3 == 0) {
            return z;
        }
        xra0Var.mo27135f("VCDiff: Bad code table; opcode {} has non-COPY {} instruction with nonzero mode {}", Integer.valueOf(i), str, Short.valueOf(s3));
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m68784c() {
        if (this.f173037g == null) {
            synchronized (this) {
                try {
                    if (this.f173037g == null) {
                        this.f173037g = new byte[this.f173031a.length + this.f173032b.length + this.f173033c.length + this.f173034d.length + this.f173035e.length + this.f173036f.length];
                        System.arraycopy(this.f173031a, 0, this.f173037g, 0, this.f173031a.length);
                        int length = this.f173031a.length;
                        System.arraycopy(this.f173032b, 0, this.f173037g, length, this.f173032b.length);
                        int length2 = length + this.f173032b.length;
                        System.arraycopy(this.f173033c, 0, this.f173037g, length2, this.f173033c.length);
                        int length3 = length2 + this.f173033c.length;
                        System.arraycopy(this.f173034d, 0, this.f173037g, length3, this.f173034d.length);
                        int length4 = length3 + this.f173034d.length;
                        System.arraycopy(this.f173035e, 0, this.f173037g, length4, this.f173035e.length);
                        System.arraycopy(this.f173036f, 0, this.f173037g, length4 + this.f173035e.length, this.f173036f.length);
                        int length5 = this.f173036f.length;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f173037g;
    }

    public final Object clone() {
        return new p1b1(this.f173031a, this.f173032b, this.f173033c, this.f173034d, this.f173035e, this.f173036f);
    }

    public p1b1(byte[] bArr) {
        byte[] bArr2 = new byte[256];
        this.f173031a = bArr2;
        byte[] bArr3 = new byte[256];
        this.f173032b = bArr3;
        byte[] bArr4 = new byte[256];
        this.f173033c = bArr4;
        byte[] bArr5 = new byte[256];
        this.f173034d = bArr5;
        byte[] bArr6 = new byte[256];
        this.f173035e = bArr6;
        byte[] bArr7 = new byte[256];
        this.f173036f = bArr7;
        this.f173037g = null;
        if (bArr.length == bArr2.length + bArr3.length + bArr4.length + bArr5.length + bArr6.length + bArr7.length) {
            System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
            int length = bArr2.length;
            System.arraycopy(bArr, length, bArr3, 0, bArr3.length);
            int length2 = length + bArr3.length;
            System.arraycopy(bArr, length2, bArr4, 0, bArr4.length);
            int length3 = length2 + bArr4.length;
            System.arraycopy(bArr, length3, bArr5, 0, bArr5.length);
            int length4 = length3 + bArr5.length;
            System.arraycopy(bArr, length4, bArr6, 0, bArr6.length);
            System.arraycopy(bArr, length4 + bArr6.length, bArr7, 0, bArr7.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    public p1b1(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        byte[] bArr7 = new byte[256];
        this.f173031a = bArr7;
        byte[] bArr8 = new byte[256];
        this.f173032b = bArr8;
        byte[] bArr9 = new byte[256];
        this.f173033c = bArr9;
        byte[] bArr10 = new byte[256];
        this.f173034d = bArr10;
        byte[] bArr11 = new byte[256];
        this.f173035e = bArr11;
        byte[] bArr12 = new byte[256];
        this.f173036f = bArr12;
        this.f173037g = null;
        if (bArr.length == 256 && bArr2.length == 256 && bArr3.length == 256 && bArr4.length == 256 && bArr5.length == 256 && bArr6.length == 256) {
            System.arraycopy(bArr, 0, bArr7, 0, 256);
            System.arraycopy(bArr2, 0, bArr8, 0, 256);
            System.arraycopy(bArr3, 0, bArr9, 0, 256);
            System.arraycopy(bArr4, 0, bArr10, 0, 256);
            System.arraycopy(bArr5, 0, bArr11, 0, 256);
            System.arraycopy(bArr6, 0, bArr12, 0, 256);
            return;
        }
        throw new IllegalArgumentException();
    }
}
