package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class u99 {

    /* JADX INFO: renamed from: a */
    public final z89 f228104a;

    /* JADX INFO: renamed from: b */
    public final x89 f228105b;

    /* JADX INFO: renamed from: c */
    public final nf50 f228106c;

    public u99(z89 z89Var, x89 x89Var, nf50 nf50Var) {
        this.f228104a = z89Var;
        this.f228105b = x89Var;
        this.f228106c = nf50Var;
    }

    /* JADX INFO: renamed from: a */
    public final t6s m82602a(String str) {
        x89 x89Var = this.f228105b;
        p2s p2sVar = (p2s) x89Var.f259092e.get(str);
        if (p2sVar != null) {
            j9s j9sVar = p2sVar.f173420a;
            if (vqg1.m86241s(p2sVar)) {
                izk0 izk0Var = (izk0) nsf1.m65528n(x89Var.f259089b.f206887a.mo3982z().f96964a, true, false, new eve0(str, 22));
                ka80 ka80Var = izk0Var != null ? new ka80(izk0Var.m52029c()) : null;
                String str2 = j9sVar.f110236c;
                String string = j9sVar.f110235b.toString();
                if (str2 == null) {
                    str2 = "";
                }
                return new t6s(string, str2, j9sVar.f110237d, ka80Var);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final long m82603b(String str) {
        p2s p2sVar = (p2s) this.f228105b.f259092e.get(str);
        if (p2sVar == null) {
            return -1L;
        }
        int iM86239q = vqg1.m86239q(p2sVar);
        double dM68965b = p2sVar.m68965b();
        if (iM86239q == 1 || dM68965b <= 0.0d) {
            return -1L;
        }
        return ((long) (p2sVar.m68964a() / dM68965b)) * ((long) 100);
    }
}
