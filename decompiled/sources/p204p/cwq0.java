package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class cwq0 {

    /* JADX INFO: renamed from: a */
    public final owq0 f42801a;

    /* JADX INFO: renamed from: b */
    public final boolean f42802b;

    /* JADX INFO: renamed from: c */
    public final boolean f42803c;

    public cwq0(owq0 owq0Var, boolean z, boolean z2) {
        this.f42801a = owq0Var;
        this.f42802b = z;
        this.f42803c = z2;
    }

    /* JADX INFO: renamed from: a */
    public final owq0 m34149a() {
        return this.f42801a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m34150b() {
        return this.f42802b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m34151c() {
        return this.f42803c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwq0)) {
            return false;
        }
        cwq0 cwq0Var = (cwq0) obj;
        return wj50.m88271j(this.f42801a, cwq0Var.f42801a) && this.f42802b == cwq0Var.f42802b && this.f42803c == cwq0Var.f42803c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f42803c) + s571.m77245d(this.f42801a.hashCode() * 31, 31, this.f42802b);
    }
}
