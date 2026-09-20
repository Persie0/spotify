package p204p;

/* JADX INFO: renamed from: p.mb */
/* JADX INFO: loaded from: classes8.dex */
public final class C2121mb extends AbstractC2158nb {

    /* JADX INFO: renamed from: b */
    public final String f141752b;

    /* JADX INFO: renamed from: c */
    public final C1931hb f141753c;

    /* JADX INFO: renamed from: d */
    public final C1891gb f141754d;

    /* JADX INFO: renamed from: e */
    public final C1891gb f141755e;

    public C2121mb(String str, C1931hb c1931hb, C1891gb c1891gb, C1891gb c1891gb2) {
        super(c1931hb);
        this.f141752b = str;
        this.f141753c = c1931hb;
        this.f141754d = c1891gb;
        this.f141755e = c1891gb2;
    }

    @Override // p204p.AbstractC2158nb
    /* JADX INFO: renamed from: a */
    public final C1891gb mo58589a() {
        return this.f141754d;
    }

    @Override // p204p.AbstractC2158nb
    /* JADX INFO: renamed from: b */
    public final String mo58590b() {
        return this.f141752b;
    }

    @Override // p204p.AbstractC2158nb
    /* JADX INFO: renamed from: c */
    public final C1891gb mo58591c() {
        return this.f141755e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2121mb)) {
            return false;
        }
        C2121mb c2121mb = (C2121mb) obj;
        return wj50.m88271j(this.f141752b, c2121mb.f141752b) && wj50.m88271j(this.f141753c, c2121mb.f141753c) && wj50.m88271j(this.f141754d, c2121mb.f141754d) && wj50.m88271j(this.f141755e, c2121mb.f141755e);
    }

    public final int hashCode() {
        int iHashCode = (this.f141753c.hashCode() + (this.f141752b.hashCode() * 31)) * 31;
        C1891gb c1891gb = this.f141754d;
        int iHashCode2 = (iHashCode + (c1891gb == null ? 0 : c1891gb.hashCode())) * 31;
        C1891gb c1891gb2 = this.f141755e;
        return iHashCode2 + (c1891gb2 != null ? c1891gb2.hashCode() : 0);
    }
}
