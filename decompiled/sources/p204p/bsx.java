package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class bsx {

    /* JADX INFO: renamed from: a */
    public final String f30414a;

    /* JADX INFO: renamed from: b */
    public final urx f30415b;

    /* JADX INFO: renamed from: c */
    public final long f30416c;

    /* JADX INFO: renamed from: d */
    public final boolean f30417d;

    public bsx(String str, urx urxVar, long j, boolean z) {
        this.f30414a = str;
        this.f30415b = urxVar;
        this.f30416c = j;
        this.f30417d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bsx)) {
            return false;
        }
        bsx bsxVar = (bsx) obj;
        return wj50.m88271j(this.f30414a, bsxVar.f30414a) && wj50.m88271j(this.f30415b, bsxVar.f30415b) && this.f30416c == bsxVar.f30416c && this.f30417d == bsxVar.f30417d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f30417d) + dq60.m36605e((this.f30415b.hashCode() + (this.f30414a.hashCode() * 31)) * 31, this.f30416c, 31);
    }
}
