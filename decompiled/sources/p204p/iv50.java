package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class iv50 {

    /* JADX INFO: renamed from: a */
    public final qp51 f106139a;

    /* JADX INFO: renamed from: b */
    public final is50 f106140b;

    /* JADX INFO: renamed from: c */
    public final String f106141c;

    /* JADX INFO: renamed from: d */
    public final b6l f106142d;

    /* JADX INFO: renamed from: e */
    public final boolean f106143e;

    public iv50(qp51 qp51Var, is50 is50Var, String str, b6l b6lVar, boolean z) {
        this.f106139a = qp51Var;
        this.f106140b = is50Var;
        this.f106141c = str;
        this.f106142d = b6lVar;
        this.f106143e = z;
    }

    /* JADX INFO: renamed from: a */
    public static iv50 m51737a(iv50 iv50Var, is50 is50Var, String str, b6l b6lVar, int i) {
        qp51 qp51Var = iv50Var.f106139a;
        if ((i & 2) != 0) {
            is50Var = iv50Var.f106140b;
        }
        is50 is50Var2 = is50Var;
        if ((i & 4) != 0) {
            str = iv50Var.f106141c;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            b6lVar = iv50Var.f106142d;
        }
        b6l b6lVar2 = b6lVar;
        boolean z = (i & 16) != 0 ? iv50Var.f106143e : true;
        iv50Var.getClass();
        return new iv50(qp51Var, is50Var2, str2, b6lVar2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iv50)) {
            return false;
        }
        iv50 iv50Var = (iv50) obj;
        return wj50.m88271j(this.f106139a, iv50Var.f106139a) && wj50.m88271j(this.f106140b, iv50Var.f106140b) && wj50.m88271j(this.f106141c, iv50Var.f106141c) && wj50.m88271j(this.f106142d, iv50Var.f106142d) && this.f106143e == iv50Var.f106143e;
    }

    public final int hashCode() {
        int iHashCode = (this.f106140b.hashCode() + (this.f106139a.hashCode() * 31)) * 31;
        String str = this.f106141c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        b6l b6lVar = this.f106142d;
        return Boolean.hashCode(this.f106143e) + ((iHashCode2 + (b6lVar != null ? b6lVar.hashCode() : 0)) * 31);
    }
}
