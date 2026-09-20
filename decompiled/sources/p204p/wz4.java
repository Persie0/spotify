package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class wz4 implements vwf {

    /* JADX INFO: renamed from: a */
    public final String f256460a;

    /* JADX INFO: renamed from: b */
    public final String f256461b;

    /* JADX INFO: renamed from: c */
    public final String f256462c;

    /* JADX INFO: renamed from: d */
    public final String f256463d;

    /* JADX INFO: renamed from: e */
    public final int f256464e;

    /* JADX INFO: renamed from: f */
    public final String f256465f;

    public wz4(int i, String str, String str2, String str3, String str4, String str5) {
        this.f256460a = str;
        this.f256461b = str2;
        this.f256462c = str3;
        this.f256463d = str4;
        this.f256464e = i;
        this.f256465f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wz4)) {
            return false;
        }
        wz4 wz4Var = (wz4) obj;
        return wj50.m88271j(this.f256460a, wz4Var.f256460a) && wj50.m88271j(this.f256461b, wz4Var.f256461b) && wj50.m88271j(this.f256462c, wz4Var.f256462c) && wj50.m88271j(this.f256463d, wz4Var.f256463d) && this.f256464e == wz4Var.f256464e && wj50.m88271j(this.f256465f, wz4Var.f256465f);
    }

    public final int hashCode() {
        return this.f256465f.hashCode() + mt60.m62800g(this.f256464e, s571.m77243b(s571.m77243b(s571.m77243b(this.f256460a.hashCode() * 31, 31, this.f256461b), 31, this.f256462c), 31, this.f256463d), 31);
    }
}
