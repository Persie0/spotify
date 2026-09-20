package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class xo3 implements wri0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f263750a;

    /* JADX INFO: renamed from: b */
    public final zv41 f263751b;

    public xo3(int i) {
        this.f263750a = i;
        switch (i) {
            case 1:
                this.f263751b = jag1.m52819d(Boolean.FALSE);
                break;
            case 2:
                this.f263751b = jag1.m52819d(Boolean.TRUE);
                break;
            case 3:
                this.f263751b = jag1.m52819d(Boolean.FALSE);
                break;
            default:
                this.f263751b = jag1.m52819d(Boolean.TRUE);
                break;
        }
    }

    @Override // p204p.wri0
    /* JADX INFO: renamed from: k */
    public final void mo29039k() {
        switch (this.f263750a) {
            case 2:
                Boolean bool = Boolean.TRUE;
                zv41 zv41Var = this.f263751b;
                zv41Var.getClass();
                zv41Var.m97091m(null, bool);
                break;
        }
    }

    @Override // p204p.wri0
    /* JADX INFO: renamed from: l */
    public final zv41 mo29040l() {
        switch (this.f263750a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.f263751b;
    }

    @Override // p204p.wri0
    /* JADX INFO: renamed from: m */
    public final boolean mo29041m() {
        switch (this.f263750a) {
            case 0:
                return false;
            case 1:
                return true;
            case 2:
                Boolean bool = Boolean.FALSE;
                zv41 zv41Var = this.f263751b;
                zv41Var.getClass();
                zv41Var.m97091m(null, bool);
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m91523a() {
    }

    /* JADX INFO: renamed from: b */
    private final void m91524b() {
    }

    /* JADX INFO: renamed from: c */
    private final void m91525c() {
    }
}
