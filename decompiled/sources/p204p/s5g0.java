package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class s5g0 implements f7x0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f205825a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t5g0 f205826b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b3g0 f205827c;

    public /* synthetic */ s5g0(t5g0 t5g0Var, b3g0 b3g0Var, int i) {
        this.f205825a = i;
        this.f205826b = t5g0Var;
        this.f205827c = b3g0Var;
    }

    @Override // p204p.f7x0
    /* JADX INFO: renamed from: e */
    public final void mo29825e(c7x0 c7x0Var) {
        switch (this.f205825a) {
            case 0:
                this.f205826b.f217299c = false;
                if (c7x0Var instanceof n6x0) {
                    this.f205827c.invoke(((n6x0) c7x0Var).f150980a);
                }
                break;
            default:
                this.f205826b.f217299c = false;
                if (c7x0Var instanceof n6x0) {
                    uk6 uk6Var = (uk6) ((n6x0) c7x0Var).f150980a;
                    this.f205827c.invoke(new tl70(uk6Var.f231235a, null, null, uk6Var.f231236b));
                }
                break;
        }
    }
}
