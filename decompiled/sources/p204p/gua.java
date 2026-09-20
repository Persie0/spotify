package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class gua {

    /* JADX INFO: renamed from: c */
    public static final int[] f84421c;

    /* JADX INFO: renamed from: a */
    public byte[] f84422a = new byte[32];

    /* JADX INFO: renamed from: b */
    public int f84423b;

    static {
        int[] iArr = new int[65];
        for (int i = 0; i < 65; i++) {
            iArr[i] = (63 - i) / 7;
        }
        f84421c = iArr;
    }

    /* JADX INFO: renamed from: a */
    public final void m45731a(int i, long j) {
        for (int i2 = 0; i2 < i; i2++) {
            this.f84422a[this.f84423b + i2] = (byte) ((127 & j) | 128);
            j >>>= 7;
        }
        byte[] bArr = this.f84422a;
        int i3 = this.f84423b;
        bArr[i3 + i] = (byte) j;
        this.f84423b = i + 1 + i3;
    }

    /* JADX INFO: renamed from: b */
    public final void m45732b(int i) {
        int i2 = this.f84423b + i;
        if (i2 <= this.f84422a.length) {
            return;
        }
        byte[] bArr = new byte[Integer.highestOneBit(i2) << 1];
        bk5.m29634s0(0, 0, 14, this.f84422a, bArr);
        this.f84422a = bArr;
    }

    /* JADX INFO: renamed from: c */
    public final void m45733c(int i) {
        m45732b(4);
        for (int i2 = 3; -1 < i2; i2--) {
            byte[] bArr = this.f84422a;
            int i3 = this.f84423b;
            this.f84423b = i3 + 1;
            bArr[i3] = (byte) (i >> (i2 * 8));
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m45734d(long j) {
        m45732b(8);
        for (int i = 7; -1 < i; i--) {
            byte[] bArr = this.f84422a;
            int i2 = this.f84423b;
            this.f84423b = i2 + 1;
            bArr[i2] = (byte) (j >> (i * 8));
        }
    }
}
