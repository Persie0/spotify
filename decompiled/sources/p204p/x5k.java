package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class x5k {

    /* JADX INFO: renamed from: a */
    public final String f258463a;

    /* JADX INFO: renamed from: b */
    public final String f258464b;

    /* JADX INFO: renamed from: c */
    public final v150 f258465c;

    /* JADX INFO: renamed from: d */
    public final int f258466d;

    /* JADX INFO: renamed from: e */
    public final qe70 f258467e;

    /* JADX WARN: Multi-variable type inference failed */
    public x5k(String str, String str2, v150 v150Var, int i, eh00 eh00Var) {
        this.f258463a = str;
        this.f258464b = str2;
        this.f258465c = v150Var;
        this.f258466d = i;
        this.f258467e = (qe70) eh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5k)) {
            return false;
        }
        x5k x5kVar = (x5k) obj;
        return this.f258463a.equals(x5kVar.f258463a) && wj50.m88271j(this.f258464b, x5kVar.f258464b) && this.f258465c.equals(x5kVar.f258465c) && this.f258466d == x5kVar.f258466d && this.f258467e.equals(x5kVar.f258467e);
    }

    public final int hashCode() {
        return this.f258467e.hashCode() + f710.m40938f(this.f258466d, (this.f258465c.hashCode() + s571.m77243b(this.f258463a.hashCode() * 31, 31, this.f258464b)) * 31, 31);
    }
}
