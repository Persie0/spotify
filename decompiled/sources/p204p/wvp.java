package p204p;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes2.dex */
public final class wvp {

    /* JADX INFO: renamed from: a */
    public final l5j0 f255543a;

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArraySet f255544b = new CopyOnWriteArraySet();

    public wvp(l5j0 l5j0Var) {
        this.f255543a = l5j0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m89135a() {
        Iterator it = this.f255544b.iterator();
        while (it.hasNext()) {
            ((d7l0) it.next()).mo28779a(this.f255543a.mo58243f());
        }
    }
}
