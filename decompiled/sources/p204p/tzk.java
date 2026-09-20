package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class tzk implements ktx {

    /* JADX INFO: renamed from: a */
    public final String f225256a;

    /* JADX INFO: renamed from: b */
    public final String f225257b;

    /* JADX INFO: renamed from: c */
    public final String f225258c;

    /* JADX INFO: renamed from: d */
    public final rzk f225259d;

    public tzk(String str, String str2, String str3, rzk rzkVar) {
        this.f225256a = str;
        this.f225257b = str2;
        this.f225258c = str3;
        this.f225259d = rzkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tzk)) {
            return false;
        }
        tzk tzkVar = (tzk) obj;
        return wj50.m88271j(this.f225256a, tzkVar.f225256a) && wj50.m88271j(this.f225257b, tzkVar.f225257b) && wj50.m88271j(this.f225258c, tzkVar.f225258c) && wj50.m88271j(this.f225259d, tzkVar.f225259d);
    }

    public final int hashCode() {
        String str = this.f225256a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f225257b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f225258c;
        return this.f225259d.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }
}
