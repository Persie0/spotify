package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class wjf implements ekf {

    /* JADX INFO: renamed from: a */
    public final String f251950a;

    /* JADX INFO: renamed from: b */
    public final String f251951b;

    /* JADX INFO: renamed from: c */
    public final String f251952c;

    /* JADX INFO: renamed from: d */
    public final boolean f251953d;

    /* JADX INFO: renamed from: e */
    public final int f251954e;

    public wjf(int i, String str, String str2, boolean z, String str3) {
        this.f251950a = str;
        this.f251951b = str2;
        this.f251952c = str3;
        this.f251953d = z;
        this.f251954e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wjf)) {
            return false;
        }
        wjf wjfVar = (wjf) obj;
        return wj50.m88271j(this.f251950a, wjfVar.f251950a) && wj50.m88271j(this.f251951b, wjfVar.f251951b) && wj50.m88271j(this.f251952c, wjfVar.f251952c) && this.f251953d == wjfVar.f251953d && this.f251954e == wjfVar.f251954e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f251954e) + s571.m77245d(s571.m77243b(s571.m77243b(this.f251950a.hashCode() * 31, 31, this.f251951b), 31, this.f251952c), 31, this.f251953d);
    }
}
