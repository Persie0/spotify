package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class npv {

    /* JADX INFO: renamed from: a */
    public final String f157074a;

    /* JADX INFO: renamed from: b */
    public final Long f157075b;

    /* JADX INFO: renamed from: c */
    public final Long f157076c;

    /* JADX INFO: renamed from: d */
    public final boolean f157077d;

    public npv(String str, Long l, Long l2, boolean z) {
        this.f157074a = str;
        this.f157075b = l;
        this.f157076c = l2;
        this.f157077d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof npv)) {
            return false;
        }
        npv npvVar = (npv) obj;
        return wj50.m88271j(this.f157074a, npvVar.f157074a) && wj50.m88271j(this.f157075b, npvVar.f157075b) && wj50.m88271j(this.f157076c, npvVar.f157076c) && this.f157077d == npvVar.f157077d;
    }

    public final int hashCode() {
        int iHashCode = this.f157074a.hashCode() * 31;
        Long l = this.f157075b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f157076c;
        return Boolean.hashCode(this.f157077d) + ((iHashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31);
    }
}
