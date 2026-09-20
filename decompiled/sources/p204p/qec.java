package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class qec {

    /* JADX INFO: renamed from: a */
    public final String f187889a;

    /* JADX INFO: renamed from: b */
    public final String f187890b;

    /* JADX INFO: renamed from: c */
    public final int f187891c;

    /* JADX INFO: renamed from: d */
    public final int f187892d;

    public qec(int i, String str, int i2, String str2) {
        this.f187889a = str;
        this.f187890b = str2;
        this.f187891c = i;
        this.f187892d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qec)) {
            return false;
        }
        qec qecVar = (qec) obj;
        return wj50.m88271j(this.f187889a, qecVar.f187889a) && wj50.m88271j(this.f187890b, qecVar.f187890b) && this.f187891c == qecVar.f187891c && this.f187892d == qecVar.f187892d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f187892d) + f710.m40938f(this.f187891c, s571.m77243b(this.f187889a.hashCode() * 31, 31, this.f187890b), 31);
    }
}
