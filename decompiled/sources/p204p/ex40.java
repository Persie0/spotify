package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ex40 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f63666a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fx40 f63667b;

    public /* synthetic */ ex40(fx40 fx40Var, int i) {
        this.f63666a = i;
        this.f63667b = fx40Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        ce91 ce91Var = (ce91) obj;
        switch (this.f63666a) {
            case 0:
                fx40 fx40Var = (fx40) ce91Var;
                tvd1 tvd1Var = this.f63667b.f74239N0;
                if (!wj50.m88271j(fx40Var.f74238M0, tvd1Var)) {
                    fx40Var.f74238M0 = tvd1Var;
                    fx40Var.mo42990I1();
                }
                return be91.f26307b;
            default:
                this.f63667b.f74238M0 = ((fx40) ce91Var).f74239N0;
                return Boolean.FALSE;
        }
    }
}
