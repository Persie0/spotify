package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class lty0 extends nty0 {

    /* JADX INFO: renamed from: a */
    public final String f136929a;

    /* JADX INFO: renamed from: b */
    public final String f136930b;

    /* JADX INFO: renamed from: c */
    public final d850 f136931c;

    public lty0(String str, String str2, d850 d850Var) {
        this.f136929a = str;
        this.f136930b = str2;
        this.f136931c = d850Var;
    }

    @Override // p204p.nty0
    /* JADX INFO: renamed from: a */
    public final String mo59921a() {
        return this.f136929a;
    }

    @Override // p204p.nty0
    /* JADX INFO: renamed from: b */
    public final String mo59922b() {
        return this.f136930b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lty0)) {
            return false;
        }
        lty0 lty0Var = (lty0) obj;
        return wj50.m88271j(this.f136929a, lty0Var.f136929a) && wj50.m88271j(this.f136930b, lty0Var.f136930b) && wj50.m88271j(this.f136931c, lty0Var.f136931c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f136929a.hashCode() * 31, 31, this.f136930b);
        d850 d850Var = this.f136931c;
        return nuf.f158633b.hashCode() + ((iM77243b + (d850Var == null ? 0 : d850Var.hashCode())) * 31);
    }
}
