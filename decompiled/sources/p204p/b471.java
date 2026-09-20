package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class b471 extends c471 {

    /* JADX INFO: renamed from: a */
    public final String f23242a;

    /* JADX INFO: renamed from: b */
    public final ume f23243b;

    /* JADX INFO: renamed from: c */
    public final om01 f23244c;

    public b471(String str, ume umeVar, om01 om01Var) {
        this.f23242a = str;
        this.f23243b = umeVar;
        this.f23244c = om01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b471)) {
            return false;
        }
        b471 b471Var = (b471) obj;
        return wj50.m88271j(this.f23242a, b471Var.f23242a) && wj50.m88271j(this.f23243b, b471Var.f23243b) && wj50.m88271j(this.f23244c, b471Var.f23244c);
    }

    public final int hashCode() {
        int iHashCode = this.f23242a.hashCode() * 31;
        ume umeVar = this.f23243b;
        int iHashCode2 = (iHashCode + (umeVar == null ? 0 : umeVar.hashCode())) * 31;
        om01 om01Var = this.f23244c;
        return iHashCode2 + (om01Var != null ? om01Var.hashCode() : 0);
    }
}
