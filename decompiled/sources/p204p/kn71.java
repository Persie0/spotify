package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class kn71 implements p1y0 {

    /* JADX INFO: renamed from: a */
    public final p1y0 f124324a;

    /* JADX INFO: renamed from: b */
    public final long f124325b;

    public kn71(p1y0 p1y0Var, long j) {
        this.f124324a = p1y0Var;
        this.f124325b = j;
    }

    @Override // p204p.p1y0
    /* JADX INFO: renamed from: a */
    public final int mo41643a(xyx xyxVar, iro iroVar, int i) {
        int iMo41643a = this.f124324a.mo41643a(xyxVar, iroVar, i);
        if (iMo41643a == -4) {
            iroVar.f105020f += this.f124325b;
        }
        return iMo41643a;
    }

    @Override // p204p.p1y0
    /* JADX INFO: renamed from: d */
    public final void mo41645d() {
        this.f124324a.mo41645d();
    }

    @Override // p204p.p1y0
    public final int getFlags() {
        return this.f124324a.getFlags();
    }

    @Override // p204p.p1y0
    public final boolean isReady() {
        return this.f124324a.isReady();
    }

    @Override // p204p.p1y0
    /* JADX INFO: renamed from: s */
    public final int mo41646s(long j) {
        return this.f124324a.mo41646s(j - this.f124325b);
    }
}
