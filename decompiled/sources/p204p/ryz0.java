package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ryz0 {

    /* JADX INFO: renamed from: a */
    public final wyz0 f203996a;

    /* JADX INFO: renamed from: b */
    public final boolean f203997b;

    /* JADX INFO: renamed from: c */
    public final gh00 f203998c;

    public ryz0(wyz0 wyz0Var, boolean z, gh00 gh00Var) {
        this.f203996a = wyz0Var;
        this.f203997b = z;
        this.f203998c = gh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ryz0)) {
            return false;
        }
        ryz0 ryz0Var = (ryz0) obj;
        return wj50.m88271j(this.f203996a, ryz0Var.f203996a) && this.f203997b == ryz0Var.f203997b && wj50.m88271j(this.f203998c, ryz0Var.f203998c);
    }

    public final int hashCode() {
        return this.f203998c.hashCode() + s571.m77245d(this.f203996a.hashCode() * 31, 31, this.f203997b);
    }
}
