package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class oho0 extends tho0 {

    /* JADX INFO: renamed from: a */
    public final boolean f165514a;

    /* JADX INFO: renamed from: b */
    public final String f165515b;

    /* JADX INFO: renamed from: c */
    public final yzv f165516c;

    /* JADX INFO: renamed from: d */
    public final d850 f165517d;

    public oho0(boolean z, String str, yzv yzvVar, d850 d850Var) {
        this.f165514a = z;
        this.f165515b = str;
        this.f165516c = yzvVar;
        this.f165517d = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oho0)) {
            return false;
        }
        oho0 oho0Var = (oho0) obj;
        return this.f165514a == oho0Var.f165514a && wj50.m88271j(this.f165515b, oho0Var.f165515b) && this.f165516c == oho0Var.f165516c && wj50.m88271j(this.f165517d, oho0Var.f165517d);
    }

    public final int hashCode() {
        int iHashCode = (this.f165516c.hashCode() + s571.m77243b(Boolean.hashCode(this.f165514a) * 31, 31, this.f165515b)) * 31;
        d850 d850Var = this.f165517d;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
