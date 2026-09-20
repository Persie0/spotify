package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class xnl implements ktx {

    /* JADX INFO: renamed from: a */
    public final String f263670a;

    /* JADX INFO: renamed from: b */
    public final String f263671b;

    /* JADX INFO: renamed from: c */
    public final String f263672c;

    /* JADX INFO: renamed from: d */
    public final String f263673d;

    /* JADX INFO: renamed from: e */
    public final String f263674e;

    /* JADX INFO: renamed from: f */
    public final String f263675f;

    /* JADX INFO: renamed from: g */
    public final String f263676g;

    /* JADX INFO: renamed from: h */
    public final String f263677h;

    /* JADX INFO: renamed from: i */
    public final String f263678i;

    /* JADX INFO: renamed from: j */
    public final long f263679j;

    /* JADX INFO: renamed from: k */
    public final String f263680k;

    /* JADX INFO: renamed from: l */
    public final String f263681l;

    /* JADX INFO: renamed from: m */
    public final String f263682m;

    /* JADX INFO: renamed from: n */
    public final String f263683n;

    /* JADX INFO: renamed from: o */
    public final Long f263684o;

    public xnl(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, long j, String str10, String str11, String str12, String str13, Long l) {
        this.f263670a = str;
        this.f263671b = str2;
        this.f263672c = str3;
        this.f263673d = str4;
        this.f263674e = str5;
        this.f263675f = str6;
        this.f263676g = str7;
        this.f263677h = str8;
        this.f263678i = str9;
        this.f263679j = j;
        this.f263680k = str10;
        this.f263681l = str11;
        this.f263682m = str12;
        this.f263683n = str13;
        this.f263684o = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xnl)) {
            return false;
        }
        xnl xnlVar = (xnl) obj;
        return wj50.m88271j(this.f263670a, xnlVar.f263670a) && wj50.m88271j(this.f263671b, xnlVar.f263671b) && wj50.m88271j(this.f263672c, xnlVar.f263672c) && wj50.m88271j(this.f263673d, xnlVar.f263673d) && wj50.m88271j(this.f263674e, xnlVar.f263674e) && wj50.m88271j(this.f263675f, xnlVar.f263675f) && wj50.m88271j(this.f263676g, xnlVar.f263676g) && wj50.m88271j(this.f263677h, xnlVar.f263677h) && wj50.m88271j(this.f263678i, xnlVar.f263678i) && this.f263679j == xnlVar.f263679j && wj50.m88271j(this.f263680k, xnlVar.f263680k) && wj50.m88271j(this.f263681l, xnlVar.f263681l) && wj50.m88271j(this.f263682m, xnlVar.f263682m) && wj50.m88271j(this.f263683n, xnlVar.f263683n) && wj50.m88271j(this.f263684o, xnlVar.f263684o);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(dq60.m36605e(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f263670a.hashCode() * 31, 31, this.f263671b), 31, this.f263672c), 31, this.f263673d), 31, this.f263674e), 31, this.f263675f), 31, this.f263676g), 31, this.f263677h), 31, this.f263678i), this.f263679j, 31), 31, this.f263680k), 31, this.f263681l), 31, this.f263682m), 31, this.f263683n);
        Long l = this.f263684o;
        return iM77243b + (l == null ? 0 : l.hashCode());
    }
}
