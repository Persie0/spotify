package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class u9j implements v9j {

    /* JADX INFO: renamed from: a */
    public final int f228211a;

    /* JADX INFO: renamed from: b */
    public final int f228212b;

    /* JADX INFO: renamed from: c */
    public final int f228213c;

    /* JADX INFO: renamed from: d */
    public final String f228214d;

    /* JADX INFO: renamed from: e */
    public final d850 f228215e;

    public u9j(int i, int i2, int i3, String str, d850 d850Var) {
        this.f228211a = i;
        this.f228212b = i2;
        this.f228213c = i3;
        this.f228214d = str;
        this.f228215e = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u9j)) {
            return false;
        }
        u9j u9jVar = (u9j) obj;
        return this.f228211a == u9jVar.f228211a && this.f228212b == u9jVar.f228212b && this.f228213c == u9jVar.f228213c && wj50.m88271j(this.f228214d, u9jVar.f228214d) && wj50.m88271j(this.f228215e, u9jVar.f228215e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(mt60.m62800g(this.f228213c, mt60.m62800g(this.f228212b, Integer.hashCode(this.f228211a) * 31, 31), 31), 31, this.f228214d);
        d850 d850Var = this.f228215e;
        return iM77243b + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
