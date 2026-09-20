package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class k3o0 implements vfj0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ l3o0 f118943a;

    public k3o0(l3o0 l3o0Var) {
        this.f118943a = l3o0Var;
    }

    @Override // p204p.vfj0
    /* JADX INFO: renamed from: S0 */
    public final Object mo25862S0(long j, long j2, fbk fbkVar) {
        if (m5b1.m60855e(j2) > 0.0f) {
            this.f118943a.f129404a.f34106b.m84032w(0.0f);
        }
        return new m5b1(0L);
    }

    @Override // p204p.vfj0
    /* JADX INFO: renamed from: k0 */
    public final long mo25863k0(int i, long j, long j2) {
        l3o0 l3o0Var = this.f118943a;
        if (!((Boolean) l3o0Var.f129405b.invoke()).booleanValue()) {
            return 0L;
        }
        c581 c581Var = l3o0Var.f129404a;
        c581Var.f34106b.m84032w(Float.intBitsToFloat((int) (j & 4294967295L)) + c581Var.f34106b.m84031v());
        return 0L;
    }
}
