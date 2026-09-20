package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ll81 {

    /* JADX INFO: renamed from: a */
    public final String f134567a;

    /* JADX INFO: renamed from: b */
    public final wl81 f134568b;

    /* JADX INFO: renamed from: c */
    public final kl81 f134569c;

    /* JADX INFO: renamed from: d */
    public final int f134570d;

    /* JADX INFO: renamed from: e */
    public final int f134571e;

    /* JADX INFO: renamed from: f */
    public final String f134572f;

    public ll81(String str, wl81 wl81Var, kl81 kl81Var, int i, int i2, String str2) {
        this.f134567a = str;
        this.f134568b = wl81Var;
        this.f134569c = kl81Var;
        this.f134570d = i;
        this.f134571e = i2;
        this.f134572f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ll81)) {
            return false;
        }
        ll81 ll81Var = (ll81) obj;
        return wj50.m88271j(this.f134567a, ll81Var.f134567a) && wj50.m88271j(this.f134568b, ll81Var.f134568b) && wj50.m88271j(this.f134569c, ll81Var.f134569c) && this.f134570d == ll81Var.f134570d && this.f134571e == ll81Var.f134571e && wj50.m88271j(this.f134572f, ll81Var.f134572f);
    }

    public final int hashCode() {
        int iHashCode = this.f134567a.hashCode() * 31;
        this.f134568b.getClass();
        int iM62800g = mt60.m62800g(this.f134571e, mt60.m62800g(this.f134570d, (this.f134569c.hashCode() + ((iHashCode + 1396393329) * 31)) * 31, 31), 31);
        String str = this.f134572f;
        return iM62800g + (str == null ? 0 : str.hashCode());
    }
}
