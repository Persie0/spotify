package p204p;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class uh8 {

    /* JADX INFO: renamed from: a */
    public final q4x f230382a;

    /* JADX INFO: renamed from: b */
    public final j8a f230383b;

    public uh8(q4x q4xVar, j8a j8aVar) {
        this.f230382a = q4xVar;
        this.f230383b = j8aVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m83134a(Set set) {
        set.toString();
        Set set2 = set;
        if (!(set2 instanceof Collection) || !set2.isEmpty()) {
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                if (((oc8) it.next()) instanceof mc8) {
                    if (this.f230383b.isEnabled()) {
                        break;
                    }
                    na6.m63957e("Attempted to register unified writable token characteristic while flag is disabled");
                    return;
                }
            }
        }
        this.f230382a.accept(new oh8(set));
    }
}
