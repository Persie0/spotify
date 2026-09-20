package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class wat {

    /* JADX INFO: renamed from: a */
    public final String f249599a;

    /* JADX INFO: renamed from: b */
    public final String f249600b;

    /* JADX INFO: renamed from: c */
    public final String f249601c;

    /* JADX INFO: renamed from: d */
    public final String f249602d;

    /* JADX INFO: renamed from: e */
    public final String f249603e;

    /* JADX INFO: renamed from: f */
    public final String f249604f;

    /* JADX INFO: renamed from: g */
    public final Integer f249605g;

    public wat(String str, String str2, String str3, String str4, String str5, String str6, Integer num) {
        this.f249599a = str;
        this.f249600b = str2;
        this.f249601c = str3;
        this.f249602d = str4;
        this.f249603e = str5;
        this.f249604f = str6;
        this.f249605g = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wat)) {
            return false;
        }
        wat watVar = (wat) obj;
        return wj50.m88271j(this.f249599a, watVar.f249599a) && wj50.m88271j(this.f249600b, watVar.f249600b) && wj50.m88271j(this.f249601c, watVar.f249601c) && wj50.m88271j(this.f249602d, watVar.f249602d) && wj50.m88271j(this.f249603e, watVar.f249603e) && wj50.m88271j(this.f249604f, watVar.f249604f) && wj50.m88271j(this.f249605g, watVar.f249605g);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f249599a.hashCode() * 31, 31, this.f249600b), 31, this.f249601c);
        String str = this.f249602d;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f249603e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f249604f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f249605g;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }
}
