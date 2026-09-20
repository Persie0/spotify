package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class m2j {

    /* JADX INFO: renamed from: a */
    public final String f139359a;

    /* JADX INFO: renamed from: b */
    public final String f139360b;

    /* JADX INFO: renamed from: c */
    public final String f139361c;

    /* JADX INFO: renamed from: d */
    public final String f139362d;

    /* JADX INFO: renamed from: e */
    public final String f139363e;

    /* JADX INFO: renamed from: f */
    public final e2j f139364f;

    /* JADX INFO: renamed from: g */
    public final int f139365g;

    /* JADX INFO: renamed from: h */
    public final int f139366h;

    public m2j(String str, String str2, String str3, String str4, String str5, e2j e2jVar, int i, int i2) {
        this.f139359a = str;
        this.f139360b = str2;
        this.f139361c = str3;
        this.f139362d = str4;
        this.f139363e = str5;
        this.f139364f = e2jVar;
        this.f139365g = i;
        this.f139366h = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2j)) {
            return false;
        }
        m2j m2jVar = (m2j) obj;
        return wj50.m88271j(this.f139359a, m2jVar.f139359a) && wj50.m88271j(this.f139360b, m2jVar.f139360b) && wj50.m88271j(this.f139361c, m2jVar.f139361c) && wj50.m88271j(this.f139362d, m2jVar.f139362d) && wj50.m88271j(this.f139363e, m2jVar.f139363e) && this.f139364f.equals(m2jVar.f139364f) && this.f139365g == m2jVar.f139365g && this.f139366h == m2jVar.f139366h;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f139359a.hashCode() * 31, 31, this.f139360b), 31, this.f139361c);
        String str = this.f139362d;
        int iM62800g = mt60.m62800g(this.f139365g, (this.f139364f.hashCode() + s571.m77243b((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f139363e)) * 31, 31);
        int i = this.f139366h;
        return iM62800g + (i != 0 ? edb.m38547C(i) : 0);
    }
}
