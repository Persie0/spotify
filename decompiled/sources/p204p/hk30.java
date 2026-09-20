package p204p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class hk30 implements jk30 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f92331a;

    public hk30(ArrayList arrayList) {
        this.f92331a = arrayList;
    }

    @Override // p204p.jk30
    /* JADX INFO: renamed from: a */
    public final qj30 mo45025a(int i) {
        Iterator it = this.f92331a.iterator();
        while (it.hasNext()) {
            qj30 qj30VarMo45025a = ((jk30) it.next()).mo45025a(i);
            if (qj30VarMo45025a != null) {
                return qj30VarMo45025a;
            }
        }
        return null;
    }
}
