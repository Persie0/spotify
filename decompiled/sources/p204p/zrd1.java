package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class zrd1 implements bsd1 {

    /* JADX INFO: renamed from: a */
    public final String f285638a;

    /* JADX INFO: renamed from: b */
    public final String f285639b;

    /* JADX INFO: renamed from: c */
    public final String f285640c;

    /* JADX INFO: renamed from: d */
    public final String f285641d;

    /* JADX INFO: renamed from: e */
    public final u6r f285642e;

    /* JADX INFO: renamed from: f */
    public final String f285643f;

    /* JADX INFO: renamed from: g */
    public final String f285644g;

    public zrd1(String str, String str2, String str3, String str4, u6r u6rVar, String str5, String str6) {
        this.f285638a = str;
        this.f285639b = str2;
        this.f285640c = str3;
        this.f285641d = str4;
        this.f285642e = u6rVar;
        this.f285643f = str5;
        this.f285644g = str6;
    }

    @Override // p204p.bsd1
    /* JADX INFO: renamed from: a */
    public final String mo27088a() {
        return this.f285640c;
    }

    @Override // p204p.yrd1
    /* JADX INFO: renamed from: b */
    public final String mo27089b() {
        return this.f285643f;
    }

    @Override // p204p.bsd1
    /* JADX INFO: renamed from: c */
    public final String mo27090c() {
        return this.f285639b;
    }

    @Override // p204p.bsd1
    /* JADX INFO: renamed from: d */
    public final String mo27091d() {
        return this.f285641d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zrd1)) {
            return false;
        }
        zrd1 zrd1Var = (zrd1) obj;
        return wj50.m88271j(this.f285638a, zrd1Var.f285638a) && wj50.m88271j(this.f285639b, zrd1Var.f285639b) && wj50.m88271j(this.f285640c, zrd1Var.f285640c) && wj50.m88271j(this.f285641d, zrd1Var.f285641d) && wj50.m88271j(this.f285642e, zrd1Var.f285642e) && wj50.m88271j(this.f285643f, zrd1Var.f285643f) && wj50.m88271j(this.f285644g, zrd1Var.f285644g);
    }

    @Override // p204p.bsd1
    public final String getTitle() {
        return this.f285638a;
    }

    public final int hashCode() {
        return this.f285644g.hashCode() + s571.m77243b((this.f285642e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f285638a.hashCode() * 31, 31, this.f285639b), 31, this.f285640c), 31, this.f285641d)) * 31, 31, this.f285643f);
    }

    @Override // p204p.yrd1
    /* JADX INFO: renamed from: m */
    public final u6r mo27092m() {
        return this.f285642e;
    }
}
