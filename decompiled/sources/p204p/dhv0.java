package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class dhv0 implements w49 {

    /* JADX INFO: renamed from: a */
    public final Set f49181a;

    /* JADX INFO: renamed from: b */
    public final qe70 f49182b;

    /* JADX WARN: Multi-variable type inference failed */
    public dhv0(Set set, th00 th00Var) {
        this.f49181a = set;
        this.f49182b = (qe70) th00Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [p.qe70, p.th00] */
    /* JADX INFO: renamed from: a */
    public final void m36059a(String str, double d) {
        Set set = this.f49181a;
        if (set == null || set.contains(str)) {
            this.f49182b.invoke(str, Double.valueOf(d));
        }
    }
}
