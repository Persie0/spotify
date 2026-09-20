package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class l9j {

    /* JADX INFO: renamed from: a */
    public final int f131133a;

    /* JADX INFO: renamed from: b */
    public final int f131134b;

    /* JADX INFO: renamed from: c */
    public final int f131135c;

    /* JADX INFO: renamed from: d */
    public final String f131136d;

    /* JADX INFO: renamed from: e */
    public final d850 f131137e;

    public l9j(int i, int i2, int i3, String str, d850 d850Var) {
        this.f131133a = i;
        this.f131134b = i2;
        this.f131135c = i3;
        this.f131136d = str;
        this.f131137e = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9j)) {
            return false;
        }
        l9j l9jVar = (l9j) obj;
        return this.f131133a == l9jVar.f131133a && this.f131134b == l9jVar.f131134b && this.f131135c == l9jVar.f131135c && wj50.m88271j(this.f131136d, l9jVar.f131136d) && wj50.m88271j(this.f131137e, l9jVar.f131137e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(mt60.m62800g(this.f131135c, mt60.m62800g(this.f131134b, Integer.hashCode(this.f131133a) * 31, 31), 31), 31, this.f131136d);
        d850 d850Var = this.f131137e;
        return iM77243b + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
