package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class anu0 {

    /* JADX INFO: renamed from: a */
    public final String f17497a;

    /* JADX INFO: renamed from: b */
    public final int f17498b;

    /* JADX INFO: renamed from: c */
    public final String f17499c;

    /* JADX INFO: renamed from: d */
    public final String f17500d;

    /* JADX INFO: renamed from: e */
    public final List f17501e;

    /* JADX INFO: renamed from: f */
    public final int f17502f;

    /* JADX INFO: renamed from: g */
    public final int f17503g;

    /* JADX INFO: renamed from: h */
    public final boolean f17504h;

    /* JADX INFO: renamed from: i */
    public final int f17505i;

    public anu0(String str, int i, String str2, String str3, List list, int i2, int i3, boolean z, int i4) {
        this.f17497a = str;
        this.f17498b = i;
        this.f17499c = str2;
        this.f17500d = str3;
        this.f17501e = list;
        this.f17502f = i2;
        this.f17503g = i3;
        this.f17504h = z;
        this.f17505i = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anu0)) {
            return false;
        }
        anu0 anu0Var = (anu0) obj;
        return wj50.m88271j(this.f17497a, anu0Var.f17497a) && this.f17498b == anu0Var.f17498b && wj50.m88271j(this.f17499c, anu0Var.f17499c) && wj50.m88271j(this.f17500d, anu0Var.f17500d) && wj50.m88271j(this.f17501e, anu0Var.f17501e) && this.f17502f == anu0Var.f17502f && this.f17503g == anu0Var.f17503g && this.f17504h == anu0Var.f17504h && this.f17505i == anu0Var.f17505i;
    }

    public final int hashCode() {
        return edb.m38547C(this.f17505i) + s571.m77245d(mt60.m62800g(this.f17503g, mt60.m62800g(this.f17502f, s571.m77244c(s571.m77243b(s571.m77243b(mt60.m62800g(this.f17498b, this.f17497a.hashCode() * 31, 31), 31, this.f17499c), 31, this.f17500d), 31, this.f17501e), 31), 31), 31, this.f17504h);
    }
}
