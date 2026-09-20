package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class edx {

    /* JADX INFO: renamed from: a */
    public final String f58619a;

    /* JADX INFO: renamed from: b */
    public final String f58620b;

    /* JADX INFO: renamed from: c */
    public final String f58621c;

    /* JADX INFO: renamed from: d */
    public final String f58622d;

    public edx(String str, String str2, String str3, String str4) {
        this.f58619a = str;
        this.f58620b = str2;
        this.f58621c = str3;
        this.f58622d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof edx)) {
            return false;
        }
        edx edxVar = (edx) obj;
        return wj50.m88271j(this.f58619a, edxVar.f58619a) && wj50.m88271j(this.f58620b, edxVar.f58620b) && wj50.m88271j(this.f58621c, edxVar.f58621c) && wj50.m88271j(this.f58622d, edxVar.f58622d);
    }

    public final int hashCode() {
        int iHashCode = this.f58619a.hashCode() * 31;
        String str = this.f58620b;
        return this.f58622d.hashCode() + s571.m77243b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f58621c);
    }
}
