package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class rf90 implements vf90 {

    /* JADX INFO: renamed from: a */
    public final String f198548a;

    /* JADX INFO: renamed from: b */
    public final String f198549b;

    /* JADX INFO: renamed from: c */
    public final String f198550c;

    /* JADX INFO: renamed from: d */
    public final String f198551d;

    /* JADX INFO: renamed from: e */
    public final boolean f198552e;

    /* JADX INFO: renamed from: f */
    public final Long f198553f;

    public rf90(Long l, String str, String str2, String str3, String str4, boolean z) {
        this.f198548a = str;
        this.f198549b = str2;
        this.f198550c = str3;
        this.f198551d = str4;
        this.f198552e = z;
        this.f198553f = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rf90)) {
            return false;
        }
        rf90 rf90Var = (rf90) obj;
        return wj50.m88271j(this.f198548a, rf90Var.f198548a) && wj50.m88271j(this.f198549b, rf90Var.f198549b) && wj50.m88271j(this.f198550c, rf90Var.f198550c) && wj50.m88271j(this.f198551d, rf90Var.f198551d) && this.f198552e == rf90Var.f198552e && wj50.m88271j(this.f198553f, rf90Var.f198553f);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f198548a.hashCode() * 31, 31, this.f198549b), 31, this.f198550c);
        String str = this.f198551d;
        int iM77245d = s571.m77245d((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f198552e);
        Long l = this.f198553f;
        return iM77245d + (l != null ? l.hashCode() : 0);
    }
}
