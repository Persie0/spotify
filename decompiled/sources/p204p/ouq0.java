package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ouq0 {

    /* JADX INFO: renamed from: a */
    public final q7z0 f170341a;

    /* JADX INFO: renamed from: b */
    public final cwp0 f170342b;

    public ouq0(q7z0 q7z0Var, cwp0 cwp0Var) {
        this.f170341a = q7z0Var;
        this.f170342b = cwp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ouq0)) {
            return false;
        }
        ouq0 ouq0Var = (ouq0) obj;
        return wj50.m88271j(this.f170341a, ouq0Var.f170341a) && wj50.m88271j(this.f170342b, ouq0Var.f170342b);
    }

    public final int hashCode() {
        return this.f170342b.f42799a.hashCode() + (this.f170341a.hashCode() * 31);
    }
}
