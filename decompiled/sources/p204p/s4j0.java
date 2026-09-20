package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class s4j0 implements zb80 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ta80 f205607a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hqb f205608b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ y800 f205609c;

    public s4j0(ta80 ta80Var, hqb hqbVar, y800 y800Var) {
        this.f205607a = ta80Var;
        this.f205608b = hqbVar;
        this.f205609c = y800Var;
    }

    @Override // p204p.zb80
    /* JADX INFO: renamed from: y */
    public final void mo26206y(hc80 hc80Var, ta80 ta80Var) {
        if (ta80Var == this.f205607a) {
            this.f205608b.resumeWith(Boolean.TRUE);
            y800 y800Var = this.f205609c;
            y800Var.m93034b();
            y800Var.f270161e.mo31988d(this);
        }
    }
}
