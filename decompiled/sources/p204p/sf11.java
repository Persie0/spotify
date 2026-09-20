package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class sf11 implements jr01, n1c {

    /* JADX INFO: renamed from: a */
    public final String f208436a;

    /* JADX INFO: renamed from: b */
    public final fq01 f208437b;

    /* JADX INFO: renamed from: c */
    public final ccl0 f208438c;

    /* JADX INFO: renamed from: d */
    public final ho01 f208439d;

    /* JADX INFO: renamed from: e */
    public final int f208440e;

    public sf11(String str, fq01 fq01Var, ccl0 ccl0Var, ho01 ho01Var, int i) {
        this.f208436a = str;
        this.f208437b = fq01Var;
        this.f208438c = ccl0Var;
        this.f208439d = ho01Var;
        this.f208440e = i;
    }

    @Override // p204p.n1c
    /* JADX INFO: renamed from: a */
    public final int mo60617a() {
        return this.f208440e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sf11)) {
            return false;
        }
        sf11 sf11Var = (sf11) obj;
        return wj50.m88271j(this.f208436a, sf11Var.f208436a) && wj50.m88271j(this.f208437b, sf11Var.f208437b) && wj50.m88271j(this.f208438c, sf11Var.f208438c) && wj50.m88271j(this.f208439d, sf11Var.f208439d) && this.f208440e == sf11Var.f208440e;
    }

    public final int hashCode() {
        int iHashCode = (this.f208437b.hashCode() + (this.f208436a.hashCode() * 31)) * 31;
        ccl0 ccl0Var = this.f208438c;
        return Integer.hashCode(this.f208440e) + ((this.f208439d.hashCode() + ((iHashCode + (ccl0Var == null ? 0 : ccl0Var.hashCode())) * 31)) * 31);
    }
}
