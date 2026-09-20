package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class dk91 {

    /* JADX INFO: renamed from: a */
    public final xfr f49934a;

    /* JADX INFO: renamed from: b */
    public final boolean f49935b;

    /* JADX INFO: renamed from: c */
    public final String f49936c;

    /* JADX INFO: renamed from: d */
    public final String f49937d;

    /* JADX INFO: renamed from: e */
    public final String f49938e;

    /* JADX INFO: renamed from: f */
    public final wgg0 f49939f;

    /* JADX INFO: renamed from: g */
    public final String f49940g;

    /* JADX INFO: renamed from: h */
    public final Long f49941h;

    public dk91(xfr xfrVar, boolean z, String str, String str2, String str3, wgg0 wgg0Var, String str4, Long l) {
        this.f49934a = xfrVar;
        this.f49935b = z;
        this.f49936c = str;
        this.f49937d = str2;
        this.f49938e = str3;
        this.f49939f = wgg0Var;
        this.f49940g = str4;
        this.f49941h = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk91)) {
            return false;
        }
        dk91 dk91Var = (dk91) obj;
        return this.f49934a == dk91Var.f49934a && this.f49935b == dk91Var.f49935b && wj50.m88271j(this.f49936c, dk91Var.f49936c) && wj50.m88271j(this.f49937d, dk91Var.f49937d) && wj50.m88271j(this.f49938e, dk91Var.f49938e) && this.f49939f == dk91Var.f49939f && wj50.m88271j(this.f49940g, dk91Var.f49940g) && wj50.m88271j(this.f49941h, dk91Var.f49941h);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b((this.f49939f.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77245d(this.f49934a.hashCode() * 31, 31, this.f49935b), 31, this.f49936c), 31, this.f49937d), 31, this.f49938e)) * 31, 31, this.f49940g);
        Long l = this.f49941h;
        return iM77243b + (l == null ? 0 : l.hashCode());
    }

    public /* synthetic */ dk91(xfr xfrVar, boolean z, String str, String str2, String str3, wgg0 wgg0Var) {
        this(xfrVar, z, str, str2, str3, wgg0Var, "", null);
    }
}
