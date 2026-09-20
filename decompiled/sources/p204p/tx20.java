package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class tx20 {

    /* JADX INFO: renamed from: a */
    public final List f224545a;

    /* JADX INFO: renamed from: b */
    public final List f224546b;

    /* JADX INFO: renamed from: c */
    public final int f224547c;

    /* JADX INFO: renamed from: d */
    public final double f224548d;

    public tx20(List list, List list2, int i, double d) {
        this.f224545a = list;
        this.f224546b = list2;
        this.f224547c = i;
        this.f224548d = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tx20)) {
            return false;
        }
        tx20 tx20Var = (tx20) obj;
        return wj50.m88271j(this.f224545a, tx20Var.f224545a) && wj50.m88271j(this.f224546b, tx20Var.f224546b) && this.f224547c == tx20Var.f224547c && Double.compare(this.f224548d, tx20Var.f224548d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f224548d) + mt60.m62800g(this.f224547c, s571.m77244c(this.f224545a.hashCode() * 31, 31, this.f224546b), 31);
    }
}
