package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ofl0 implements sfl0, nfl0 {

    /* JADX INFO: renamed from: a */
    public final String f164817a;

    /* JADX INFO: renamed from: b */
    public final String f164818b;

    /* JADX INFO: renamed from: c */
    public final String f164819c;

    /* JADX INFO: renamed from: d */
    public final String f164820d;

    /* JADX INFO: renamed from: e */
    public final String f164821e;

    /* JADX INFO: renamed from: f */
    public final String f164822f;

    /* JADX INFO: renamed from: g */
    public final String f164823g;

    public ofl0(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f164817a = str;
        this.f164818b = str2;
        this.f164819c = str3;
        this.f164820d = str4;
        this.f164821e = str5;
        this.f164822f = str6;
        this.f164823g = str7;
    }

    @Override // p204p.nfl0
    /* JADX INFO: renamed from: a */
    public final String mo64344a() {
        return this.f164822f;
    }

    @Override // p204p.sfl0
    /* JADX INFO: renamed from: b */
    public final String mo66853b() {
        return this.f164820d;
    }

    @Override // p204p.nfl0
    /* JADX INFO: renamed from: c */
    public final String mo64345c() {
        return this.f164823g;
    }

    @Override // p204p.nfl0
    /* JADX INFO: renamed from: d */
    public final String mo64346d() {
        return this.f164821e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ofl0)) {
            return false;
        }
        ofl0 ofl0Var = (ofl0) obj;
        return wj50.m88271j(this.f164817a, ofl0Var.f164817a) && wj50.m88271j(this.f164818b, ofl0Var.f164818b) && wj50.m88271j(this.f164819c, ofl0Var.f164819c) && wj50.m88271j(this.f164820d, ofl0Var.f164820d) && wj50.m88271j(this.f164821e, ofl0Var.f164821e) && wj50.m88271j(this.f164822f, ofl0Var.f164822f) && wj50.m88271j(this.f164823g, ofl0Var.f164823g);
    }

    @Override // p204p.sfl0
    public final String getArtist() {
        return this.f164819c;
    }

    @Override // p204p.sfl0
    public final String getArtwork() {
        return this.f164818b;
    }

    @Override // p204p.sfl0
    public final String getTitle() {
        return this.f164817a;
    }

    public final int hashCode() {
        return this.f164823g.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f164817a.hashCode() * 31, 31, this.f164818b), 31, this.f164819c), 31, this.f164820d), 31, this.f164821e), 31, this.f164822f);
    }
}
