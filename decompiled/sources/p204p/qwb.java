package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class qwb {

    /* JADX INFO: renamed from: a */
    public final String f193220a;

    /* JADX INFO: renamed from: b */
    public final String f193221b;

    /* JADX INFO: renamed from: c */
    public final Long f193222c;

    /* JADX INFO: renamed from: d */
    public final Long f193223d;

    public qwb(String str, String str2, Long l, Long l2) {
        this.f193220a = str;
        this.f193221b = str2;
        this.f193222c = l;
        this.f193223d = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qwb)) {
            return false;
        }
        qwb qwbVar = (qwb) obj;
        return wj50.m88271j(this.f193220a, qwbVar.f193220a) && wj50.m88271j(this.f193221b, qwbVar.f193221b) && wj50.m88271j(this.f193222c, qwbVar.f193222c) && wj50.m88271j(this.f193223d, qwbVar.f193223d);
    }

    public final int hashCode() {
        int iHashCode = this.f193220a.hashCode() * 31;
        String str = this.f193221b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.f193222c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f193223d;
        return iHashCode3 + (l2 != null ? l2.hashCode() : 0);
    }
}
