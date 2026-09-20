package p204p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class c4f {

    /* JADX INFO: renamed from: a */
    public final List f33934a;

    public c4f(List list) {
        this.f33934a = list;
    }

    /* JADX INFO: renamed from: a */
    public final xsj0 m31442a(String str) {
        Object next;
        Iterator it = this.f33934a.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((xsj0) next).mo34575a(str)) {
                return (xsj0) next;
            }
        }
        next = null;
        return (xsj0) next;
    }
}
