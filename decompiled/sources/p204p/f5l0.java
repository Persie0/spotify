package p204p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class f5l0 {

    /* JADX INFO: renamed from: a */
    public final ie41 f66104a;

    public f5l0(ie41 ie41Var) {
        this.f66104a = ie41Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m40769a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!wl51.m88460J0(str)) {
                z4l0 z4l0Var = ((je41) this.f66104a).f111452b;
                ztw0 ztw0Var = new ztw0();
                ztw0Var.m96949b();
                ztw0Var.m96954g(str);
                z4l0Var.m95348b(new auw0(ztw0Var)).m97070e(new e45(19));
            }
        }
    }
}
