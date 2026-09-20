package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class cqb1 {

    /* JADX INFO: renamed from: a */
    public final String f40816a;

    /* JADX INFO: renamed from: b */
    public final String f40817b;

    /* JADX INFO: renamed from: c */
    public final y1c1 f40818c;

    /* JADX INFO: renamed from: d */
    public final String f40819d;

    /* JADX INFO: renamed from: e */
    public final rcm0 f40820e;

    /* JADX INFO: renamed from: f */
    public final int f40821f;

    /* JADX INFO: renamed from: g */
    public final List f40822g;

    public cqb1(String str, String str2, y1c1 y1c1Var, String str3, rcm0 rcm0Var, int i, List list) {
        this.f40816a = str;
        this.f40817b = str2;
        this.f40818c = y1c1Var;
        this.f40819d = str3;
        this.f40820e = rcm0Var;
        this.f40821f = i;
        this.f40822g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqb1)) {
            return false;
        }
        cqb1 cqb1Var = (cqb1) obj;
        return wj50.m88271j(this.f40816a, cqb1Var.f40816a) && wj50.m88271j(this.f40817b, cqb1Var.f40817b) && wj50.m88271j(this.f40818c, cqb1Var.f40818c) && wj50.m88271j(this.f40819d, cqb1Var.f40819d) && wj50.m88271j(this.f40820e, cqb1Var.f40820e) && this.f40821f == cqb1Var.f40821f && wj50.m88271j(this.f40822g, cqb1Var.f40822g);
    }

    public final int hashCode() {
        return this.f40822g.hashCode() + mt60.m62800g(this.f40821f, yds.m93483m(this.f40820e, s571.m77243b((this.f40818c.hashCode() + s571.m77243b(this.f40816a.hashCode() * 31, 31, this.f40817b)) * 31, 31, this.f40819d), 31), 31);
    }
}
