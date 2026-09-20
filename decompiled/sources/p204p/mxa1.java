package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class mxa1 implements dqk0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f148002a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ oxa1 f148003b;

    public /* synthetic */ mxa1(oxa1 oxa1Var, int i) {
        this.f148002a = i;
        this.f148003b = oxa1Var;
    }

    @Override // p204p.dqk0
    /* JADX INFO: renamed from: b */
    public final void mo31453b(Object obj) {
        switch (this.f148002a) {
            case 0:
                pp71 pp71Var = (pp71) obj;
                lxa1 lxa1Var = this.f148003b.f170946D1;
                if (lxa1Var == null) {
                    wj50.m88260d0("timelineDomainLogger");
                    throw null;
                }
                wj50.m88279p(pp71Var);
                lxa1Var.m60174a(pp71Var);
                return;
            default:
                Iterable iterable = (Iterable) obj;
                wj50.m88279p(iterable);
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    oxa1.m68202h1(this.f148003b, (qt71) it.next());
                }
                return;
        }
    }
}
