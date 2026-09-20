package p204p;

/* JADX INFO: renamed from: p.lb */
/* JADX INFO: loaded from: classes8.dex */
public final class C2084lb extends AbstractC2158nb {

    /* JADX INFO: renamed from: b */
    public final String f131475b;

    /* JADX INFO: renamed from: c */
    public final C1891gb f131476c;

    /* JADX INFO: renamed from: d */
    public final C1891gb f131477d;

    /* JADX INFO: renamed from: e */
    public final C1931hb f131478e;

    /* JADX INFO: renamed from: f */
    public final boolean f131479f;

    public C2084lb(String str, C1891gb c1891gb, C1891gb c1891gb2, C1931hb c1931hb, boolean z) {
        super(c1931hb);
        this.f131475b = str;
        this.f131476c = c1891gb;
        this.f131477d = c1891gb2;
        this.f131478e = c1931hb;
        this.f131479f = z;
    }

    @Override // p204p.AbstractC2158nb
    /* JADX INFO: renamed from: a */
    public final C1891gb mo58589a() {
        return this.f131476c;
    }

    @Override // p204p.AbstractC2158nb
    /* JADX INFO: renamed from: b */
    public final String mo58590b() {
        return this.f131475b;
    }

    @Override // p204p.AbstractC2158nb
    /* JADX INFO: renamed from: c */
    public final C1891gb mo58591c() {
        return this.f131477d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2084lb)) {
            return false;
        }
        C2084lb c2084lb = (C2084lb) obj;
        return wj50.m88271j(this.f131475b, c2084lb.f131475b) && wj50.m88271j(this.f131476c, c2084lb.f131476c) && wj50.m88271j(this.f131477d, c2084lb.f131477d) && wj50.m88271j(this.f131478e, c2084lb.f131478e) && this.f131479f == c2084lb.f131479f;
    }

    public final int hashCode() {
        int iHashCode = this.f131475b.hashCode() * 31;
        C1891gb c1891gb = this.f131476c;
        int iHashCode2 = (iHashCode + (c1891gb == null ? 0 : c1891gb.hashCode())) * 31;
        C1891gb c1891gb2 = this.f131477d;
        int iHashCode3 = (iHashCode2 + (c1891gb2 == null ? 0 : c1891gb2.hashCode())) * 31;
        C1931hb c1931hb = this.f131478e;
        return Boolean.hashCode(this.f131479f) + ((iHashCode3 + (c1931hb != null ? c1931hb.hashCode() : 0)) * 31);
    }

    public /* synthetic */ C2084lb(String str, C1891gb c1891gb, C1891gb c1891gb2, C1931hb c1931hb, boolean z, int i) {
        this(str, (i & 2) != 0 ? null : c1891gb, (i & 4) != 0 ? null : c1891gb2, (i & 8) != 0 ? null : c1931hb, (i & 16) != 0 ? false : z);
    }
}
