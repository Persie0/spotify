package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class nnh {

    /* JADX INFO: renamed from: a */
    public final String f156421a;

    /* JADX INFO: renamed from: b */
    public final String f156422b;

    /* JADX INFO: renamed from: c */
    public final int f156423c;

    /* JADX INFO: renamed from: d */
    public final int f156424d;

    /* JADX INFO: renamed from: e */
    public final boolean f156425e;

    public nnh(int i, boolean z, String str, int i2, String str2) {
        this.f156421a = str;
        this.f156422b = str2;
        this.f156423c = i;
        this.f156424d = i2;
        this.f156425e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nnh)) {
            return false;
        }
        nnh nnhVar = (nnh) obj;
        return wj50.m88271j(this.f156421a, nnhVar.f156421a) && wj50.m88271j(this.f156422b, nnhVar.f156422b) && this.f156423c == nnhVar.f156423c && this.f156424d == nnhVar.f156424d && this.f156425e == nnhVar.f156425e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f156425e) + mt60.m62800g(this.f156424d, mt60.m62800g(this.f156423c, s571.m77243b(this.f156421a.hashCode() * 31, 31, this.f156422b), 31), 31);
    }
}
