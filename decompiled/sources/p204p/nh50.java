package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class nh50 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f153879a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qh50 f153880b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nh50(qh50 qh50Var, int i) {
        super(1);
        this.f153879a = i;
        this.f153880b = qh50Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f153879a) {
            case 0:
                yq81 yq81Var = (yq81) obj;
                qh50 qh50Var = this.f153880b;
                if (qh50Var.f188652f) {
                    qh50Var.f188637O0.add(yq81Var);
                    qh50Var.m72787B0();
                }
                break;
            default:
                yq81 yq81Var2 = (yq81) obj;
                qh50 qh50Var2 = this.f153880b;
                if (qh50Var2.f188652f) {
                    qh50Var2.f188637O0.remove(yq81Var2);
                }
                break;
        }
        return w2a1.f247311a;
    }
}
