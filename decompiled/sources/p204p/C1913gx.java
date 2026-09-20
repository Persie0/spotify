package p204p;

/* JADX INFO: renamed from: p.gx */
/* JADX INFO: loaded from: classes9.dex */
public final class C1913gx {

    /* JADX INFO: renamed from: a */
    public final String f85129a;

    /* JADX INFO: renamed from: b */
    public final String f85130b;

    /* JADX INFO: renamed from: c */
    public final boolean f85131c;

    /* JADX INFO: renamed from: d */
    public final boolean f85132d;

    /* JADX INFO: renamed from: e */
    public final String f85133e;

    public C1913gx(String str, String str2, String str3, boolean z, boolean z2) {
        this.f85129a = str;
        this.f85130b = str2;
        this.f85131c = z;
        this.f85132d = z2;
        this.f85133e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1913gx)) {
            return false;
        }
        C1913gx c1913gx = (C1913gx) obj;
        return wj50.m88271j(this.f85129a, c1913gx.f85129a) && wj50.m88271j(this.f85130b, c1913gx.f85130b) && this.f85131c == c1913gx.f85131c && this.f85132d == c1913gx.f85132d && wj50.m88271j(this.f85133e, c1913gx.f85133e);
    }

    public final int hashCode() {
        return this.f85133e.hashCode() + s571.m77245d(s571.m77245d(s571.m77243b(this.f85129a.hashCode() * 31, 31, this.f85130b), 31, this.f85131c), 31, this.f85132d);
    }
}
