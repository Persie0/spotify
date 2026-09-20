package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class p0z {

    /* JADX INFO: renamed from: a */
    public final vlu f172870a;

    /* JADX INFO: renamed from: b */
    public final boolean f172871b;

    /* JADX INFO: renamed from: c */
    public final String f172872c;

    /* JADX INFO: renamed from: d */
    public final boolean f172873d;

    public p0z(vlu vluVar, boolean z, String str, boolean z2) {
        this.f172870a = vluVar;
        this.f172871b = z;
        this.f172872c = str;
        this.f172873d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0z)) {
            return false;
        }
        p0z p0zVar = (p0z) obj;
        return wj50.m88271j(this.f172870a, p0zVar.f172870a) && this.f172871b == p0zVar.f172871b && wj50.m88271j(this.f172872c, p0zVar.f172872c) && this.f172873d == p0zVar.f172873d;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(this.f172870a.hashCode() * 31, 31, this.f172871b);
        String str = this.f172872c;
        return Boolean.hashCode(this.f172873d) + ((iM77245d + (str == null ? 0 : str.hashCode())) * 31);
    }
}
