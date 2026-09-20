package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vbc1 extends bcc1 {

    /* JADX INFO: renamed from: a */
    public final Object f239472a;

    /* JADX INFO: renamed from: b */
    public final String f239473b;

    /* JADX INFO: renamed from: c */
    public final ume f239474c;

    /* JADX INFO: renamed from: d */
    public final om01 f239475d;

    public vbc1(Object obj, String str, ume umeVar, om01 om01Var) {
        this.f239472a = obj;
        this.f239473b = str;
        this.f239474c = umeVar;
        this.f239475d = om01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vbc1)) {
            return false;
        }
        vbc1 vbc1Var = (vbc1) obj;
        return wj50.m88271j(this.f239472a, vbc1Var.f239472a) && wj50.m88271j(this.f239473b, vbc1Var.f239473b) && wj50.m88271j(this.f239474c, vbc1Var.f239474c) && wj50.m88271j(this.f239475d, vbc1Var.f239475d);
    }

    public final int hashCode() {
        int iM77349b = s6x0.m77349b(this.f239472a) * 31;
        String str = this.f239473b;
        int iHashCode = (iM77349b + (str == null ? 0 : str.hashCode())) * 31;
        ume umeVar = this.f239474c;
        return this.f239475d.hashCode() + ((iHashCode + (umeVar != null ? umeVar.hashCode() : 0)) * 31);
    }
}
