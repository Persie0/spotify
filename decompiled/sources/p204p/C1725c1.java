package p204p;

/* JADX INFO: renamed from: p.c1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1725c1 {

    /* JADX INFO: renamed from: a */
    public final int f32920a;

    /* JADX INFO: renamed from: b */
    public final int f32921b;

    /* JADX INFO: renamed from: c */
    public final boolean f32922c;

    /* JADX INFO: renamed from: d */
    public final boolean f32923d;

    public /* synthetic */ C1725c1(int i, int i2, int i3, boolean z) {
        this(i, i2, (i3 & 4) != 0 ? false : z, (i3 & 8) == 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1725c1)) {
            return false;
        }
        C1725c1 c1725c1 = (C1725c1) obj;
        return this.f32920a == c1725c1.f32920a && this.f32921b == c1725c1.f32921b && this.f32922c == c1725c1.f32922c && this.f32923d == c1725c1.f32923d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f32923d) + s571.m77245d(f710.m40938f(this.f32921b, edb.m38547C(this.f32920a) * 31, 31), 31, this.f32922c);
    }

    public C1725c1(int i, int i2, boolean z, boolean z2) {
        this.f32920a = i;
        this.f32921b = i2;
        this.f32922c = z;
        this.f32923d = z2;
    }
}
