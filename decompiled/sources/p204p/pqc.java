package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class pqc {

    /* JADX INFO: renamed from: a */
    public final String f180257a;

    /* JADX INFO: renamed from: b */
    public final String f180258b;

    /* JADX INFO: renamed from: c */
    public final String f180259c;

    /* JADX INFO: renamed from: d */
    public final Long f180260d;

    public pqc(String str, String str2, String str3, Long l) {
        this.f180257a = str;
        this.f180258b = str2;
        this.f180259c = str3;
        this.f180260d = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pqc)) {
            return false;
        }
        pqc pqcVar = (pqc) obj;
        return wj50.m88271j(this.f180257a, pqcVar.f180257a) && wj50.m88271j(this.f180258b, pqcVar.f180258b) && wj50.m88271j(this.f180259c, pqcVar.f180259c) && wj50.m88271j(this.f180260d, pqcVar.f180260d);
    }

    public final int hashCode() {
        String str = this.f180257a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f180258b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f180259c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.f180260d;
        return iHashCode3 + (l != null ? l.hashCode() : 0);
    }
}
