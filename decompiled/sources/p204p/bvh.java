package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class bvh {

    /* JADX INFO: renamed from: a */
    public final String f31363a;

    /* JADX INFO: renamed from: b */
    public final String f31364b;

    /* JADX INFO: renamed from: c */
    public final String f31365c;

    public bvh(String str, String str2, String str3) {
        this.f31363a = str;
        this.f31364b = str2;
        this.f31365c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bvh)) {
            return false;
        }
        bvh bvhVar = (bvh) obj;
        return wj50.m88271j(this.f31363a, bvhVar.f31363a) && wj50.m88271j(this.f31364b, bvhVar.f31364b) && wj50.m88271j(this.f31365c, bvhVar.f31365c);
    }

    public final int hashCode() {
        int iHashCode = this.f31363a.hashCode() * 31;
        String str = this.f31364b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f31365c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
