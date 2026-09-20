package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class c1w {

    /* JADX INFO: renamed from: a */
    public final String f33200a;

    /* JADX INFO: renamed from: b */
    public final String f33201b;

    /* JADX INFO: renamed from: c */
    public final String f33202c;

    /* JADX INFO: renamed from: d */
    public final String f33203d;

    /* JADX INFO: renamed from: e */
    public final String f33204e;

    /* JADX INFO: renamed from: f */
    public final String f33205f;

    /* JADX INFO: renamed from: g */
    public final String f33206g;

    /* JADX INFO: renamed from: h */
    public final int f33207h;

    /* JADX INFO: renamed from: i */
    public final boolean f33208i;

    /* JADX INFO: renamed from: j */
    public final boolean f33209j;

    /* JADX INFO: renamed from: k */
    public final boolean f33210k;

    /* JADX INFO: renamed from: l */
    public final String f33211l;

    public c1w(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, boolean z, boolean z2, boolean z3, String str8) {
        this.f33200a = str;
        this.f33201b = str2;
        this.f33202c = str3;
        this.f33203d = str4;
        this.f33204e = str5;
        this.f33205f = str6;
        this.f33206g = str7;
        this.f33207h = i;
        this.f33208i = z;
        this.f33209j = z2;
        this.f33210k = z3;
        this.f33211l = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1w)) {
            return false;
        }
        c1w c1wVar = (c1w) obj;
        return wj50.m88271j(this.f33200a, c1wVar.f33200a) && wj50.m88271j(this.f33201b, c1wVar.f33201b) && wj50.m88271j(this.f33202c, c1wVar.f33202c) && wj50.m88271j(this.f33203d, c1wVar.f33203d) && wj50.m88271j(this.f33204e, c1wVar.f33204e) && wj50.m88271j(this.f33205f, c1wVar.f33205f) && wj50.m88271j(this.f33206g, c1wVar.f33206g) && this.f33207h == c1wVar.f33207h && this.f33208i == c1wVar.f33208i && this.f33209j == c1wVar.f33209j && this.f33210k == c1wVar.f33210k && wj50.m88271j(this.f33211l, c1wVar.f33211l);
    }

    public final int hashCode() {
        return this.f33211l.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(mt60.m62800g(this.f33207h, s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f33200a.hashCode() * 31, 31, this.f33201b), 31, this.f33202c), 31, this.f33203d), 31, this.f33204e), 31, this.f33205f), 31, this.f33206g), 31), 31, this.f33208i), 31, this.f33209j), 31, this.f33210k);
    }
}
