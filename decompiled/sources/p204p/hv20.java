package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class hv20 {

    /* JADX INFO: renamed from: a */
    public final String f95560a;

    /* JADX INFO: renamed from: b */
    public final String f95561b;

    /* JADX INFO: renamed from: c */
    public final gv20 f95562c;

    /* JADX INFO: renamed from: d */
    public final String f95563d;

    /* JADX INFO: renamed from: e */
    public final int f95564e;

    /* JADX INFO: renamed from: f */
    public final int f95565f;

    /* JADX INFO: renamed from: g */
    public final int f95566g;

    /* JADX INFO: renamed from: h */
    public final int f95567h;

    /* JADX INFO: renamed from: i */
    public final String f95568i;

    /* JADX INFO: renamed from: j */
    public final int f95569j;

    /* JADX INFO: renamed from: k */
    public final boolean f95570k;

    public hv20(String str, String str2, gv20 gv20Var, String str3, int i, int i2, int i3, int i4, String str4, int i5, boolean z) {
        this.f95560a = str;
        this.f95561b = str2;
        this.f95562c = gv20Var;
        this.f95563d = str3;
        this.f95564e = i;
        this.f95565f = i2;
        this.f95566g = i3;
        this.f95567h = i4;
        this.f95568i = str4;
        this.f95569j = i5;
        this.f95570k = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hv20)) {
            return false;
        }
        hv20 hv20Var = (hv20) obj;
        return wj50.m88271j(this.f95560a, hv20Var.f95560a) && wj50.m88271j(this.f95561b, hv20Var.f95561b) && wj50.m88271j(this.f95562c, hv20Var.f95562c) && wj50.m88271j(this.f95563d, hv20Var.f95563d) && this.f95564e == hv20Var.f95564e && this.f95565f == hv20Var.f95565f && this.f95566g == hv20Var.f95566g && this.f95567h == hv20Var.f95567h && wj50.m88271j(this.f95568i, hv20Var.f95568i) && this.f95569j == hv20Var.f95569j && this.f95570k == hv20Var.f95570k;
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f95567h, mt60.m62800g(this.f95566g, mt60.m62800g(this.f95565f, mt60.m62800g(this.f95564e, s571.m77243b((this.f95562c.hashCode() + s571.m77243b(this.f95560a.hashCode() * 31, 31, this.f95561b)) * 31, 31, this.f95563d), 31), 31), 31), 31);
        String str = this.f95568i;
        return Boolean.hashCode(this.f95570k) + mt60.m62800g(this.f95569j, (iM62800g + (str == null ? 0 : str.hashCode())) * 31, 31);
    }
}
