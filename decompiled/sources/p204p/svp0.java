package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class svp0 {

    /* JADX INFO: renamed from: a */
    public final qvf f214495a;

    /* JADX INFO: renamed from: b */
    public final String f214496b;

    public svp0(qvf qvfVar, String str) {
        this.f214495a = qvfVar;
        this.f214496b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof svp0)) {
            return false;
        }
        svp0 svp0Var = (svp0) obj;
        return wj50.m88271j(this.f214495a, svp0Var.f214495a) && wj50.m88271j(this.f214496b, svp0Var.f214496b);
    }

    public final int hashCode() {
        return this.f214496b.hashCode() + (this.f214495a.hashCode() * 31);
    }
}
