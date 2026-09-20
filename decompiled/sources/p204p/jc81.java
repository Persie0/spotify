package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jc81 {

    /* JADX INFO: renamed from: a */
    public final lc81 f111016a;

    /* JADX INFO: renamed from: b */
    public final kc81 f111017b;

    /* JADX INFO: renamed from: c */
    public final boolean f111018c;

    /* JADX INFO: renamed from: d */
    public final boolean f111019d;

    /* JADX INFO: renamed from: e */
    public final boolean f111020e;

    public jc81(lc81 lc81Var, kc81 kc81Var, boolean z, boolean z2, boolean z3) {
        this.f111016a = lc81Var;
        this.f111017b = kc81Var;
        this.f111018c = z;
        this.f111019d = z2;
        this.f111020e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jc81)) {
            return false;
        }
        jc81 jc81Var = (jc81) obj;
        return wj50.m88271j(this.f111016a, jc81Var.f111016a) && wj50.m88271j(this.f111017b, jc81Var.f111017b) && this.f111018c == jc81Var.f111018c && this.f111019d == jc81Var.f111019d && this.f111020e == jc81Var.f111020e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f111020e) + s571.m77245d(s571.m77245d((this.f111017b.hashCode() + (this.f111016a.hashCode() * 31)) * 31, 31, this.f111018c), 31, this.f111019d);
    }
}
