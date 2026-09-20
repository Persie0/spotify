package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qfl0 implements sfl0 {

    /* JADX INFO: renamed from: a */
    public final String f188254a;

    /* JADX INFO: renamed from: b */
    public final String f188255b;

    /* JADX INFO: renamed from: c */
    public final String f188256c;

    /* JADX INFO: renamed from: d */
    public final String f188257d;

    /* JADX INFO: renamed from: e */
    public final String f188258e;

    /* JADX INFO: renamed from: f */
    public final String f188259f;

    /* JADX INFO: renamed from: g */
    public final String f188260g;

    /* JADX INFO: renamed from: h */
    public final Boolean f188261h;

    public qfl0(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool) {
        this.f188254a = str;
        this.f188255b = str2;
        this.f188256c = str3;
        this.f188257d = str4;
        this.f188258e = str5;
        this.f188259f = str6;
        this.f188260g = str7;
        this.f188261h = bool;
    }

    @Override // p204p.sfl0
    /* JADX INFO: renamed from: b */
    public final String mo66853b() {
        return this.f188257d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qfl0)) {
            return false;
        }
        qfl0 qfl0Var = (qfl0) obj;
        return wj50.m88271j(this.f188254a, qfl0Var.f188254a) && wj50.m88271j(this.f188255b, qfl0Var.f188255b) && wj50.m88271j(this.f188256c, qfl0Var.f188256c) && wj50.m88271j(this.f188257d, qfl0Var.f188257d) && wj50.m88271j(this.f188258e, qfl0Var.f188258e) && wj50.m88271j(this.f188259f, qfl0Var.f188259f) && wj50.m88271j(this.f188260g, qfl0Var.f188260g) && wj50.m88271j(this.f188261h, qfl0Var.f188261h);
    }

    @Override // p204p.sfl0
    public final String getArtist() {
        return this.f188256c;
    }

    @Override // p204p.sfl0
    public final String getArtwork() {
        return this.f188255b;
    }

    @Override // p204p.sfl0
    public final String getTitle() {
        return this.f188254a;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f188254a.hashCode() * 31, 31, this.f188255b), 31, this.f188256c), 31, this.f188257d), 31, this.f188258e), 31, this.f188259f);
        String str = this.f188260g;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f188261h;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }
}
