package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class sui {

    /* JADX INFO: renamed from: a */
    public final boolean f214127a;

    /* JADX INFO: renamed from: b */
    public final boolean f214128b;

    /* JADX INFO: renamed from: c */
    public final boolean f214129c;

    /* JADX INFO: renamed from: d */
    public final boolean f214130d;

    /* JADX INFO: renamed from: e */
    public final boolean f214131e;

    /* JADX INFO: renamed from: f */
    public final String f214132f;

    /* JADX INFO: renamed from: g */
    public final String f214133g;

    public sui(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, String str2) {
        this.f214127a = z;
        this.f214128b = z2;
        this.f214129c = z3;
        this.f214130d = z4;
        this.f214131e = z5;
        this.f214132f = str;
        this.f214133g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sui)) {
            return false;
        }
        sui suiVar = (sui) obj;
        return this.f214127a == suiVar.f214127a && this.f214128b == suiVar.f214128b && this.f214129c == suiVar.f214129c && this.f214130d == suiVar.f214130d && this.f214131e == suiVar.f214131e && wj50.m88271j(this.f214132f, suiVar.f214132f) && wj50.m88271j(this.f214133g, suiVar.f214133g);
    }

    public final int hashCode() {
        return this.f214133g.hashCode() + s571.m77243b(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(Boolean.hashCode(this.f214127a) * 31, 31, this.f214128b), 31, this.f214129c), 31, this.f214130d), 31, this.f214131e), 31, this.f214132f);
    }
}
