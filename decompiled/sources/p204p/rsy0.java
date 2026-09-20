package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class rsy0 extends puy0 {

    /* JADX INFO: renamed from: a */
    public final String f202451a;

    /* JADX INFO: renamed from: b */
    public final d850 f202452b;

    /* JADX INFO: renamed from: c */
    public final boolean f202453c;

    /* JADX INFO: renamed from: d */
    public final boolean f202454d;

    public rsy0(String str, d850 d850Var, boolean z, boolean z2) {
        this.f202451a = str;
        this.f202452b = d850Var;
        this.f202453c = z;
        this.f202454d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rsy0)) {
            return false;
        }
        rsy0 rsy0Var = (rsy0) obj;
        return wj50.m88271j(this.f202451a, rsy0Var.f202451a) && wj50.m88271j(this.f202452b, rsy0Var.f202452b) && this.f202453c == rsy0Var.f202453c && this.f202454d == rsy0Var.f202454d;
    }

    public final int hashCode() {
        int iHashCode = this.f202451a.hashCode() * 31;
        d850 d850Var = this.f202452b;
        return Boolean.hashCode(this.f202454d) + s571.m77245d((iHashCode + (d850Var == null ? 0 : d850Var.hashCode())) * 31, 31, this.f202453c);
    }
}
