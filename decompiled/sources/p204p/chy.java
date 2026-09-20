package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class chy implements dhy {

    /* JADX INFO: renamed from: a */
    public final String f38139a;

    /* JADX INFO: renamed from: b */
    public final String f38140b;

    /* JADX INFO: renamed from: c */
    public final jhy f38141c;

    /* JADX INFO: renamed from: d */
    public final String f38142d;

    /* JADX INFO: renamed from: e */
    public final String f38143e;

    /* JADX INFO: renamed from: f */
    public final String f38144f;

    /* JADX INFO: renamed from: g */
    public final Integer f38145g;

    /* JADX INFO: renamed from: h */
    public final String f38146h;

    /* JADX INFO: renamed from: i */
    public final String f38147i;

    /* JADX INFO: renamed from: j */
    public final String f38148j;

    public chy(String str, String str2, jhy jhyVar, String str3, String str4, String str5, Integer num, String str6, String str7, String str8) {
        this.f38139a = str;
        this.f38140b = str2;
        this.f38141c = jhyVar;
        this.f38142d = str3;
        this.f38143e = str4;
        this.f38144f = str5;
        this.f38145g = num;
        this.f38146h = str6;
        this.f38147i = str7;
        this.f38148j = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chy)) {
            return false;
        }
        chy chyVar = (chy) obj;
        return wj50.m88271j(this.f38139a, chyVar.f38139a) && wj50.m88271j(this.f38140b, chyVar.f38140b) && wj50.m88271j(this.f38141c, chyVar.f38141c) && wj50.m88271j(this.f38142d, chyVar.f38142d) && wj50.m88271j(this.f38143e, chyVar.f38143e) && wj50.m88271j(this.f38144f, chyVar.f38144f) && wj50.m88271j(this.f38145g, chyVar.f38145g) && wj50.m88271j(this.f38146h, chyVar.f38146h) && wj50.m88271j(this.f38147i, chyVar.f38147i) && wj50.m88271j(this.f38148j, chyVar.f38148j);
    }

    public final int hashCode() {
        int iHashCode = this.f38139a.hashCode() * 31;
        String str = this.f38140b;
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b((this.f38141c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.f38142d), 31, this.f38143e), 31, this.f38144f);
        Integer num = this.f38145g;
        return this.f38148j.hashCode() + s571.m77243b(s571.m77243b((iM77243b + (num != null ? num.hashCode() : 0)) * 31, 31, this.f38146h), 31, this.f38147i);
    }
}
