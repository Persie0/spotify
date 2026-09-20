package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class sjl {

    /* JADX INFO: renamed from: a */
    public final String f209868a;

    /* JADX INFO: renamed from: b */
    public final String f209869b;

    /* JADX INFO: renamed from: c */
    public final njl f209870c;

    /* JADX INFO: renamed from: d */
    public final njl f209871d;

    public sjl(String str, String str2, njl njlVar, njl njlVar2) {
        this.f209868a = str;
        this.f209869b = str2;
        this.f209870c = njlVar;
        this.f209871d = njlVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sjl)) {
            return false;
        }
        sjl sjlVar = (sjl) obj;
        return wj50.m88271j(this.f209868a, sjlVar.f209868a) && wj50.m88271j(this.f209869b, sjlVar.f209869b) && wj50.m88271j(this.f209870c, sjlVar.f209870c) && wj50.m88271j(this.f209871d, sjlVar.f209871d);
    }

    public final int hashCode() {
        return this.f209871d.hashCode() + ((this.f209870c.hashCode() + s571.m77243b(this.f209868a.hashCode() * 31, 31, this.f209869b)) * 31);
    }

    public /* synthetic */ sjl(String str, njl njlVar, njl njlVar2) {
        this(str, "", njlVar, njlVar2);
    }
}
