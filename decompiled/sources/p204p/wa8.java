package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class wa8 implements c5y {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f249413a;

    /* JADX INFO: renamed from: b */
    public final l2n0 f249414b;

    /* JADX INFO: renamed from: c */
    public final dh21 f249415c;

    public wa8(int i) {
        this.f249413a = i;
        switch (i) {
            case 1:
                this.f249414b = new l2n0(4);
                this.f249415c = new dh21(-1, -1, "image/webp");
                break;
            default:
                this.f249414b = new l2n0(4);
                this.f249415c = new dh21(-1, -1, "image/avif");
                break;
        }
    }

    @Override // p204p.c5y
    /* JADX INFO: renamed from: a */
    public final void mo31287a(long j, long j2) {
        switch (this.f249413a) {
            case 0:
                this.f249415c.mo31287a(j, j2);
                break;
            default:
                this.f249415c.mo31287a(j, j2);
                break;
        }
    }

    @Override // p204p.c5y
    /* JADX INFO: renamed from: b */
    public final void mo31288b(e5y e5yVar) {
        switch (this.f249413a) {
            case 0:
                this.f249415c.mo31288b(e5yVar);
                break;
            default:
                this.f249415c.mo31288b(e5yVar);
                break;
        }
    }

    @Override // p204p.c5y
    /* JADX INFO: renamed from: c */
    public final int mo31289c(d5y d5yVar, vaq0 vaq0Var) {
        switch (this.f249413a) {
            case 0:
                break;
        }
        return this.f249415c.mo31289c(d5yVar, vaq0Var);
    }

    @Override // p204p.c5y
    /* JADX INFO: renamed from: d */
    public final boolean mo31290d(d5y d5yVar) {
        switch (this.f249413a) {
            case 0:
                hhp hhpVar = (hhp) d5yVar;
                hhpVar.mo35045w(4, false);
                l2n0 l2n0Var = this.f249414b;
                l2n0Var.m57927O(4);
                hhpVar.mo35036c(l2n0Var.f129054a, 0, 4, false);
                if (l2n0Var.m57919G() != 1718909296) {
                    return false;
                }
                l2n0Var.m57927O(4);
                hhpVar.mo35036c(l2n0Var.f129054a, 0, 4, false);
                return l2n0Var.m57919G() == ((long) 1635150182);
            default:
                l2n0 l2n0Var2 = this.f249414b;
                l2n0Var2.m57927O(4);
                hhp hhpVar2 = (hhp) d5yVar;
                hhpVar2.mo35036c(l2n0Var2.f129054a, 0, 4, false);
                if (l2n0Var2.m57919G() != 1380533830) {
                    return false;
                }
                hhpVar2.mo35045w(4, false);
                l2n0Var2.m57927O(4);
                hhpVar2.mo35036c(l2n0Var2.f129054a, 0, 4, false);
                return l2n0Var2.m57919G() == 1464156752;
        }
    }

    @Override // p204p.c5y
    public final void release() {
        int i = this.f249413a;
    }

    /* JADX INFO: renamed from: f */
    private final void m87584f() {
    }

    /* JADX INFO: renamed from: g */
    private final void m87585g() {
    }
}
