package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class g78 implements uzo0, ssi {

    /* JADX INFO: renamed from: a */
    public final sxp f77208a;

    public g78(sxp sxpVar) {
        this.f77208a = sxpVar;
    }

    @Override // p204p.ssi
    /* JADX INFO: renamed from: a */
    public final void mo24869a() {
        this.f77208a.f214955b.remove(this);
    }

    @Override // p204p.ssi
    /* JADX INFO: renamed from: b */
    public final void mo24870b() {
        this.f77208a.f214955b.add(this);
    }

    @Override // p204p.uzo0
    /* JADX INFO: renamed from: c */
    public final String mo40160c() {
        return "AutomotivePlaybackGrabbingException";
    }

    @Override // p204p.uzo0
    /* JADX INFO: renamed from: d */
    public final iq10 mo40161d(hq10 hq10Var) {
        return hq10Var.mo48193c().getType() == xfr.f261077Z ? iq10.f104600b : iq10.f104601c;
    }
}
