package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class q38 implements hwf {

    /* JADX INFO: renamed from: a */
    public final v64 f184812a;

    /* JADX INFO: renamed from: b */
    public final boolean f184813b;

    /* JADX INFO: renamed from: c */
    public final boolean f184814c;

    /* JADX INFO: renamed from: d */
    public final boolean f184815d;

    public q38(v64 v64Var, boolean z, boolean z2, boolean z3) {
        this.f184812a = v64Var;
        this.f184813b = z;
        this.f184814c = z2;
        this.f184815d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q38)) {
            return false;
        }
        q38 q38Var = (q38) obj;
        return this.f184812a == q38Var.f184812a && this.f184813b == q38Var.f184813b && this.f184814c == q38Var.f184814c && this.f184815d == q38Var.f184815d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f184815d) + s571.m77245d(s571.m77245d(this.f184812a.hashCode() * 31, 31, this.f184813b), 31, this.f184814c);
    }
}
