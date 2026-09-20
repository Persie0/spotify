package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class zx50 {

    /* JADX INFO: renamed from: a */
    public final String f287208a;

    /* JADX INFO: renamed from: b */
    public final tx50 f287209b;

    /* JADX INFO: renamed from: c */
    public final boolean f287210c;

    /* JADX INFO: renamed from: d */
    public final boolean f287211d;

    /* JADX INFO: renamed from: e */
    public final px50 f287212e;

    /* JADX INFO: renamed from: f */
    public final int f287213f;

    /* JADX INFO: renamed from: g */
    public final boolean f287214g;

    /* JADX INFO: renamed from: h */
    public final boolean f287215h;

    /* JADX INFO: renamed from: i */
    public final boolean f287216i;

    /* JADX INFO: renamed from: j */
    public final boolean f287217j;

    /* JADX INFO: renamed from: k */
    public final boolean f287218k;

    public zx50(String str, tx50 tx50Var, boolean z, boolean z2, px50 px50Var, int i, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f287208a = str;
        this.f287209b = tx50Var;
        this.f287210c = z;
        this.f287211d = z2;
        this.f287212e = px50Var;
        this.f287213f = i;
        this.f287214g = z3;
        this.f287215h = z4;
        this.f287216i = z5;
        this.f287217j = z6;
        this.f287218k = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zx50)) {
            return false;
        }
        zx50 zx50Var = (zx50) obj;
        return wj50.m88271j(this.f287208a, zx50Var.f287208a) && wj50.m88271j(this.f287209b, zx50Var.f287209b) && this.f287210c == zx50Var.f287210c && this.f287211d == zx50Var.f287211d && wj50.m88271j(this.f287212e, zx50Var.f287212e) && this.f287213f == zx50Var.f287213f && this.f287214g == zx50Var.f287214g && this.f287215h == zx50Var.f287215h && this.f287216i == zx50Var.f287216i && this.f287217j == zx50Var.f287217j && this.f287218k == zx50Var.f287218k;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d((this.f287209b.hashCode() + (this.f287208a.hashCode() * 31)) * 31, 31, this.f287210c), 31, this.f287211d);
        px50 px50Var = this.f287212e;
        return Boolean.hashCode(this.f287218k) + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(f710.m40938f(this.f287213f, (iM77245d + (px50Var == null ? 0 : px50Var.hashCode())) * 31, 31), 31, this.f287214g), 31, this.f287215h), 31, this.f287216i), 31, this.f287217j);
    }
}
