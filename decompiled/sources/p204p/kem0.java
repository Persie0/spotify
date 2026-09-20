package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class kem0 implements pem0 {

    /* JADX INFO: renamed from: a */
    public final voc1 f121915a;

    /* JADX INFO: renamed from: b */
    public final zam0 f121916b;

    /* JADX INFO: renamed from: c */
    public final bnm0 f121917c;

    /* JADX INFO: renamed from: d */
    public final String f121918d;

    public kem0(voc1 voc1Var, zam0 zam0Var, bnm0 bnm0Var, String str) {
        this.f121915a = voc1Var;
        this.f121916b = zam0Var;
        this.f121917c = bnm0Var;
        this.f121918d = str;
    }

    /* JADX INFO: renamed from: a */
    public static kem0 m56228a(kem0 kem0Var, bnm0 bnm0Var) {
        voc1 voc1Var = kem0Var.f121915a;
        zam0 zam0Var = kem0Var.f121916b;
        String str = kem0Var.f121918d;
        kem0Var.getClass();
        return new kem0(voc1Var, zam0Var, bnm0Var, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kem0)) {
            return false;
        }
        kem0 kem0Var = (kem0) obj;
        return wj50.m88271j(this.f121915a, kem0Var.f121915a) && wj50.m88271j(this.f121916b, kem0Var.f121916b) && wj50.m88271j(this.f121917c, kem0Var.f121917c) && wj50.m88271j(this.f121918d, kem0Var.f121918d);
    }

    public final int hashCode() {
        voc1 voc1Var = this.f121915a;
        int iHashCode = (voc1Var == null ? 0 : voc1Var.f243453a.hashCode()) * 31;
        zam0 zam0Var = this.f121916b;
        int iHashCode2 = (iHashCode + (zam0Var == null ? 0 : zam0Var.hashCode())) * 31;
        bnm0 bnm0Var = this.f121917c;
        int iHashCode3 = (iHashCode2 + (bnm0Var == null ? 0 : bnm0Var.hashCode())) * 31;
        String str = this.f121918d;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public /* synthetic */ kem0(voc1 voc1Var, zam0 zam0Var, bnm0 bnm0Var, String str, int i) {
        this(voc1Var, zam0Var, (i & 4) != 0 ? null : bnm0Var, (i & 8) != 0 ? null : str);
    }
}
