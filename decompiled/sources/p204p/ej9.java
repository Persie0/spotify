package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ej9 {

    /* JADX INFO: renamed from: a */
    public final String f60160a;

    /* JADX INFO: renamed from: b */
    public final String f60161b;

    /* JADX INFO: renamed from: c */
    public final int f60162c;

    /* JADX INFO: renamed from: d */
    public final String f60163d;

    /* JADX INFO: renamed from: e */
    public final int f60164e;

    /* JADX INFO: renamed from: f */
    public final String f60165f;

    public ej9(int i, int i2, String str, String str2, String str3, String str4) {
        this.f60160a = str;
        this.f60161b = str2;
        this.f60162c = i;
        this.f60163d = str3;
        this.f60164e = i2;
        this.f60165f = str4;
    }

    /* JADX INFO: renamed from: a */
    public final String m39163a() {
        return this.f60160a;
    }

    /* JADX INFO: renamed from: b */
    public final int m39164b() {
        return this.f60164e;
    }

    /* JADX INFO: renamed from: c */
    public final String m39165c() {
        return this.f60165f;
    }

    /* JADX INFO: renamed from: d */
    public final String m39166d() {
        return this.f60161b;
    }

    /* JADX INFO: renamed from: e */
    public final String m39167e() {
        return this.f60163d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ej9)) {
            return false;
        }
        ej9 ej9Var = (ej9) obj;
        return wj50.m88271j(this.f60160a, ej9Var.f60160a) && wj50.m88271j(this.f60161b, ej9Var.f60161b) && this.f60162c == ej9Var.f60162c && wj50.m88271j(this.f60163d, ej9Var.f60163d) && this.f60164e == ej9Var.f60164e && wj50.m88271j(this.f60165f, ej9Var.f60165f);
    }

    /* JADX INFO: renamed from: f */
    public final int m39168f() {
        return this.f60162c;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m39169g(ej9 ej9Var, int i) {
        return wj50.m88271j(this.f60160a, ej9Var.f60160a) && wj50.m88271j(this.f60161b, ej9Var.f60161b) && Math.abs(this.f60162c - ej9Var.f60162c) < i && wj50.m88271j(this.f60163d, ej9Var.f60163d) && this.f60164e == ej9Var.f60164e && wj50.m88271j(this.f60165f, ej9Var.f60165f);
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f60164e, s571.m77243b(mt60.m62800g(this.f60162c, s571.m77243b(this.f60160a.hashCode() * 31, 31, this.f60161b), 31), 31, this.f60163d), 31);
        String str = this.f60165f;
        return iM62800g + (str == null ? 0 : str.hashCode());
    }
}
