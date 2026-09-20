package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class jur {

    /* JADX INFO: renamed from: a */
    public final iur f116143a;

    /* JADX INFO: renamed from: b */
    public final hc80 f116144b;

    /* JADX INFO: renamed from: c */
    public final int f116145c;

    /* JADX INFO: renamed from: d */
    public final boolean f116146d;

    public /* synthetic */ jur(iur iurVar, hc80 hc80Var, int i) {
        this(iurVar, hc80Var, (i & 4) != 0 ? 2 : 3, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jur)) {
            return false;
        }
        jur jurVar = (jur) obj;
        return wj50.m88271j(this.f116143a, jurVar.f116143a) && wj50.m88271j(this.f116144b, jurVar.f116144b) && this.f116145c == jurVar.f116145c && this.f116146d == jurVar.f116146d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f116146d) + f710.m40938f(this.f116145c, (this.f116144b.hashCode() + (this.f116143a.hashCode() * 31)) * 31, 31);
    }

    public jur(iur iurVar, hc80 hc80Var, int i, boolean z) {
        this.f116143a = iurVar;
        this.f116144b = hc80Var;
        this.f116145c = i;
        this.f116146d = z;
    }
}
