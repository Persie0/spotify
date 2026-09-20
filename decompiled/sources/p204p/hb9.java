package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class hb9 implements kb9 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sir0 f89451a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nlv0 f89452b;

    public hb9(sir0 sir0Var, nlv0 nlv0Var) {
        this.f89451a = sir0Var;
        this.f89452b = nlv0Var;
    }

    @Override // p204p.kb9
    /* JADX INFO: renamed from: c */
    public final void mo35544c(long j, int i, String str) {
        sir0 sir0Var = this.f89451a;
        if (i == 3) {
            sir0Var.mo30231j(new g59(j));
        }
        if (i == 4) {
            if (!this.f89452b.f155174a) {
                sir0Var.mo30231j(new c59(new j59(j)));
            }
            sir0Var.mo30210A(null);
        }
    }

    @Override // p204p.kb9
    /* JADX INFO: renamed from: d */
    public final void mo47019d(j59 j59Var) {
        this.f89452b.f155174a = true;
        this.f89451a.mo30231j(new c59(j59Var));
    }

    @Override // p204p.kb9
    /* JADX INFO: renamed from: e */
    public final void mo47020e(int i, int i2) {
        this.f89451a.mo30231j(new f59(i, i2));
    }

    @Override // p204p.kb9
    /* JADX INFO: renamed from: h */
    public final void mo47021h(int i, hy81 hy81Var) {
        this.f89451a.mo30231j(new e59(i, hy81Var));
    }

    @Override // p204p.kb9
    /* JADX INFO: renamed from: i */
    public final void mo47022i(h49 h49Var) {
        this.f89451a.mo30231j(new d59(h49Var));
    }
}
