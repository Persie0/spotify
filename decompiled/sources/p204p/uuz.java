package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class uuz {

    /* JADX INFO: renamed from: a */
    public final String f234300a;

    /* JADX INFO: renamed from: b */
    public final boolean f234301b;

    /* JADX INFO: renamed from: c */
    public final boolean f234302c;

    /* JADX INFO: renamed from: d */
    public final int f234303d;

    /* JADX INFO: renamed from: e */
    public final int f234304e;

    public uuz(int i, int i2, String str, boolean z, boolean z2) {
        this.f234300a = str;
        this.f234301b = z;
        this.f234302c = z2;
        this.f234303d = i;
        this.f234304e = i2;
    }

    /* JADX INFO: renamed from: a */
    public static uuz m84037a(uuz uuzVar, boolean z) {
        return new uuz(uuzVar.f234303d, uuzVar.f234304e, uuzVar.f234300a, uuzVar.f234301b, z);
    }

    /* JADX INFO: renamed from: b */
    public final int m84038b() {
        return this.f234303d;
    }

    /* JADX INFO: renamed from: c */
    public final int m84039c() {
        return this.f234304e;
    }

    /* JADX INFO: renamed from: d */
    public final String m84040d() {
        return this.f234300a;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m84041e() {
        return this.f234302c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uuz)) {
            return false;
        }
        uuz uuzVar = (uuz) obj;
        return wj50.m88271j(this.f234300a, uuzVar.f234300a) && this.f234301b == uuzVar.f234301b && this.f234302c == uuzVar.f234302c && this.f234303d == uuzVar.f234303d && this.f234304e == uuzVar.f234304e;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m84042f() {
        return this.f234301b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f234304e) + mt60.m62800g(this.f234303d, s571.m77245d(s571.m77245d(this.f234300a.hashCode() * 31, 31, this.f234301b), 31, this.f234302c), 31);
    }

    public /* synthetic */ uuz(String str, boolean z, int i) {
        this(0, 0, str, false, (i & 4) != 0 ? false : z);
    }
}
