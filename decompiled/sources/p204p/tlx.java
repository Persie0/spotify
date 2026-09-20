package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class tlx implements vwf {

    /* JADX INFO: renamed from: a */
    public final String f221533a;

    /* JADX INFO: renamed from: b */
    public final boolean f221534b;

    /* JADX INFO: renamed from: c */
    public final String f221535c;

    public tlx(String str, String str2, boolean z) {
        this.f221533a = str;
        this.f221534b = z;
        this.f221535c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tlx)) {
            return false;
        }
        tlx tlxVar = (tlx) obj;
        return wj50.m88271j(this.f221533a, tlxVar.f221533a) && this.f221534b == tlxVar.f221534b && wj50.m88271j(this.f221535c, tlxVar.f221535c);
    }

    public final int hashCode() {
        return this.f221535c.hashCode() + s571.m77245d(this.f221533a.hashCode() * 31, 31, this.f221534b);
    }
}
