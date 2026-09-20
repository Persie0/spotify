package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class fin0 {

    /* JADX INFO: renamed from: a */
    public final noa0 f69924a;

    /* JADX INFO: renamed from: b */
    public final ein0 f69925b = new ein0(new AtomicBoolean(true));

    public fin0(noa0 noa0Var) {
        this.f69924a = noa0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m41767a(g3x g3xVar) {
        ein0 ein0Var = this.f69925b;
        ArrayList arrayList = ein0Var.f59987b;
        if (ein0Var.f59986a.get()) {
            arrayList.add(g3xVar);
        } else {
            this.f69924a.invoke(g3xVar);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m41768b(g3x g3xVar) {
        noa0 noa0Var = this.f69924a;
        noa0Var.invoke(g3xVar);
        ein0 ein0Var = this.f69925b;
        AtomicBoolean atomicBoolean = ein0Var.f59986a;
        ArrayList arrayList = ein0Var.f59987b;
        if (!atomicBoolean.getAndSet(false) || arrayList.isEmpty()) {
            return;
        }
        Iterator it = new ArrayList(arrayList).iterator();
        while (it.hasNext()) {
            noa0Var.invoke(it.next());
        }
        arrayList.clear();
    }
}
