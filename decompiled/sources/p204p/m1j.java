package p204p;

import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes6.dex */
public final class m1j implements UnaryOperator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f138981a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f138982b;

    public /* synthetic */ m1j(Object obj, int i) {
        this.f138981a = i;
        this.f138982b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f138981a) {
            case 0:
                n1j n1jVar = (n1j) obj;
                wj50.m88279p(n1jVar);
                Boolean bool = (Boolean) this.f138982b;
                wj50.m88279p(bool);
                return new n1j(n1jVar.f149456a, bool.booleanValue());
            case 1:
                bdf0 bdf0Var = (bdf0) obj;
                bdf0 bdf0Var2 = (bdf0) this.f138982b;
                return (bdf0Var == null || bdf0Var.f26091a < bdf0Var2.f26091a) ? bdf0Var2 : bdf0Var;
            default:
                nr31 nr31Var = (nr31) obj;
                return nr31.m65468c(nr31Var, wj50.m88271j(nr31Var.f157437a, ((nr31) this.f138982b).f157437a), null, 11);
        }
    }
}
