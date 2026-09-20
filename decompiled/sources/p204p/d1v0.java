package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class d1v0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f44363a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qfa0 f44364b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1v0(qfa0 qfa0Var, int i) {
        super(1);
        this.f44363a = i;
        this.f44364b = qfa0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        int i = this.f44363a;
        boolean z = false;
        qfa0 qfa0Var = this.f44364b;
        switch (i) {
            case 0:
                qfa0 qfa0Var2 = (qfa0) obj;
                fv31 fv31Var = f1v0.f64981a;
                if (wj50.m88271j(qfa0Var2.f188157a, qfa0Var.f188157a) && wj50.m88271j(qfa0Var2.f188159c, qfa0Var.f188159c)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                qfa0 qfa0Var3 = (qfa0) obj;
                fv31 fv31Var2 = f1v0.f64981a;
                if (wj50.m88271j(qfa0Var3.f188157a, qfa0Var.f188157a) && wj50.m88271j(qfa0Var3.f188159c, qfa0Var.f188159c)) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
