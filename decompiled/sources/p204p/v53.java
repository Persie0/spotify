package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class v53 implements hwf {

    /* JADX INFO: renamed from: a */
    public final boolean f237301a;

    /* JADX INFO: renamed from: b */
    public final boolean f237302b;

    /* JADX INFO: renamed from: c */
    public final v64 f237303c;

    /* JADX INFO: renamed from: d */
    public final boolean f237304d;

    public v53(v64 v64Var, boolean z, boolean z2, boolean z3) {
        this.f237301a = z;
        this.f237302b = z2;
        this.f237303c = v64Var;
        this.f237304d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v53)) {
            return false;
        }
        v53 v53Var = (v53) obj;
        return this.f237301a == v53Var.f237301a && this.f237302b == v53Var.f237302b && this.f237303c == v53Var.f237303c && this.f237304d == v53Var.f237304d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f237304d) + ((this.f237303c.hashCode() + s571.m77245d(Boolean.hashCode(this.f237301a) * 31, 31, this.f237302b)) * 31);
    }
}
