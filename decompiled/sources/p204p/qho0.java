package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class qho0 extends tho0 {

    /* JADX INFO: renamed from: a */
    public final boolean f188812a;

    /* JADX INFO: renamed from: b */
    public final String f188813b;

    /* JADX INFO: renamed from: c */
    public final yzv f188814c;

    /* JADX INFO: renamed from: d */
    public final d850 f188815d;

    /* JADX INFO: renamed from: e */
    public final long f188816e;

    public qho0(boolean z, String str, yzv yzvVar, d850 d850Var, long j) {
        this.f188812a = z;
        this.f188813b = str;
        this.f188814c = yzvVar;
        this.f188815d = d850Var;
        this.f188816e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qho0)) {
            return false;
        }
        qho0 qho0Var = (qho0) obj;
        return this.f188812a == qho0Var.f188812a && wj50.m88271j(this.f188813b, qho0Var.f188813b) && this.f188814c == qho0Var.f188814c && wj50.m88271j(this.f188815d, qho0Var.f188815d) && this.f188816e == qho0Var.f188816e;
    }

    public final int hashCode() {
        int iHashCode = (this.f188814c.hashCode() + s571.m77243b(Boolean.hashCode(this.f188812a) * 31, 31, this.f188813b)) * 31;
        d850 d850Var = this.f188815d;
        return Long.hashCode(this.f188816e) + ((iHashCode + (d850Var == null ? 0 : d850Var.hashCode())) * 31);
    }
}
