package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class msb1 {

    /* JADX INFO: renamed from: a */
    public final Boolean f146744a;

    /* JADX INFO: renamed from: b */
    public final Boolean f146745b;

    /* JADX INFO: renamed from: c */
    public final Boolean f146746c;

    public /* synthetic */ msb1(int i, Boolean bool, Boolean bool2, Boolean bool3) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof msb1)) {
            return false;
        }
        msb1 msb1Var = (msb1) obj;
        return wj50.m88271j(this.f146744a, msb1Var.f146744a) && wj50.m88271j(this.f146745b, msb1Var.f146745b) && wj50.m88271j(this.f146746c, msb1Var.f146746c);
    }

    public final int hashCode() {
        Boolean bool = this.f146744a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f146745b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f146746c;
        return iHashCode2 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public msb1(Boolean bool, Boolean bool2, Boolean bool3) {
        this.f146744a = bool;
        this.f146745b = bool2;
        this.f146746c = bool3;
    }
}
