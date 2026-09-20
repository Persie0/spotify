package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class oe30 implements we30 {

    /* JADX INFO: renamed from: a */
    public final String f164329a;

    /* JADX INFO: renamed from: b */
    public final int f164330b;

    /* JADX INFO: renamed from: c */
    public final int f164331c;

    /* JADX INFO: renamed from: d */
    public final Float f164332d;

    /* JADX INFO: renamed from: e */
    public final Float f164333e;

    public oe30(String str, int i, int i2, Float f, Float f2) {
        this.f164329a = str;
        this.f164330b = i;
        this.f164331c = i2;
        this.f164332d = f;
        this.f164333e = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oe30)) {
            return false;
        }
        oe30 oe30Var = (oe30) obj;
        return this.f164329a.equals(oe30Var.f164329a) && this.f164330b == oe30Var.f164330b && this.f164331c == oe30Var.f164331c && wj50.m88271j(this.f164332d, oe30Var.f164332d) && wj50.m88271j(this.f164333e, oe30Var.f164333e);
    }

    public final int hashCode() {
        int iM40938f = f710.m40938f(this.f164331c, f710.m40938f(this.f164330b, this.f164329a.hashCode() * 31, 31), 31);
        Float f = this.f164332d;
        int iHashCode = (iM40938f + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.f164333e;
        return iHashCode + (f2 != null ? f2.hashCode() : 0);
    }
}
