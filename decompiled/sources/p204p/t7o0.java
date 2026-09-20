package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class t7o0 {

    /* JADX INFO: renamed from: a */
    public final c8o0 f217860a;

    /* JADX INFO: renamed from: b */
    public final int f217861b;

    /* JADX INFO: renamed from: c */
    public final boolean f217862c;

    public t7o0(c8o0 c8o0Var, int i, boolean z) {
        this.f217860a = c8o0Var;
        this.f217861b = i;
        this.f217862c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t7o0)) {
            return false;
        }
        t7o0 t7o0Var = (t7o0) obj;
        return wj50.m88271j(this.f217860a, t7o0Var.f217860a) && this.f217861b == t7o0Var.f217861b && this.f217862c == t7o0Var.f217862c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f217862c) + mt60.m62800g(this.f217861b, this.f217860a.hashCode() * 31, 31);
    }
}
