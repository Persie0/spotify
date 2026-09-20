package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class tsy0 extends puy0 {

    /* JADX INFO: renamed from: a */
    public final String f223457a;

    /* JADX INFO: renamed from: b */
    public final String f223458b;

    /* JADX INFO: renamed from: c */
    public final d850 f223459c;

    public tsy0(String str, String str2, d850 d850Var) {
        this.f223457a = str;
        this.f223458b = str2;
        this.f223459c = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tsy0)) {
            return false;
        }
        tsy0 tsy0Var = (tsy0) obj;
        return wj50.m88271j(this.f223457a, tsy0Var.f223457a) && wj50.m88271j(this.f223458b, tsy0Var.f223458b) && wj50.m88271j(this.f223459c, tsy0Var.f223459c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f223457a.hashCode() * 31, 31, this.f223458b);
        d850 d850Var = this.f223459c;
        return iM77243b + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
