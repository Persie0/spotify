package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class ld20 extends nd20 implements Serializable {

    /* JADX INFO: renamed from: b */
    public final int f132030b;

    public ld20(int i) {
        this.f132030b = i;
    }

    @Override // p204p.nd20
    /* JADX INFO: renamed from: a */
    public final byte[] mo56150a() {
        int i = this.f132030b;
        return new byte[]{(byte) i, (byte) (i >> 8), (byte) (i >> 16), (byte) (i >> 24)};
    }

    @Override // p204p.nd20
    /* JADX INFO: renamed from: b */
    public final int mo56151b() {
        return this.f132030b;
    }

    @Override // p204p.nd20
    /* JADX INFO: renamed from: c */
    public final long mo56152c() {
        throw new IllegalStateException("this HashCode only has 32 bits; cannot create a long");
    }

    @Override // p204p.nd20
    /* JADX INFO: renamed from: d */
    public final int mo56153d() {
        return 32;
    }

    @Override // p204p.nd20
    /* JADX INFO: renamed from: e */
    public final boolean mo56154e(nd20 nd20Var) {
        return this.f132030b == nd20Var.mo56151b();
    }
}
