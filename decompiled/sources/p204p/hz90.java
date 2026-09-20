package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class hz90 {

    /* JADX INFO: renamed from: a */
    public final k69 f96840a;

    /* JADX INFO: renamed from: b */
    public final k69 f96841b;

    /* JADX INFO: renamed from: c */
    public final long f96842c;

    /* JADX INFO: renamed from: d */
    public final long f96843d;

    /* JADX INFO: renamed from: e */
    public final Float f96844e;

    /* JADX INFO: renamed from: f */
    public final Float f96845f;

    public hz90(k69 k69Var, k69 k69Var2, long j, long j2, Float f, Float f2) {
        this.f96840a = k69Var;
        this.f96841b = k69Var2;
        this.f96842c = j;
        this.f96843d = j2;
        this.f96844e = f;
        this.f96845f = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hz90)) {
            return false;
        }
        hz90 hz90Var = (hz90) obj;
        return wj50.m88271j(this.f96840a, hz90Var.f96840a) && wj50.m88271j(this.f96841b, hz90Var.f96841b) && this.f96842c == hz90Var.f96842c && this.f96843d == hz90Var.f96843d && wj50.m88271j(this.f96844e, hz90Var.f96844e) && wj50.m88271j(this.f96845f, hz90Var.f96845f);
    }

    public final int hashCode() {
        k69 k69Var = this.f96840a;
        int iHashCode = (k69Var == null ? 0 : k69Var.hashCode()) * 31;
        k69 k69Var2 = this.f96841b;
        int iM36605e = dq60.m36605e(dq60.m36605e((iHashCode + (k69Var2 == null ? 0 : k69Var2.hashCode())) * 31, this.f96842c, 31), this.f96843d, 31);
        Float f = this.f96844e;
        int iHashCode2 = (iM36605e + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.f96845f;
        return iHashCode2 + (f2 != null ? f2.hashCode() : 0);
    }
}
