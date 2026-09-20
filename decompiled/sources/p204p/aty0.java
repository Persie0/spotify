package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class aty0 extends puy0 {

    /* JADX INFO: renamed from: a */
    public final String f19760a;

    /* JADX INFO: renamed from: b */
    public final String f19761b;

    /* JADX INFO: renamed from: c */
    public final d850 f19762c;

    /* JADX INFO: renamed from: d */
    public final String f19763d;

    /* JADX INFO: renamed from: e */
    public final String f19764e;

    public aty0(String str, String str2, String str3, String str4, d850 d850Var) {
        this.f19760a = str;
        this.f19761b = str2;
        this.f19762c = d850Var;
        this.f19763d = str3;
        this.f19764e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aty0)) {
            return false;
        }
        aty0 aty0Var = (aty0) obj;
        return wj50.m88271j(this.f19760a, aty0Var.f19760a) && wj50.m88271j(this.f19761b, aty0Var.f19761b) && wj50.m88271j(this.f19762c, aty0Var.f19762c) && wj50.m88271j(this.f19763d, aty0Var.f19763d) && wj50.m88271j(this.f19764e, aty0Var.f19764e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f19760a.hashCode() * 31, 31, this.f19761b);
        d850 d850Var = this.f19762c;
        int iHashCode = (iM77243b + (d850Var == null ? 0 : d850Var.hashCode())) * 31;
        String str = this.f19763d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f19764e;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
