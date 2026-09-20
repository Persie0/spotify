package p204p;

import java.lang.reflect.Type;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public abstract class yov0 implements zd60 {
    @Override // p204p.yc60
    /* JADX INFO: renamed from: a */
    public cov0 mo26729a(y400 y400Var) {
        Object next;
        Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (wj50.m88271j(bov0.m30093a(((ife) mif1.m61883r(((cov0) next).f40358b)).mo28587A()).m85354a(), y400Var)) {
                return (cov0) next;
            }
        }
        next = null;
        return (cov0) next;
    }

    /* JADX INFO: renamed from: b */
    public abstract Type mo30166b();

    public final boolean equals(Object obj) {
        return (obj instanceof yov0) && wj50.m88271j(mo30166b(), ((yov0) obj).mo30166b());
    }

    public final int hashCode() {
        return mo30166b().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + mo30166b();
    }
}
