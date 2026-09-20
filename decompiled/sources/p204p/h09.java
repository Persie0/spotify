package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class h09 extends fw4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f86180a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ i09 f86181b;

    public /* synthetic */ h09(i09 i09Var, int i) {
        this.f86180a = i;
        this.f86181b = i09Var;
    }

    @Override // p204p.fw4
    /* JADX INFO: renamed from: a */
    public final void mo24427a() {
        switch (this.f86180a) {
            case 0:
                i09 i09Var = this.f86181b;
                i09Var.setIndeterminate(false);
                i09Var.mo1624a(i09Var.f97159b);
                break;
            default:
                i09 i09Var2 = this.f86181b;
                if (!i09Var2.f97163f) {
                    i09Var2.setVisibility(i09Var2.f97164g);
                }
                break;
        }
    }
}
