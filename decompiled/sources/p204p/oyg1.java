package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class oyg1 extends ryg1 implements Serializable {

    /* JADX INFO: renamed from: b */
    public final long f171764b;

    public oyg1(long j) {
        this.f171764b = j;
    }

    @Override // p204p.ryg1
    /* JADX INFO: renamed from: a */
    public final int mo63196a() {
        return 64;
    }

    @Override // p204p.ryg1
    /* JADX INFO: renamed from: b */
    public final byte[] mo63197b() {
        long j = this.f171764b;
        return new byte[]{(byte) j, (byte) (j >> 8), (byte) (j >> 16), (byte) (j >> 24), (byte) (j >> 32), (byte) (j >> 40), (byte) (j >> 48), (byte) (j >> 56)};
    }

    @Override // p204p.ryg1
    /* JADX INFO: renamed from: c */
    public final int mo63198c() {
        return (int) this.f171764b;
    }

    @Override // p204p.ryg1
    /* JADX INFO: renamed from: d */
    public final long mo63199d() {
        return this.f171764b;
    }

    @Override // p204p.ryg1
    /* JADX INFO: renamed from: f */
    public final boolean mo63201f(ryg1 ryg1Var) {
        return this.f171764b == ryg1Var.mo63199d();
    }
}
