package p204p;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class bdu0 {

    /* JADX INFO: renamed from: a */
    public final Set f26219a;

    public bdu0(hg40 hg40Var) {
        this.f26219a = hg40Var;
    }

    /* JADX INFO: renamed from: a */
    public final adu0 m28853a(ju61 ju61Var) {
        Object next;
        Iterator it = this.f26219a.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((adu0) next).mo25627f(ju61Var)) {
                return (adu0) next;
            }
        }
        next = null;
        return (adu0) next;
    }
}
