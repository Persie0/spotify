package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ibr {

    /* JADX INFO: renamed from: a */
    public final wwu f100634a;

    /* JADX INFO: renamed from: b */
    public final String f100635b;

    /* JADX INFO: renamed from: c */
    public final String f100636c;

    /* JADX INFO: renamed from: d */
    public final String f100637d;

    /* JADX INFO: renamed from: e */
    public final String f100638e;

    /* JADX INFO: renamed from: f */
    public final xfr f100639f;

    /* JADX INFO: renamed from: g */
    public final boolean f100640g;

    public ibr(wwu wwuVar, String str, String str2, String str3, String str4, xfr xfrVar, boolean z) {
        this.f100634a = wwuVar;
        this.f100635b = str;
        this.f100636c = str2;
        this.f100637d = str3;
        this.f100638e = str4;
        this.f100639f = xfrVar;
        this.f100640g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ibr)) {
            return false;
        }
        ibr ibrVar = (ibr) obj;
        return wj50.m88271j(this.f100634a, ibrVar.f100634a) && wj50.m88271j(this.f100635b, ibrVar.f100635b) && wj50.m88271j(this.f100636c, ibrVar.f100636c) && wj50.m88271j(this.f100637d, ibrVar.f100637d) && wj50.m88271j(this.f100638e, ibrVar.f100638e) && this.f100639f == ibrVar.f100639f && this.f100640g == ibrVar.f100640g;
    }

    public final int hashCode() {
        wwu wwuVar = this.f100634a;
        return Boolean.hashCode(this.f100640g) + ((this.f100639f.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b((wwuVar == null ? 0 : wwuVar.hashCode()) * 31, 31, this.f100635b), 31, this.f100636c), 31, this.f100637d), 31, this.f100638e)) * 31);
    }
}
