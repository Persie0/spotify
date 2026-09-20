package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class erd0 {

    /* JADX INFO: renamed from: a */
    public final boolean f62095a;

    /* JADX INFO: renamed from: b */
    public final String f62096b;

    /* JADX INFO: renamed from: c */
    public final String f62097c;

    public erd0(boolean z, String str, String str2) {
        this.f62095a = z;
        this.f62096b = str;
        this.f62097c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof erd0)) {
            return false;
        }
        erd0 erd0Var = (erd0) obj;
        return this.f62095a == erd0Var.f62095a && wj50.m88271j(this.f62096b, erd0Var.f62096b) && wj50.m88271j(this.f62097c, erd0Var.f62097c);
    }

    public final int hashCode() {
        return this.f62097c.hashCode() + s571.m77243b(Boolean.hashCode(this.f62095a) * 31, 31, this.f62096b);
    }
}
