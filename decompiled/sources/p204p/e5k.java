package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class e5k {

    /* JADX INFO: renamed from: a */
    public final d3h1 f56420a;

    /* JADX INFO: renamed from: b */
    public final int f56421b;

    /* JADX INFO: renamed from: c */
    public final d5k f56422c;

    /* JADX INFO: renamed from: d */
    public final qe70 f56423d;

    /* JADX WARN: Multi-variable type inference failed */
    public e5k(d3h1 d3h1Var, int i, d5k d5kVar, gh00 gh00Var) {
        this.f56420a = d3h1Var;
        this.f56421b = i;
        this.f56422c = d5kVar;
        this.f56423d = (qe70) gh00Var;
    }

    /* JADX INFO: renamed from: a */
    public static e5k m37817a(e5k e5kVar, gh00 gh00Var) {
        d3h1 d3h1Var = e5kVar.f56420a;
        int i = e5kVar.f56421b;
        d5k d5kVar = e5kVar.f56422c;
        e5kVar.getClass();
        return new e5k(d3h1Var, i, d5kVar, gh00Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5k)) {
            return false;
        }
        e5k e5kVar = (e5k) obj;
        return wj50.m88271j(this.f56420a, e5kVar.f56420a) && this.f56421b == e5kVar.f56421b && wj50.m88271j(this.f56422c, e5kVar.f56422c) && wj50.m88271j(this.f56423d, e5kVar.f56423d);
    }

    public final int hashCode() {
        return this.f56423d.hashCode() + ((this.f56422c.hashCode() + f710.m40938f(this.f56421b, this.f56420a.hashCode() * 31, 31)) * 31);
    }

    public /* synthetic */ e5k(d3h1 d3h1Var, d5k d5kVar, gh00 gh00Var) {
        this(d3h1Var, 1, d5kVar, gh00Var);
    }
}
