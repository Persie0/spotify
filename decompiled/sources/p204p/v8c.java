package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class v8c {

    /* JADX INFO: renamed from: a */
    public final String f238465a;

    /* JADX INFO: renamed from: b */
    public final String f238466b;

    /* JADX INFO: renamed from: c */
    public final Integer f238467c;

    public v8c(Integer num, String str, String str2) {
        this.f238465a = str;
        this.f238466b = str2;
        this.f238467c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v8c)) {
            return false;
        }
        v8c v8cVar = (v8c) obj;
        return wj50.m88271j(this.f238465a, v8cVar.f238465a) && wj50.m88271j(this.f238466b, v8cVar.f238466b) && wj50.m88271j(this.f238467c, v8cVar.f238467c);
    }

    public final int hashCode() {
        String str = this.f238465a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f238466b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f238467c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }
}
