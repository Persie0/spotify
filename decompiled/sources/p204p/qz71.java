package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class qz71 implements f7x0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f194140a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f194141b;

    public /* synthetic */ qz71(Object obj, int i) {
        this.f194140a = i;
        this.f194141b = obj;
    }

    @Override // p204p.f7x0
    /* JADX INFO: renamed from: e */
    public final void mo29825e(c7x0 c7x0Var) {
        switch (this.f194140a) {
            case 0:
                if (c7x0Var instanceof n6x0) {
                    ((rz71) this.f194141b).f204087d.mo30231j(new gfb0(((rg70) ((n6x0) c7x0Var).f150980a).f198883a));
                }
                break;
            default:
                pe91 pe91Var = (pe91) this.f194141b;
                c8r c8rVar = c7x0Var instanceof n6x0 ? ((a8r) ((n6x0) c7x0Var).f150980a).f13344a : c8r.f35307c;
                hqb hqbVar = pe91Var.f176686m;
                if (hqbVar != null) {
                    hqbVar.resumeWith(c8rVar);
                }
                pe91Var.f176686m = null;
                break;
        }
    }
}
