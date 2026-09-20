package p204p;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class uge0 implements rge0 {

    /* JADX INFO: renamed from: a */
    public final cq40 f230145a;

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArrayList f230146b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c */
    public final CopyOnWriteArrayList f230147c = new CopyOnWriteArrayList();

    public uge0(cq40 cq40Var) {
        this.f230145a = cq40Var;
    }

    @Override // p204p.rge0
    /* JADX INFO: renamed from: a */
    public final void mo75485a(int i) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f230146b;
        if (i == 10) {
            m83035b(copyOnWriteArrayList);
        } else {
            if (i != 15) {
                return;
            }
            m83035b(copyOnWriteArrayList);
            m83035b(this.f230147c);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m83035b(CopyOnWriteArrayList copyOnWriteArrayList) {
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            try {
                ((vge0) it.next()).mo34449a();
            } catch (Exception e) {
                this.f230145a.f40727a.mo53581a(e);
            }
        }
    }
}
