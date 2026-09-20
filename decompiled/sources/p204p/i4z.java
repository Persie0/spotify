package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class i4z extends k4z {

    /* JADX INFO: renamed from: a */
    public final String f98661a;

    /* JADX INFO: renamed from: b */
    public final String f98662b;

    /* JADX INFO: renamed from: c */
    public final AbstractC2524w8 f98663c;

    /* JADX INFO: renamed from: d */
    public final String f98664d;

    public i4z(String str, String str2, AbstractC2524w8 abstractC2524w8, String str3) {
        this.f98661a = str;
        this.f98662b = str2;
        this.f98663c = abstractC2524w8;
        this.f98664d = str3;
    }

    @Override // p204p.k4z
    /* JADX INFO: renamed from: a */
    public final String mo49690a() {
        return this.f98661a;
    }

    @Override // p204p.k4z
    /* JADX INFO: renamed from: b */
    public final String mo49691b() {
        return this.f98662b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i4z)) {
            return false;
        }
        i4z i4zVar = (i4z) obj;
        return wj50.m88271j(this.f98661a, i4zVar.f98661a) && wj50.m88271j(this.f98662b, i4zVar.f98662b) && wj50.m88271j(this.f98663c, i4zVar.f98663c) && wj50.m88271j(this.f98664d, i4zVar.f98664d);
    }

    public final int hashCode() {
        int iHashCode = (this.f98663c.hashCode() + f710.m40938f(1, s571.m77243b(this.f98661a.hashCode() * 31, 31, this.f98662b), 31)) * 31;
        String str = this.f98664d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
