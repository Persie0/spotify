package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class psf0 {

    /* JADX INFO: renamed from: a */
    public final osf0 f180835a;

    /* JADX INFO: renamed from: b */
    public final String f180836b;

    /* JADX INFO: renamed from: c */
    public final boolean f180837c;

    /* JADX INFO: renamed from: d */
    public final boolean f180838d;

    /* JADX INFO: renamed from: e */
    public final String f180839e;

    /* JADX INFO: renamed from: f */
    public final boolean f180840f;

    public psf0(osf0 osf0Var, String str, boolean z, boolean z2, String str2, boolean z3, int i) {
        z3 = (i & 64) != 0 ? false : z3;
        this.f180835a = osf0Var;
        this.f180836b = str;
        this.f180837c = z;
        this.f180838d = z2;
        this.f180839e = str2;
        this.f180840f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof psf0)) {
            return false;
        }
        psf0 psf0Var = (psf0) obj;
        return wj50.m88271j(this.f180835a, psf0Var.f180835a) && this.f180836b.equals(psf0Var.f180836b) && this.f180837c == psf0Var.f180837c && this.f180838d == psf0Var.f180838d && wj50.m88271j(this.f180839e, psf0Var.f180839e) && this.f180840f == psf0Var.f180840f;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77243b(this.f180835a.hashCode() * 31, 31, this.f180836b), 961, this.f180837c), 31, this.f180838d);
        String str = this.f180839e;
        return Boolean.hashCode(this.f180840f) + ((iM77245d + (str == null ? 0 : str.hashCode())) * 31);
    }
}
