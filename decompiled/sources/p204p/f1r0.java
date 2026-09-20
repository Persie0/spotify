package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class f1r0 implements f7x0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f64953a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ h1r0 f64954b;

    public /* synthetic */ f1r0(h1r0 h1r0Var, int i) {
        this.f64953a = i;
        this.f64954b = h1r0Var;
    }

    @Override // p204p.f7x0
    /* JADX INFO: renamed from: e */
    public final void mo29825e(c7x0 c7x0Var) {
        switch (this.f64953a) {
            case 0:
                h1r0 h1r0Var = this.f64954b;
                e1r0 e1r0Var = new e1r0(h1r0Var, c7x0Var, 0);
                if (!h1r0Var.f86687c) {
                    h1r0Var.f86686b.add(e1r0Var);
                } else {
                    e1r0Var.invoke();
                }
                break;
            default:
                h1r0 h1r0Var2 = this.f64954b;
                e1r0 e1r0Var2 = new e1r0(h1r0Var2, c7x0Var, 1);
                if (!h1r0Var2.f86687c) {
                    h1r0Var2.f86686b.add(e1r0Var2);
                } else {
                    e1r0Var2.invoke();
                }
                break;
        }
    }
}
