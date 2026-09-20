package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class pzv implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f183819a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qzv f183820b;

    public /* synthetic */ pzv(qzv qzvVar, int i) {
        this.f183819a = i;
        this.f183820b = qzvVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f183819a) {
            case 0:
                qti0 qti0Var = (qti0) obj;
                if (qti0Var != null) {
                    qzv qzvVar = this.f183820b;
                    return qzvVar.m74356j(qti0Var, qzvVar.m74355i().mo27569c(qti0Var, pkj0.f178479f));
                }
                qzv.m74354h(8);
                throw null;
            default:
                qti0 qti0Var2 = (qti0) obj;
                if (qti0Var2 != null) {
                    qzv qzvVar2 = this.f183820b;
                    return qzvVar2.m74356j(qti0Var2, qzvVar2.m74355i().mo27568a(qti0Var2, pkj0.f178479f));
                }
                qzv.m74354h(4);
                throw null;
        }
    }
}
