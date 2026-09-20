package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class swp0 {

    /* JADX INFO: renamed from: a */
    public final String f214700a;

    /* JADX INFO: renamed from: b */
    public final String f214701b;

    /* JADX INFO: renamed from: c */
    public final a9i0 f214702c;

    public swp0(String str, String str2, a9i0 a9i0Var) {
        this.f214700a = str;
        this.f214701b = str2;
        this.f214702c = a9i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof swp0)) {
            return false;
        }
        swp0 swp0Var = (swp0) obj;
        return wj50.m88271j(this.f214700a, swp0Var.f214700a) && wj50.m88271j(this.f214701b, swp0Var.f214701b) && this.f214702c.equals(swp0Var.f214702c);
    }

    public final int hashCode() {
        return this.f214702c.hashCode() + s571.m77243b(this.f214700a.hashCode() * 31, 31, this.f214701b);
    }
}
