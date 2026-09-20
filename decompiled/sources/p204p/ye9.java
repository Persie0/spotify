package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ye9 {

    /* JADX INFO: renamed from: a */
    public int f271939a;

    /* JADX INFO: renamed from: b */
    public int f271940b;

    /* JADX INFO: renamed from: c */
    public String f271941c;

    /* JADX INFO: renamed from: a */
    public static C2477v m93531a() {
        C2477v c2477v = new C2477v();
        c2477v.f235860b = 0;
        c2477v.f235861c = "";
        return c2477v;
    }

    public final String toString() {
        int i = this.f271939a;
        int i2 = mmf1.f145137a;
        zgf1 zgf1Var = oif1.f165810c;
        Integer numValueOf = Integer.valueOf(i);
        return edb.m38566o("Response Code: ", (!zgf1Var.containsKey(numValueOf) ? oif1.RESPONSE_CODE_UNSPECIFIED : (oif1) zgf1Var.get(numValueOf)).toString(), ", Debug Message: ", this.f271941c);
    }
}
