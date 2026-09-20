package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class jlk {

    /* JADX INFO: renamed from: a */
    public final String f113636a;

    /* JADX INFO: renamed from: b */
    public final String f113637b;

    /* JADX INFO: renamed from: c */
    public final gkk f113638c;

    /* JADX INFO: renamed from: d */
    public final Integer f113639d;

    public jlk(String str, String str2, gkk gkkVar, Integer num) {
        this.f113636a = str;
        this.f113637b = str2;
        this.f113638c = gkkVar;
        this.f113639d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jlk)) {
            return false;
        }
        jlk jlkVar = (jlk) obj;
        return wj50.m88271j(this.f113636a, jlkVar.f113636a) && wj50.m88271j(this.f113637b, jlkVar.f113637b) && this.f113638c == jlkVar.f113638c && wj50.m88271j(this.f113639d, jlkVar.f113639d);
    }

    public final int hashCode() {
        int iHashCode = this.f113636a.hashCode() * 31;
        String str = this.f113637b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        gkk gkkVar = this.f113638c;
        int iHashCode3 = (iHashCode2 + (gkkVar == null ? 0 : gkkVar.hashCode())) * 31;
        Integer num = this.f113639d;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }
}
