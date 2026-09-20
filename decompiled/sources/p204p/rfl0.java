package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class rfl0 implements sfl0 {

    /* JADX INFO: renamed from: a */
    public final String f198681a;

    /* JADX INFO: renamed from: b */
    public final String f198682b;

    /* JADX INFO: renamed from: c */
    public final String f198683c;

    /* JADX INFO: renamed from: d */
    public final String f198684d;

    /* JADX INFO: renamed from: e */
    public final String f198685e;

    /* JADX INFO: renamed from: f */
    public final String f198686f;

    /* JADX INFO: renamed from: g */
    public final String f198687g;

    /* JADX INFO: renamed from: h */
    public final String f198688h;

    /* JADX INFO: renamed from: i */
    public final Boolean f198689i;

    public rfl0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool) {
        this.f198681a = str;
        this.f198682b = str2;
        this.f198683c = str3;
        this.f198684d = str4;
        this.f198685e = str5;
        this.f198686f = str6;
        this.f198687g = str7;
        this.f198688h = str8;
        this.f198689i = bool;
    }

    @Override // p204p.sfl0
    /* JADX INFO: renamed from: b */
    public final String mo66853b() {
        return this.f198684d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rfl0)) {
            return false;
        }
        rfl0 rfl0Var = (rfl0) obj;
        return wj50.m88271j(this.f198681a, rfl0Var.f198681a) && wj50.m88271j(this.f198682b, rfl0Var.f198682b) && wj50.m88271j(this.f198683c, rfl0Var.f198683c) && wj50.m88271j(this.f198684d, rfl0Var.f198684d) && wj50.m88271j(this.f198685e, rfl0Var.f198685e) && wj50.m88271j(this.f198686f, rfl0Var.f198686f) && wj50.m88271j(this.f198687g, rfl0Var.f198687g) && wj50.m88271j(this.f198688h, rfl0Var.f198688h) && wj50.m88271j(this.f198689i, rfl0Var.f198689i);
    }

    @Override // p204p.sfl0
    public final String getArtist() {
        return this.f198683c;
    }

    @Override // p204p.sfl0
    public final String getArtwork() {
        return this.f198682b;
    }

    @Override // p204p.sfl0
    public final String getTitle() {
        return this.f198681a;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f198681a.hashCode() * 31, 31, this.f198682b), 31, this.f198683c), 31, this.f198684d), 31, this.f198685e), 31, this.f198686f), 31, this.f198687g), 31, this.f198688h);
        Boolean bool = this.f198689i;
        return iM77243b + (bool == null ? 0 : bool.hashCode());
    }
}
