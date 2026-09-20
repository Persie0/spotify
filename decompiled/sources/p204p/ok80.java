package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ok80 {

    /* JADX INFO: renamed from: a */
    public final int f166294a;

    /* JADX INFO: renamed from: b */
    public final String f166295b;

    /* JADX INFO: renamed from: c */
    public final pk80 f166296c;

    /* JADX INFO: renamed from: d */
    public final int f166297d;

    /* JADX INFO: renamed from: e */
    public final int f166298e;

    /* JADX INFO: renamed from: f */
    public final boolean f166299f;

    public ok80(int i, String str, pk80 pk80Var, int i2, int i3, boolean z) {
        this.f166294a = i;
        this.f166295b = str;
        this.f166296c = pk80Var;
        this.f166297d = i2;
        this.f166298e = i3;
        this.f166299f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ok80)) {
            return false;
        }
        ok80 ok80Var = (ok80) obj;
        return this.f166294a == ok80Var.f166294a && wj50.m88271j(this.f166295b, ok80Var.f166295b) && this.f166296c == ok80Var.f166296c && this.f166297d == ok80Var.f166297d && this.f166298e == ok80Var.f166298e && this.f166299f == ok80Var.f166299f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f166299f) + mt60.m62800g(this.f166298e, mt60.m62800g(this.f166297d, (this.f166296c.hashCode() + s571.m77243b(Integer.hashCode(this.f166294a) * 31, 31, this.f166295b)) * 31, 31), 31);
    }
}
