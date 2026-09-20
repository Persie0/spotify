package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class i1s extends AbstractC2601y5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f97580a;

    /* JADX INFO: renamed from: b */
    public final gq9 f97581b;

    public i1s(int i) {
        this.f97580a = i;
        switch (i) {
            case 1:
                this.f97581b = new cg71();
                break;
            default:
                this.f97581b = new h1s();
                break;
        }
    }

    @Override // p204p.AbstractC2601y5
    /* JADX INFO: renamed from: a */
    public void mo30334a(ku31 ku31Var) {
        int i = this.f97580a;
    }

    @Override // p204p.AbstractC2601y5
    /* JADX INFO: renamed from: c */
    public boolean mo49421c(gq9 gq9Var) {
        switch (this.f97580a) {
            case 0:
                return true;
            default:
                return super.mo49421c(gq9Var);
        }
    }

    @Override // p204p.AbstractC2601y5
    /* JADX INFO: renamed from: f */
    public final gq9 mo30336f() {
        switch (this.f97580a) {
            case 0:
                return (h1s) this.f97581b;
            default:
                return (cg71) this.f97581b;
        }
    }

    @Override // p204p.AbstractC2601y5
    /* JADX INFO: renamed from: h */
    public boolean mo49422h() {
        switch (this.f97580a) {
            case 0:
                return true;
            default:
                return super.mo49422h();
        }
    }

    @Override // p204p.AbstractC2601y5
    /* JADX INFO: renamed from: j */
    public final lwe mo30337j(m1s m1sVar) {
        switch (this.f97580a) {
            case 0:
                return lwe.m60120a(m1sVar.f139065c);
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: k */
    private final void m49420k(ku31 ku31Var) {
    }
}
