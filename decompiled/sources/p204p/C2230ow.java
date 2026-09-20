package p204p;

/* JADX INFO: renamed from: p.ow */
/* JADX INFO: loaded from: classes18.dex */
@rtz0
public final class C2230ow {
    public static final C2192nw Companion = new C2192nw();

    /* JADX INFO: renamed from: a */
    public final String f170589a;

    /* JADX INFO: renamed from: b */
    public final String f170590b;

    /* JADX INFO: renamed from: c */
    public final C2105lw f170591c;

    /* JADX INFO: renamed from: d */
    public final String f170592d;

    /* JADX INFO: renamed from: e */
    public final String f170593e;

    /* JADX INFO: renamed from: f */
    public final Integer f170594f;

    /* JADX INFO: renamed from: g */
    public final boolean f170595g;

    /* JADX INFO: renamed from: h */
    public final Long f170596h;

    /* JADX INFO: renamed from: i */
    public final Long f170597i;

    public /* synthetic */ C2230ow(int i, String str, String str2, C2105lw c2105lw, String str3, String str4, Integer num, boolean z, Long l, Long l2) {
        if (3 != (i & 3)) {
            edo.m38617p(i, 3, C2142mw.f147675a.getDescriptor());
            throw null;
        }
        this.f170589a = str;
        this.f170590b = str2;
        if ((i & 4) == 0) {
            this.f170591c = null;
        } else {
            this.f170591c = c2105lw;
        }
        if ((i & 8) == 0) {
            this.f170592d = null;
        } else {
            this.f170592d = str3;
        }
        if ((i & 16) == 0) {
            this.f170593e = null;
        } else {
            this.f170593e = str4;
        }
        if ((i & 32) == 0) {
            this.f170594f = null;
        } else {
            this.f170594f = num;
        }
        if ((i & 64) == 0) {
            this.f170595g = false;
        } else {
            this.f170595g = z;
        }
        if ((i & 128) == 0) {
            this.f170596h = null;
        } else {
            this.f170596h = l;
        }
        if ((i & 256) == 0) {
            this.f170597i = null;
        } else {
            this.f170597i = l2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final Integer m68140a() {
        return this.f170594f;
    }

    /* JADX INFO: renamed from: b */
    public final String m68141b() {
        return this.f170590b;
    }

    /* JADX INFO: renamed from: c */
    public final String m68142c() {
        return this.f170593e;
    }

    /* JADX INFO: renamed from: d */
    public final String m68143d() {
        return this.f170592d;
    }

    /* JADX INFO: renamed from: e */
    public final Long m68144e() {
        return this.f170597i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2230ow)) {
            return false;
        }
        C2230ow c2230ow = (C2230ow) obj;
        return wj50.m88271j(this.f170589a, c2230ow.f170589a) && wj50.m88271j(this.f170590b, c2230ow.f170590b) && wj50.m88271j(this.f170591c, c2230ow.f170591c) && wj50.m88271j(this.f170592d, c2230ow.f170592d) && wj50.m88271j(this.f170593e, c2230ow.f170593e) && wj50.m88271j(this.f170594f, c2230ow.f170594f) && this.f170595g == c2230ow.f170595g && wj50.m88271j(this.f170596h, c2230ow.f170596h) && wj50.m88271j(this.f170597i, c2230ow.f170597i);
    }

    /* JADX INFO: renamed from: f */
    public final Long m68145f() {
        return this.f170596h;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m68146g() {
        return this.f170595g;
    }

    /* JADX INFO: renamed from: h */
    public final C2105lw m68147h() {
        return this.f170591c;
    }

    public final int hashCode() {
        int iHashCode = ((this.f170589a.hashCode() * 31) + this.f170590b.hashCode()) * 31;
        C2105lw c2105lw = this.f170591c;
        int iHashCode2 = (iHashCode + (c2105lw == null ? 0 : c2105lw.hashCode())) * 31;
        String str = this.f170592d;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f170593e;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f170594f;
        int iHashCode5 = (((iHashCode4 + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.f170595g)) * 31;
        Long l = this.f170596h;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f170597i;
        return iHashCode6 + (l2 != null ? l2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public final String m68148i() {
        return this.f170589a;
    }

    public C2230ow(String str, String str2, C2105lw c2105lw, String str3, String str4, Integer num, boolean z, Long l, Long l2) {
        this.f170589a = str;
        this.f170590b = str2;
        this.f170591c = c2105lw;
        this.f170592d = str3;
        this.f170593e = str4;
        this.f170594f = num;
        this.f170595g = z;
        this.f170596h = l;
        this.f170597i = l2;
    }
}
