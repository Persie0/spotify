package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class grx0 {

    /* JADX INFO: renamed from: a */
    public final String f83845a;

    /* JADX INFO: renamed from: b */
    public final List f83846b;

    /* JADX INFO: renamed from: c */
    public final int f83847c;

    /* JADX INFO: renamed from: d */
    public final int f83848d;

    /* JADX INFO: renamed from: e */
    public final String f83849e;

    public grx0(int i, int i2, String str, String str2, List list) {
        this.f83845a = str;
        this.f83846b = list;
        this.f83847c = i;
        this.f83848d = i2;
        this.f83849e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof grx0)) {
            return false;
        }
        grx0 grx0Var = (grx0) obj;
        return wj50.m88271j(this.f83845a, grx0Var.f83845a) && wj50.m88271j(this.f83846b, grx0Var.f83846b) && this.f83847c == grx0Var.f83847c && this.f83848d == grx0Var.f83848d && wj50.m88271j(this.f83849e, grx0Var.f83849e);
    }

    public final int hashCode() {
        return this.f83849e.hashCode() + mt60.m62800g(this.f83848d, mt60.m62800g(this.f83847c, s571.m77244c(this.f83845a.hashCode() * 31, 31, this.f83846b), 31), 31);
    }
}
