package p204p;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class gbc0 {

    /* JADX INFO: renamed from: a */
    public final pgo f78264a;

    /* JADX INFO: renamed from: b */
    public final p7f0 f78265b;

    /* JADX INFO: renamed from: c */
    public Set f78266c = new LinkedHashSet();

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f78267d = new LinkedHashMap();

    /* JADX INFO: renamed from: e */
    public final Object f78268e = new Object();

    public gbc0(pgo pgoVar, p7f0 p7f0Var) {
        this.f78264a = pgoVar;
        this.f78265b = p7f0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m44213a(Set set) {
        synchronized (this.f78268e) {
            try {
                p7f0 p7f0Var = this.f78265b;
                if (p7f0Var != null) {
                    set.size();
                    p7f0Var.getClass();
                }
                Set set2 = this.f78266c;
                this.f78264a.mo25868d(new a9k(s601.m77305h0(set, set2), this, s601.m77305h0(set2, set), 3));
                this.f78266c = g6f.m43734m1(set);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
