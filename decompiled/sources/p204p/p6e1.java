package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class p6e1 {

    /* JADX INFO: renamed from: a */
    public final n6e1 f174352a;

    /* JADX INFO: renamed from: b */
    public final Boolean f174353b;

    /* JADX INFO: renamed from: c */
    public final String f174354c;

    public p6e1(n6e1 n6e1Var, Boolean bool, String str) {
        this.f174352a = n6e1Var;
        this.f174353b = bool;
        this.f174354c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6e1)) {
            return false;
        }
        p6e1 p6e1Var = (p6e1) obj;
        return wj50.m88271j(this.f174352a, p6e1Var.f174352a) && wj50.m88271j(this.f174353b, p6e1Var.f174353b) && wj50.m88271j(this.f174354c, p6e1Var.f174354c);
    }

    public final int hashCode() {
        int iHashCode = this.f174352a.hashCode() * 31;
        Boolean bool = this.f174353b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f174354c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public /* synthetic */ p6e1() {
        this(new n6e1((Integer) null, (y3e1) null, (Boolean) null, (Boolean) null, (Integer) null, 63), null, null);
    }
}
