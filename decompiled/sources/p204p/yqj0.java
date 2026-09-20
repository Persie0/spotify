package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class yqj0 {

    /* JADX INFO: renamed from: a */
    public final erj0 f275255a;

    /* JADX INFO: renamed from: b */
    public final String f275256b;

    /* JADX INFO: renamed from: c */
    public final String f275257c;

    /* JADX INFO: renamed from: d */
    public final String f275258d;

    public yqj0(erj0 erj0Var, String str, String str2, String str3) {
        this.f275255a = erj0Var;
        this.f275256b = str;
        this.f275257c = str2;
        this.f275258d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yqj0)) {
            return false;
        }
        yqj0 yqj0Var = (yqj0) obj;
        return wj50.m88271j(this.f275255a, yqj0Var.f275255a) && wj50.m88271j(this.f275256b, yqj0Var.f275256b) && wj50.m88271j(this.f275257c, yqj0Var.f275257c) && wj50.m88271j(this.f275258d, yqj0Var.f275258d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f275255a.hashCode() * 31, 31, this.f275256b), 31, this.f275257c);
        String str = this.f275258d;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
