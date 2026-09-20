package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class p0f0 {

    /* JADX INFO: renamed from: a */
    public final int f172665a;

    /* JADX INFO: renamed from: b */
    public final zre0 f172666b;

    /* JADX INFO: renamed from: c */
    public final vre0 f172667c;

    public p0f0(int i, zre0 zre0Var, vre0 vre0Var) {
        this.f172665a = i;
        this.f172666b = zre0Var;
        this.f172667c = vre0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0f0)) {
            return false;
        }
        p0f0 p0f0Var = (p0f0) obj;
        return this.f172665a == p0f0Var.f172665a && wj50.m88271j(this.f172666b, p0f0Var.f172666b) && wj50.m88271j(this.f172667c, p0f0Var.f172667c);
    }

    public final int hashCode() {
        return this.f172667c.hashCode() + ((this.f172666b.hashCode() + (edb.m38547C(this.f172665a) * 31)) * 31);
    }
}
