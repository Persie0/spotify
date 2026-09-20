package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class kxz {

    /* JADX INFO: renamed from: a */
    public final String f127604a;

    /* JADX INFO: renamed from: b */
    public final String f127605b;

    /* JADX INFO: renamed from: c */
    public final boolean f127606c;

    /* JADX INFO: renamed from: d */
    public final boolean f127607d;

    /* JADX INFO: renamed from: e */
    public final boolean f127608e;

    public kxz(String str, String str2, boolean z, boolean z2, boolean z3) {
        this.f127604a = str;
        this.f127605b = str2;
        this.f127606c = z;
        this.f127607d = z2;
        this.f127608e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kxz)) {
            return false;
        }
        kxz kxzVar = (kxz) obj;
        return wj50.m88271j(this.f127604a, kxzVar.f127604a) && wj50.m88271j(this.f127605b, kxzVar.f127605b) && this.f127606c == kxzVar.f127606c && this.f127607d == kxzVar.f127607d && this.f127608e == kxzVar.f127608e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f127608e) + s571.m77245d(s571.m77245d(s571.m77243b(this.f127604a.hashCode() * 31, 31, this.f127605b), 31, this.f127606c), 31, this.f127607d);
    }
}
