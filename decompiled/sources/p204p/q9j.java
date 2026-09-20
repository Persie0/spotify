package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class q9j implements v9j {

    /* JADX INFO: renamed from: a */
    public final int f186606a;

    /* JADX INFO: renamed from: b */
    public final int f186607b;

    /* JADX INFO: renamed from: c */
    public final int f186608c;

    /* JADX INFO: renamed from: d */
    public final String f186609d;

    /* JADX INFO: renamed from: e */
    public final d850 f186610e;

    public q9j(int i, int i2, int i3, String str, d850 d850Var) {
        this.f186606a = i;
        this.f186607b = i2;
        this.f186608c = i3;
        this.f186609d = str;
        this.f186610e = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q9j)) {
            return false;
        }
        q9j q9jVar = (q9j) obj;
        return this.f186606a == q9jVar.f186606a && this.f186607b == q9jVar.f186607b && this.f186608c == q9jVar.f186608c && wj50.m88271j(this.f186609d, q9jVar.f186609d) && wj50.m88271j(this.f186610e, q9jVar.f186610e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(mt60.m62800g(this.f186608c, mt60.m62800g(this.f186607b, Integer.hashCode(this.f186606a) * 31, 31), 31), 31, this.f186609d);
        d850 d850Var = this.f186610e;
        return iM77243b + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
