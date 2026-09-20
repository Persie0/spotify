package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class n9j {

    /* JADX INFO: renamed from: a */
    public final int f151809a;

    /* JADX INFO: renamed from: b */
    public final int f151810b;

    /* JADX INFO: renamed from: c */
    public final int f151811c;

    /* JADX INFO: renamed from: d */
    public final String f151812d;

    /* JADX INFO: renamed from: e */
    public final d850 f151813e;

    public n9j(int i, int i2, int i3, String str, d850 d850Var) {
        this.f151809a = i;
        this.f151810b = i2;
        this.f151811c = i3;
        this.f151812d = str;
        this.f151813e = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n9j)) {
            return false;
        }
        n9j n9jVar = (n9j) obj;
        return this.f151809a == n9jVar.f151809a && this.f151810b == n9jVar.f151810b && this.f151811c == n9jVar.f151811c && wj50.m88271j(this.f151812d, n9jVar.f151812d) && wj50.m88271j(this.f151813e, n9jVar.f151813e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(mt60.m62800g(this.f151811c, mt60.m62800g(this.f151810b, Integer.hashCode(this.f151809a) * 31, 31), 31), 31, this.f151812d);
        d850 d850Var = this.f151813e;
        return iM77243b + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
