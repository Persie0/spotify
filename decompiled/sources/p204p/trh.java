package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class trh implements ocf {

    /* JADX INFO: renamed from: a */
    public final ArrayList f223072a;

    public trh(ArrayList arrayList) {
        this.f223072a = arrayList;
    }

    @Override // p204p.ocf
    /* JADX INFO: renamed from: a */
    public final void mo65508a(pnx0 pnx0Var) {
        Iterator it = this.f223072a.iterator();
        while (it.hasNext()) {
            ((ocf) it.next()).mo65508a(pnx0Var);
        }
    }

    @Override // p204p.ocf
    /* JADX INFO: renamed from: b */
    public final void mo65509b(pnx0 pnx0Var, qy7 qy7Var) {
        Iterator it = this.f223072a.iterator();
        while (it.hasNext()) {
            ((ocf) it.next()).mo65509b(pnx0Var, qy7Var);
        }
    }

    @Override // p204p.ocf
    /* JADX INFO: renamed from: c */
    public final void mo65510c(pnx0 pnx0Var, List list) {
        Iterator it = this.f223072a.iterator();
        while (it.hasNext()) {
            ((ocf) it.next()).mo65510c(pnx0Var, list);
        }
    }
}
