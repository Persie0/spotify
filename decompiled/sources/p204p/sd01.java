package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class sd01 {

    /* JADX INFO: renamed from: a */
    public final wwu f207844a;

    /* JADX INFO: renamed from: b */
    public final Integer f207845b;

    /* JADX INFO: renamed from: c */
    public final Integer f207846c;

    /* JADX INFO: renamed from: d */
    public final xd01 f207847d;

    /* JADX INFO: renamed from: e */
    public final qf40 f207848e;

    public sd01(wwu wwuVar, Integer num, Integer num2, xd01 xd01Var, AbstractC2524w8 abstractC2524w8, int i) {
        num = (i & 4) != 0 ? null : num;
        num2 = (i & 16) != 0 ? null : num2;
        xd01Var = (i & 128) != 0 ? null : xd01Var;
        this.f207844a = wwuVar;
        this.f207845b = num;
        this.f207846c = num2;
        this.f207847d = xd01Var;
        this.f207848e = abstractC2524w8;
        lmg1.m59447r(new Object[]{num, null}, n701.f151029i);
        lmg1.m59447r(new Object[]{num2, null, null}, n701.f151030t);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd01)) {
            return false;
        }
        sd01 sd01Var = (sd01) obj;
        return wj50.m88271j(this.f207844a, sd01Var.f207844a) && wj50.m88271j(this.f207845b, sd01Var.f207845b) && wj50.m88271j(this.f207846c, sd01Var.f207846c) && wj50.m88271j(this.f207847d, sd01Var.f207847d) && wj50.m88271j(this.f207848e, sd01Var.f207848e);
    }

    public final int hashCode() {
        int iHashCode = this.f207844a.hashCode() * 31;
        Integer num = this.f207845b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 961;
        Integer num2 = this.f207846c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 29791;
        xd01 xd01Var = this.f207847d;
        return this.f207848e.hashCode() + ((iHashCode3 + (xd01Var != null ? xd01Var.hashCode() : 0)) * 31);
    }
}
