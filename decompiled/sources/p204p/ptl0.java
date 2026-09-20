package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ptl0 extends wtl0 {

    /* JADX INFO: renamed from: a */
    public final zo20 f181193a;

    /* JADX INFO: renamed from: b */
    public final boolean f181194b;

    /* JADX INFO: renamed from: c */
    public final boolean f181195c;

    /* JADX INFO: renamed from: d */
    public final String f181196d;

    public ptl0(zo20 zo20Var, boolean z, boolean z2, String str) {
        this.f181193a = zo20Var;
        this.f181194b = z;
        this.f181195c = z2;
        this.f181196d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ptl0)) {
            return false;
        }
        ptl0 ptl0Var = (ptl0) obj;
        return wj50.m88271j(this.f181193a, ptl0Var.f181193a) && this.f181194b == ptl0Var.f181194b && this.f181195c == ptl0Var.f181195c && wj50.m88271j(this.f181196d, ptl0Var.f181196d);
    }

    public final int hashCode() {
        return this.f181196d.hashCode() + s571.m77245d(s571.m77245d(this.f181193a.hashCode() * 31, 31, this.f181194b), 31, this.f181195c);
    }
}
