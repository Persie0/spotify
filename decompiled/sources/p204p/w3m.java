package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class w3m {

    /* JADX INFO: renamed from: a */
    public final boolean f247607a;

    /* JADX INFO: renamed from: b */
    public final String f247608b;

    /* JADX INFO: renamed from: c */
    public final String f247609c;

    /* JADX INFO: renamed from: d */
    public final boolean f247610d;

    /* JADX INFO: renamed from: e */
    public final u3m f247611e;

    /* JADX INFO: renamed from: f */
    public final p3m f247612f;

    /* JADX INFO: renamed from: g */
    public final String f247613g;

    /* JADX INFO: renamed from: h */
    public final String f247614h;

    public w3m(boolean z, String str, String str2, boolean z2, u3m u3mVar, p3m p3mVar, String str3, String str4) {
        this.f247607a = z;
        this.f247608b = str;
        this.f247609c = str2;
        this.f247610d = z2;
        this.f247611e = u3mVar;
        this.f247612f = p3mVar;
        this.f247613g = str3;
        this.f247614h = str4;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m87110a() {
        return this.f247607a;
    }

    /* JADX INFO: renamed from: b */
    public final u3m m87111b() {
        return this.f247611e;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m87112c() {
        return this.f247610d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3m)) {
            return false;
        }
        w3m w3mVar = (w3m) obj;
        return this.f247607a == w3mVar.f247607a && wj50.m88271j(this.f247608b, w3mVar.f247608b) && wj50.m88271j(this.f247609c, w3mVar.f247609c) && this.f247610d == w3mVar.f247610d && wj50.m88271j(this.f247611e, w3mVar.f247611e) && wj50.m88271j(this.f247612f, w3mVar.f247612f) && wj50.m88271j(this.f247613g, w3mVar.f247613g) && wj50.m88271j(this.f247614h, w3mVar.f247614h);
    }

    public final int hashCode() {
        int iHashCode = (this.f247612f.hashCode() + ((this.f247611e.hashCode() + s571.m77245d(s571.m77243b(s571.m77243b(Boolean.hashCode(this.f247607a) * 31, 31, this.f247608b), 31, this.f247609c), 31, this.f247610d)) * 31)) * 31;
        String str = this.f247613g;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f247614h;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
