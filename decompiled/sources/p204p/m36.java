package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class m36 implements hwf {

    /* JADX INFO: renamed from: a */
    public final v64 f139534a;

    /* JADX INFO: renamed from: b */
    public final boolean f139535b;

    /* JADX INFO: renamed from: c */
    public final boolean f139536c;

    /* JADX INFO: renamed from: d */
    public final boolean f139537d;

    /* JADX INFO: renamed from: e */
    public final boolean f139538e;

    public m36(v64 v64Var, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f139534a = v64Var;
        this.f139535b = z;
        this.f139536c = z2;
        this.f139537d = z3;
        this.f139538e = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m36)) {
            return false;
        }
        m36 m36Var = (m36) obj;
        return this.f139534a == m36Var.f139534a && this.f139535b == m36Var.f139535b && this.f139536c == m36Var.f139536c && this.f139537d == m36Var.f139537d && this.f139538e == m36Var.f139538e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f139538e) + s571.m77245d(s571.m77245d(s571.m77245d(this.f139534a.hashCode() * 31, 31, this.f139535b), 31, this.f139536c), 31, this.f139537d);
    }
}
