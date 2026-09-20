package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class hks0 implements iks0 {

    /* JADX INFO: renamed from: a */
    public final String f92508a;

    /* JADX INFO: renamed from: b */
    public final lks0 f92509b;

    /* JADX INFO: renamed from: c */
    public final boolean f92510c;

    /* JADX INFO: renamed from: d */
    public final boolean f92511d;

    /* JADX INFO: renamed from: e */
    public final boolean f92512e;

    public hks0(String str, lks0 lks0Var, boolean z, boolean z2, boolean z3) {
        this.f92508a = str;
        this.f92509b = lks0Var;
        this.f92510c = z;
        this.f92511d = z2;
        this.f92512e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hks0)) {
            return false;
        }
        hks0 hks0Var = (hks0) obj;
        return wj50.m88271j(this.f92508a, hks0Var.f92508a) && wj50.m88271j(this.f92509b, hks0Var.f92509b) && this.f92510c == hks0Var.f92510c && this.f92511d == hks0Var.f92511d && this.f92512e == hks0Var.f92512e;
    }

    public final int hashCode() {
        String str = this.f92508a;
        return Boolean.hashCode(this.f92512e) + s571.m77245d(s571.m77245d((this.f92509b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.f92510c), 31, this.f92511d);
    }
}
