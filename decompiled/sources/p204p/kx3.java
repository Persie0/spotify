package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class kx3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final int f127320a;

    /* JADX INFO: renamed from: b */
    public final bji f127321b;

    /* JADX INFO: renamed from: c */
    public final wg61 f127322c = new wg61(new ju3(this, 24));

    public kx3(int i, bji bjiVar) {
        this.f127320a = i;
        this.f127321b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final int m57583a() {
        kx3 kx3Var = (kx3) this.f127322c.getValue();
        return kx3Var != null ? kx3Var.m57583a() : this.f127320a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("player_pool_size", "android-betamax-playerpool", m57583a(), 0, 1000000));
    }
}
