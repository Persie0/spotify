package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ed21 extends iy71 {

    /* JADX INFO: renamed from: c */
    public final short f58426c;

    /* JADX INFO: renamed from: d */
    public final short f58427d;

    public ed21(iy71 iy71Var, int i, int i2) {
        super(iy71Var);
        this.f58426c = (short) i;
        this.f58427d = (short) i2;
    }

    @Override // p204p.iy71
    /* JADX INFO: renamed from: a */
    public final void mo38505a(dh9 dh9Var, byte[] bArr) {
        dh9Var.m36000c(this.f58426c, this.f58427d);
    }

    public final String toString() {
        short s = this.f58427d;
        return "<" + Integer.toBinaryString((1 << s) | (((1 << s) - 1) & this.f58426c) | (1 << s)).substring(1) + '>';
    }
}
