package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class d1s {

    /* JADX INFO: renamed from: a */
    public final Integer f44341a;

    /* JADX INFO: renamed from: b */
    public final String f44342b;

    /* JADX INFO: renamed from: c */
    public final Integer f44343c;

    /* JADX INFO: renamed from: d */
    public final Integer f44344d;

    /* JADX INFO: renamed from: e */
    public final Integer f44345e;

    /* JADX INFO: renamed from: f */
    public final int f44346f;

    /* JADX INFO: renamed from: g */
    public final int f44347g;

    /* JADX INFO: renamed from: h */
    public final int f44348h;

    public d1s(Integer num, String str, Integer num2, Integer num3, Integer num4, int i, int i2, int i3) {
        this.f44341a = num;
        this.f44342b = str;
        this.f44343c = num2;
        this.f44344d = num3;
        this.f44345e = num4;
        this.f44346f = i;
        this.f44347g = i2;
        this.f44348h = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1s)) {
            return false;
        }
        d1s d1sVar = (d1s) obj;
        return wj50.m88271j(this.f44341a, d1sVar.f44341a) && wj50.m88271j(this.f44342b, d1sVar.f44342b) && wj50.m88271j(this.f44343c, d1sVar.f44343c) && wj50.m88271j(this.f44344d, d1sVar.f44344d) && wj50.m88271j(this.f44345e, d1sVar.f44345e) && this.f44346f == d1sVar.f44346f && this.f44347g == d1sVar.f44347g && this.f44348h == d1sVar.f44348h;
    }

    public final int hashCode() {
        Integer num = this.f44341a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f44342b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f44343c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f44344d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f44345e;
        return Integer.hashCode(this.f44348h) + mt60.m62800g(this.f44347g, mt60.m62800g(this.f44346f, (iHashCode4 + (num4 != null ? num4.hashCode() : 0)) * 31, 31), 31);
    }
}
