package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class w9t {

    /* JADX INFO: renamed from: a */
    public final String f249262a;

    /* JADX INFO: renamed from: b */
    public final String f249263b;

    /* JADX INFO: renamed from: c */
    public final q9t f249264c;

    /* JADX INFO: renamed from: d */
    public final Integer f249265d;

    public w9t(String str, String str2, q9t q9tVar, Integer num) {
        this.f249262a = str;
        this.f249263b = str2;
        this.f249264c = q9tVar;
        this.f249265d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9t)) {
            return false;
        }
        w9t w9tVar = (w9t) obj;
        return wj50.m88271j(this.f249262a, w9tVar.f249262a) && wj50.m88271j(this.f249263b, w9tVar.f249263b) && wj50.m88271j(this.f249264c, w9tVar.f249264c) && wj50.m88271j(this.f249265d, w9tVar.f249265d);
    }

    public final int hashCode() {
        int iHashCode = this.f249262a.hashCode() * 31;
        String str = this.f249263b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        q9t q9tVar = this.f249264c;
        int iHashCode3 = (iHashCode2 + (q9tVar == null ? 0 : q9tVar.hashCode())) * 31;
        Integer num = this.f249265d;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }
}
