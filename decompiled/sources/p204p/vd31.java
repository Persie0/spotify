package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class vd31 {

    /* JADX INFO: renamed from: a */
    public final String f240305a;

    /* JADX INFO: renamed from: b */
    public final String f240306b;

    /* JADX INFO: renamed from: c */
    public final String f240307c;

    /* JADX INFO: renamed from: d */
    public final Integer f240308d;

    public vd31(String str, String str2, Integer num, String str3) {
        this.f240305a = str;
        this.f240306b = str2;
        this.f240307c = str3;
        this.f240308d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd31)) {
            return false;
        }
        vd31 vd31Var = (vd31) obj;
        return wj50.m88271j(this.f240305a, vd31Var.f240305a) && wj50.m88271j(this.f240306b, vd31Var.f240306b) && wj50.m88271j(this.f240307c, vd31Var.f240307c) && wj50.m88271j(this.f240308d, vd31Var.f240308d);
    }

    public final int hashCode() {
        int iHashCode = this.f240305a.hashCode() * 31;
        String str = this.f240306b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f240307c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f240308d;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }
}
