package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ivh {

    /* JADX INFO: renamed from: a */
    public final String f106219a;

    /* JADX INFO: renamed from: b */
    public final String f106220b;

    /* JADX INFO: renamed from: c */
    public final String f106221c;

    /* JADX INFO: renamed from: d */
    public final long f106222d;

    public ivh(long j, String str, String str2, String str3) {
        this.f106219a = str;
        this.f106220b = str2;
        this.f106221c = str3;
        this.f106222d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ivh)) {
            return false;
        }
        ivh ivhVar = (ivh) obj;
        return wj50.m88271j(this.f106219a, ivhVar.f106219a) && wj50.m88271j(this.f106220b, ivhVar.f106220b) && wj50.m88271j(this.f106221c, ivhVar.f106221c) && this.f106222d == ivhVar.f106222d;
    }

    public final int hashCode() {
        int iHashCode = this.f106219a.hashCode() * 31;
        String str = this.f106220b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f106221c;
        return Long.hashCode(this.f106222d) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
