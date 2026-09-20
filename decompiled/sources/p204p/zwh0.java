package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class zwh0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f286985a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t180 f286986b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zwh0(t180 t180Var, int i) {
        super(1);
        this.f286985a = i;
        this.f286986b = t180Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f286985a) {
            case 0:
                cqx cqxVar = (cqx) obj;
                for (pqm0 pqm0Var : (ArrayList) this.f286986b.f216179b) {
                    cqxVar.m33646a((String) pqm0Var.f180350a, (Class) pqm0Var.f180351b, false);
                }
                break;
            default:
                cqx cqxVar2 = (cqx) obj;
                for (pqm0 pqm0Var2 : (ArrayList) this.f286986b.f216179b) {
                    cqxVar2.m33646a((String) pqm0Var2.f180350a, (Class) pqm0Var2.f180351b, false);
                }
                break;
        }
        return w2a1.f247311a;
    }
}
