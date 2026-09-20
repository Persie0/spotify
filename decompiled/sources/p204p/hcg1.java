package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes4.dex */
public final class hcg1 extends dag1 {

    /* JADX INFO: renamed from: m */
    public final ArrayList f89788m;

    public hcg1(fof1 fof1Var, ArrayList arrayList) {
        super(fof1Var);
        this.f89788m = arrayList;
    }

    @Override // p204p.e6f1, p204p.k0g1
    /* JADX INFO: renamed from: V0 */
    public final void mo37937V0(j7g1 j7g1Var) {
        m35481c2(new zpf1(jjf1.m53570v(j7g1Var.f109595a), j7g1Var.f109596b));
        if (j7g1Var.f109595a != 0) {
            Iterator it = this.f89788m.iterator();
            while (it.hasNext()) {
                ((FutureTask) it.next()).cancel(true);
            }
        }
    }
}
