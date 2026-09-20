package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class hdz0 {

    /* JADX INFO: renamed from: a */
    public final String f90256a;

    /* JADX INFO: renamed from: b */
    public final int f90257b;

    /* JADX INFO: renamed from: c */
    public final String f90258c;

    /* JADX INFO: renamed from: d */
    public final int f90259d;

    /* JADX INFO: renamed from: e */
    public final int f90260e;

    /* JADX INFO: renamed from: f */
    public final int f90261f;

    /* JADX INFO: renamed from: g */
    public final int f90262g;

    /* JADX INFO: renamed from: h */
    public final List f90263h;

    /* JADX INFO: renamed from: i */
    public final List f90264i;

    /* JADX INFO: renamed from: j */
    public final int f90265j;

    public hdz0(String str, int i, String str2, int i2, int i3, int i4, int i5, List list, List list2, int i6) {
        this.f90256a = str;
        this.f90257b = i;
        this.f90258c = str2;
        this.f90259d = i2;
        this.f90260e = i3;
        this.f90261f = i4;
        this.f90262g = i5;
        this.f90263h = list;
        this.f90264i = list2;
        this.f90265j = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdz0)) {
            return false;
        }
        hdz0 hdz0Var = (hdz0) obj;
        return wj50.m88271j(this.f90256a, hdz0Var.f90256a) && this.f90257b == hdz0Var.f90257b && wj50.m88271j(this.f90258c, hdz0Var.f90258c) && this.f90259d == hdz0Var.f90259d && this.f90260e == hdz0Var.f90260e && this.f90261f == hdz0Var.f90261f && this.f90262g == hdz0Var.f90262g && wj50.m88271j(this.f90263h, hdz0Var.f90263h) && wj50.m88271j(this.f90264i, hdz0Var.f90264i) && this.f90265j == hdz0Var.f90265j;
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f90262g, mt60.m62800g(this.f90261f, mt60.m62800g(this.f90260e, mt60.m62800g(this.f90259d, s571.m77243b(mt60.m62800g(this.f90257b, this.f90256a.hashCode() * 31, 31), 31, this.f90258c), 31), 31), 31), 31);
        List list = this.f90263h;
        return Integer.hashCode(this.f90265j) + s571.m77244c((iM62800g + (list == null ? 0 : list.hashCode())) * 31, 31, this.f90264i);
    }
}
