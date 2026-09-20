package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class nlf implements bmf {

    /* JADX INFO: renamed from: a */
    public final String f155084a;

    /* JADX INFO: renamed from: b */
    public final String f155085b;

    /* JADX INFO: renamed from: c */
    public final boolean f155086c;

    /* JADX INFO: renamed from: d */
    public final Throwable f155087d;

    public nlf(String str, String str2, boolean z, Throwable th) {
        this.f155084a = str;
        this.f155085b = str2;
        this.f155086c = z;
        this.f155087d = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nlf)) {
            return false;
        }
        nlf nlfVar = (nlf) obj;
        return wj50.m88271j(this.f155084a, nlfVar.f155084a) && wj50.m88271j(this.f155085b, nlfVar.f155085b) && this.f155086c == nlfVar.f155086c && wj50.m88271j(this.f155087d, nlfVar.f155087d);
    }

    public final int hashCode() {
        int iHashCode = this.f155084a.hashCode() * 31;
        String str = this.f155085b;
        return this.f155087d.hashCode() + s571.m77245d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f155086c);
    }
}
