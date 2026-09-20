package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class b9j0 {

    /* JADX INFO: renamed from: a */
    public final gzi0 f24951a;

    /* JADX INFO: renamed from: b */
    public final boolean f24952b;

    /* JADX INFO: renamed from: c */
    public final boolean f24953c;

    /* JADX INFO: renamed from: d */
    public final tf60 f24954d;

    public b9j0(gzi0 gzi0Var, boolean z, boolean z2, tf60 tf60Var) {
        this.f24951a = gzi0Var;
        this.f24952b = z;
        this.f24953c = z2;
        this.f24954d = tf60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b9j0)) {
            return false;
        }
        b9j0 b9j0Var = (b9j0) obj;
        return wj50.m88271j(this.f24951a, b9j0Var.f24951a) && this.f24952b == b9j0Var.f24952b && this.f24953c == b9j0Var.f24953c && wj50.m88271j(this.f24954d, b9j0Var.f24954d);
    }

    public final int hashCode() {
        return this.f24954d.hashCode() + s571.m77245d(s571.m77245d(this.f24951a.f85957a.hashCode() * 31, 31, this.f24952b), 31, this.f24953c);
    }
}
