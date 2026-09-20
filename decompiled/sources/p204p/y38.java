package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class y38 {

    /* JADX INFO: renamed from: a */
    public final String f268776a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f268777b;

    /* JADX INFO: renamed from: c */
    public final String f268778c;

    /* JADX INFO: renamed from: d */
    public final rcm0 f268779d;

    /* JADX INFO: renamed from: e */
    public final String f268780e;

    /* JADX INFO: renamed from: f */
    public final int f268781f;

    /* JADX INFO: renamed from: g */
    public final boolean f268782g;

    public y38(String str, ArrayList arrayList, String str2, rcm0 rcm0Var, String str3, int i, boolean z) {
        this.f268776a = str;
        this.f268777b = arrayList;
        this.f268778c = str2;
        this.f268779d = rcm0Var;
        this.f268780e = str3;
        this.f268781f = i;
        this.f268782g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y38)) {
            return false;
        }
        y38 y38Var = (y38) obj;
        return wj50.m88271j(this.f268776a, y38Var.f268776a) && this.f268777b.equals(y38Var.f268777b) && wj50.m88271j(this.f268778c, y38Var.f268778c) && this.f268779d.equals(y38Var.f268779d) && this.f268780e.equals(y38Var.f268780e) && this.f268781f == y38Var.f268781f && this.f268782g == y38Var.f268782g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f268782g) + f710.m40938f(this.f268781f, s571.m77243b(yds.m93483m(this.f268779d, s571.m77243b(lq51.m59700f(this.f268777b, this.f268776a.hashCode() * 31, 31), 31, this.f268778c), 31), 31, this.f268780e), 31);
    }
}
