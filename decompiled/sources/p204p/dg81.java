package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class dg81 {

    /* JADX INFO: renamed from: a */
    public final String f48750a;

    /* JADX INFO: renamed from: b */
    public final qe70 f48751b;

    /* JADX INFO: renamed from: c */
    public final boolean f48752c;

    /* JADX INFO: renamed from: d */
    public final boolean f48753d;

    /* JADX INFO: renamed from: e */
    public final boolean f48754e;

    public /* synthetic */ dg81(int i, String str, gh00 gh00Var, boolean z) {
        this(str, gh00Var, z, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dg81)) {
            return false;
        }
        dg81 dg81Var = (dg81) obj;
        return wj50.m88271j(this.f48750a, dg81Var.f48750a) && wj50.m88271j(this.f48751b, dg81Var.f48751b) && this.f48752c == dg81Var.f48752c && this.f48753d == dg81Var.f48753d && this.f48754e == dg81Var.f48754e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f48754e) + s571.m77245d(s571.m77245d((this.f48751b.hashCode() + (this.f48750a.hashCode() * 31)) * 31, 31, this.f48752c), 31, this.f48753d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dg81(String str, gh00 gh00Var, boolean z, boolean z2, boolean z3) {
        this.f48750a = str;
        this.f48751b = (qe70) gh00Var;
        this.f48752c = z;
        this.f48753d = z2;
        this.f48754e = z3;
    }
}
