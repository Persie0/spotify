package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class llt implements pmt {

    /* JADX INFO: renamed from: a */
    public final String f134696a;

    /* JADX INFO: renamed from: b */
    public final String f134697b;

    public llt(String str, String str2) {
        this.f134696a = str;
        this.f134697b = str2;
    }

    /* JADX INFO: renamed from: b */
    public final String m59311b() {
        return this.f134697b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof llt)) {
            return false;
        }
        llt lltVar = (llt) obj;
        return wj50.m88271j(this.f134696a, lltVar.f134696a) && wj50.m88271j(this.f134697b, lltVar.f134697b);
    }

    public final int hashCode() {
        return this.f134697b.hashCode() + (this.f134696a.hashCode() * 31);
    }

    /* JADX INFO: renamed from: t */
    public final String m59312t() {
        return this.f134696a;
    }
}
