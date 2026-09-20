package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ddu0 {

    /* JADX INFO: renamed from: a */
    public final String f47870a;

    /* JADX INFO: renamed from: b */
    public final long f47871b;

    /* JADX INFO: renamed from: c */
    public final cdu0 f47872c;

    public ddu0(String str, long j, cdu0 cdu0Var) {
        this.f47870a = str;
        this.f47871b = j;
        this.f47872c = cdu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ddu0)) {
            return false;
        }
        ddu0 ddu0Var = (ddu0) obj;
        return wj50.m88271j(this.f47870a, ddu0Var.f47870a) && this.f47871b == ddu0Var.f47871b && wj50.m88271j(this.f47872c, ddu0Var.f47872c);
    }

    public final int hashCode() {
        return this.f47872c.f36950a.hashCode() + dq60.m36605e(this.f47870a.hashCode() * 31, this.f47871b, 31);
    }
}
