package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vsk0 {

    /* JADX INFO: renamed from: a */
    public final String f244454a;

    /* JADX INFO: renamed from: b */
    public final String f244455b;

    /* JADX INFO: renamed from: c */
    public final boolean f244456c;

    /* JADX INFO: renamed from: d */
    public final int f244457d;

    public vsk0(String str, String str2, boolean z, int i) {
        this.f244454a = str;
        this.f244455b = str2;
        this.f244456c = z;
        this.f244457d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vsk0)) {
            return false;
        }
        vsk0 vsk0Var = (vsk0) obj;
        return wj50.m88271j(this.f244454a, vsk0Var.f244454a) && wj50.m88271j(this.f244455b, vsk0Var.f244455b) && this.f244456c == vsk0Var.f244456c && this.f244457d == vsk0Var.f244457d;
    }

    public final int hashCode() {
        return edb.m38547C(this.f244457d) + s571.m77245d(s571.m77243b(this.f244454a.hashCode() * 31, 31, this.f244455b), 31, this.f244456c);
    }
}
