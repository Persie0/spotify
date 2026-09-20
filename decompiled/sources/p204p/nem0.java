package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class nem0 implements pem0 {

    /* JADX INFO: renamed from: a */
    public final voc1 f153028a;

    /* JADX INFO: renamed from: b */
    public final zam0 f153029b;

    /* JADX INFO: renamed from: c */
    public final String f153030c;

    public nem0(voc1 voc1Var, zam0 zam0Var, String str) {
        this.f153028a = voc1Var;
        this.f153029b = zam0Var;
        this.f153030c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nem0)) {
            return false;
        }
        nem0 nem0Var = (nem0) obj;
        return wj50.m88271j(this.f153028a, nem0Var.f153028a) && wj50.m88271j(this.f153029b, nem0Var.f153029b) && wj50.m88271j(this.f153030c, nem0Var.f153030c);
    }

    public final int hashCode() {
        voc1 voc1Var = this.f153028a;
        int iHashCode = (voc1Var == null ? 0 : voc1Var.f243453a.hashCode()) * 31;
        zam0 zam0Var = this.f153029b;
        int iHashCode2 = (iHashCode + (zam0Var == null ? 0 : zam0Var.hashCode())) * 31;
        String str = this.f153030c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
