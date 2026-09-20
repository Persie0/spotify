package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class thf extends uhf {

    /* JADX INFO: renamed from: b */
    public final String f220415b;

    /* JADX INFO: renamed from: c */
    public final int f220416c;

    /* JADX INFO: renamed from: d */
    public final boolean f220417d;

    public thf(String str, int i, boolean z) {
        super(khf.f122635X);
        this.f220415b = str;
        this.f220416c = i;
        this.f220417d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof thf)) {
            return false;
        }
        thf thfVar = (thf) obj;
        return wj50.m88271j(this.f220415b, thfVar.f220415b) && this.f220416c == thfVar.f220416c && this.f220417d == thfVar.f220417d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f220417d) + mt60.m62800g(this.f220416c, this.f220415b.hashCode() * 31, 31);
    }
}
