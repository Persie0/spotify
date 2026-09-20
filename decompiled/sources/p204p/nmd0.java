package p204p;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class nmd0 {

    /* JADX INFO: renamed from: a */
    public final wg61 f155410a;

    public nmd0(er70 er70Var) {
        this.f155410a = new wg61(new ab3(er70Var, 5));
    }

    /* JADX INFO: renamed from: a */
    public final void m64812a() {
        Iterator it = ((Set) this.f155410a.getValue()).iterator();
        while (it.hasNext()) {
            ((mmd0) it.next()).mo26263b();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m64813b() {
        Iterator it = ((Set) this.f155410a.getValue()).iterator();
        while (it.hasNext()) {
            ((mmd0) it.next()).mo26262a();
        }
    }
}
