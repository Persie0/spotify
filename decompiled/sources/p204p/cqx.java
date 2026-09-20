package p204p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class cqx {

    /* JADX INFO: renamed from: a */
    public final ArrayList f41018a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final boolean m33646a(String str, Class cls, boolean z) {
        return this.f41018a.add(new dqx(str, cls, z));
    }

    /* JADX INFO: renamed from: b */
    public final void m33647b(Class cls, Iterable iterable, boolean z) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f41018a.add(new dqx((String) it.next(), cls, z));
        }
    }
}
