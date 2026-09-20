package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bq20 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f29650a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cq20 f29651b;

    public /* synthetic */ bq20(cq20 cq20Var, int i) {
        this.f29650a = i;
        this.f29651b = cq20Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f29650a) {
            case 0:
                kp91 kp91Var = this.f29651b.f40712T0;
                if (kp91Var == null) {
                    throw mt60.m62801h("Font resolution state is not set.");
                }
                kp91Var.getValue();
                break;
                break;
            default:
                kp91 kp91Var2 = this.f29651b.f40712T0;
                if (kp91Var2 == null) {
                    throw mt60.m62801h("Font resolution state is not set.");
                }
                kp91Var2.getValue();
                break;
                break;
        }
        return w2a1.f247311a;
    }
}
