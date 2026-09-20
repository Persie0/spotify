package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class md20 extends nd20 implements Serializable {

    /* JADX INFO: renamed from: b */
    public final long f142293b;

    public md20(long j) {
        this.f142293b = j;
    }

    @Override // p204p.nd20
    /* JADX INFO: renamed from: a */
    public final byte[] mo56150a() {
        long j = this.f142293b;
        return new byte[]{(byte) j, (byte) (j >> 8), (byte) (j >> 16), (byte) (j >> 24), (byte) (j >> 32), (byte) (j >> 40), (byte) (j >> 48), (byte) (j >> 56)};
    }

    @Override // p204p.nd20
    /* JADX INFO: renamed from: b */
    public final int mo56151b() {
        return (int) this.f142293b;
    }

    @Override // p204p.nd20
    /* JADX INFO: renamed from: c */
    public final long mo56152c() {
        return this.f142293b;
    }

    @Override // p204p.nd20
    /* JADX INFO: renamed from: d */
    public final int mo56153d() {
        return 64;
    }

    @Override // p204p.nd20
    /* JADX INFO: renamed from: e */
    public final boolean mo56154e(nd20 nd20Var) {
        return this.f142293b == nd20Var.mo56152c();
    }
}
