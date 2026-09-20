package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class orz {

    /* JADX INFO: renamed from: a */
    public final String f168677a;

    /* JADX INFO: renamed from: b */
    public final boolean f168678b;

    /* JADX INFO: renamed from: c */
    public final String f168679c;

    /* JADX INFO: renamed from: d */
    public final String f168680d;

    /* JADX INFO: renamed from: e */
    public final boolean f168681e;

    /* JADX INFO: renamed from: f */
    public final h7z f168682f;

    public orz(String str, boolean z, String str2, String str3, boolean z2, h7z h7zVar) {
        this.f168677a = str;
        this.f168678b = z;
        this.f168679c = str2;
        this.f168680d = str3;
        this.f168681e = z2;
        this.f168682f = h7zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof orz)) {
            return false;
        }
        orz orzVar = (orz) obj;
        return wj50.m88271j(this.f168677a, orzVar.f168677a) && this.f168678b == orzVar.f168678b && wj50.m88271j(this.f168679c, orzVar.f168679c) && wj50.m88271j(this.f168680d, orzVar.f168680d) && this.f168681e == orzVar.f168681e && wj50.m88271j(this.f168682f, orzVar.f168682f);
    }

    public final int hashCode() {
        String str = this.f168677a;
        int iM77245d = s571.m77245d((str == null ? 0 : str.hashCode()) * 31, 31, this.f168678b);
        String str2 = this.f168679c;
        int iHashCode = (iM77245d + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f168680d;
        return this.f168682f.hashCode() + s571.m77245d((iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f168681e);
    }
}
