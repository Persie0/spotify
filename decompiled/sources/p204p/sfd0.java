package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class sfd0 {

    /* JADX INFO: renamed from: a */
    public final String f208532a;

    /* JADX INFO: renamed from: b */
    public final String f208533b;

    /* JADX INFO: renamed from: c */
    public final yfd0 f208534c;

    /* JADX INFO: renamed from: d */
    public final int f208535d;

    /* JADX INFO: renamed from: e */
    public final long f208536e;

    public sfd0(String str, String str2, yfd0 yfd0Var, int i, long j) {
        this.f208532a = str;
        this.f208533b = str2;
        this.f208534c = yfd0Var;
        this.f208535d = i;
        this.f208536e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sfd0)) {
            return false;
        }
        sfd0 sfd0Var = (sfd0) obj;
        return wj50.m88271j(this.f208532a, sfd0Var.f208532a) && wj50.m88271j(this.f208533b, sfd0Var.f208533b) && this.f208534c.equals(sfd0Var.f208534c) && this.f208535d == sfd0Var.f208535d && this.f208536e == sfd0Var.f208536e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f208536e) + f710.m40938f(this.f208535d, (this.f208534c.hashCode() + s571.m77243b(this.f208532a.hashCode() * 31, 31, this.f208533b)) * 31, 31);
    }
}
