package p204p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class t460 implements t160 {

    /* JADX INFO: renamed from: a */
    public final List f216925a;

    public t460(b460 b460Var, tup tupVar, n960 n960Var, ea60 ea60Var, az50 az50Var, m760 m760Var, ygr0 ygr0Var, txw0 txw0Var, mz50 mz50Var) {
        this.f216925a = h6f.m46715L(b460Var, tupVar, n960Var, ea60Var, az50Var, m760Var, ygr0Var, txw0Var, mz50Var);
    }

    @Override // p204p.t160
    public final void start() {
        Iterator it = this.f216925a.iterator();
        while (it.hasNext()) {
            ((t160) it.next()).start();
        }
    }

    @Override // p204p.t160
    public final void stop() {
        Iterator it = this.f216925a.iterator();
        while (it.hasNext()) {
            ((t160) it.next()).stop();
        }
    }
}
