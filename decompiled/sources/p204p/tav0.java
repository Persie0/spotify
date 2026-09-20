package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class tav0 implements i4e {

    /* JADX INFO: renamed from: a */
    public final String f218697a;

    /* JADX INFO: renamed from: b */
    public final String f218698b;

    /* JADX INFO: renamed from: c */
    public final int f218699c;

    /* JADX INFO: renamed from: d */
    public final String f218700d;

    /* JADX INFO: renamed from: e */
    public final String f218701e;

    public tav0(int i, String str, String str2, String str3, String str4) {
        this.f218697a = str;
        this.f218698b = str2;
        this.f218699c = i;
        this.f218700d = str3;
        this.f218701e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tav0)) {
            return false;
        }
        tav0 tav0Var = (tav0) obj;
        return wj50.m88271j(this.f218697a, tav0Var.f218697a) && wj50.m88271j(this.f218698b, tav0Var.f218698b) && this.f218699c == tav0Var.f218699c && wj50.m88271j(this.f218700d, tav0Var.f218700d) && wj50.m88271j(this.f218701e, tav0Var.f218701e);
    }

    public final int hashCode() {
        return this.f218701e.hashCode() + s571.m77243b(mt60.m62800g(this.f218699c, s571.m77243b(this.f218697a.hashCode() * 31, 31, this.f218698b), 31), 31, this.f218700d);
    }
}
