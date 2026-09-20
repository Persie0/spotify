package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class fhe0 {

    /* JADX INFO: renamed from: a */
    public final ehe0 f69640a;

    /* JADX INFO: renamed from: b */
    public final String f69641b;

    /* JADX INFO: renamed from: c */
    public final boolean f69642c;

    /* JADX INFO: renamed from: d */
    public final String f69643d;

    /* JADX INFO: renamed from: e */
    public final d850 f69644e;

    /* JADX INFO: renamed from: f */
    public final String f69645f;

    /* JADX INFO: renamed from: g */
    public final boolean f69646g;

    /* JADX INFO: renamed from: h */
    public final boolean f69647h;

    public fhe0(ehe0 ehe0Var, String str, boolean z, String str2, d850 d850Var, String str3, boolean z2, boolean z3) {
        this.f69640a = ehe0Var;
        this.f69641b = str;
        this.f69642c = z;
        this.f69643d = str2;
        this.f69644e = d850Var;
        this.f69645f = str3;
        this.f69646g = z2;
        this.f69647h = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fhe0)) {
            return false;
        }
        fhe0 fhe0Var = (fhe0) obj;
        return this.f69640a == fhe0Var.f69640a && wj50.m88271j(this.f69641b, fhe0Var.f69641b) && this.f69642c == fhe0Var.f69642c && wj50.m88271j(this.f69643d, fhe0Var.f69643d) && wj50.m88271j(this.f69644e, fhe0Var.f69644e) && wj50.m88271j(this.f69645f, fhe0Var.f69645f) && this.f69646g == fhe0Var.f69646g && this.f69647h == fhe0Var.f69647h;
    }

    public final int hashCode() {
        int iHashCode = (this.f69644e.hashCode() + s571.m77243b(s571.m77245d(s571.m77243b(s571.m77245d(this.f69640a.hashCode() * 31, 31, true), 31, this.f69641b), 31, this.f69642c), 31, this.f69643d)) * 31;
        String str = this.f69645f;
        return Boolean.hashCode(this.f69647h) + s571.m77245d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f69646g);
    }
}
