package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class m250 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final boolean f139220a;

    /* JADX INFO: renamed from: b */
    public final erg0 f139221b = new erg0(1);

    /* JADX INFO: renamed from: c */
    public final n7h0 f139222c;

    public m250(boolean z, st91 st91Var) {
        this.f139220a = z;
        this.f139222c = new n7h0(6, st91Var);
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        return this.f139220a ? this.f139221b.mo24361d() : this.f139222c.mo24361d();
    }
}
