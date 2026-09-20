package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o690 implements ktx {

    /* JADX INFO: renamed from: a */
    public final int f162288a;

    /* JADX INFO: renamed from: b */
    public final int f162289b;

    /* JADX INFO: renamed from: c */
    public final List f162290c;

    /* JADX INFO: renamed from: d */
    public final int f162291d;

    public o690(int i, int i2, int i3, List list) {
        this.f162288a = i;
        this.f162289b = i2;
        this.f162290c = list;
        this.f162291d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o690)) {
            return false;
        }
        o690 o690Var = (o690) obj;
        return this.f162288a == o690Var.f162288a && this.f162289b == o690Var.f162289b && wj50.m88271j(this.f162290c, o690Var.f162290c) && this.f162291d == o690Var.f162291d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f162291d) + s571.m77244c(mt60.m62800g(this.f162289b, Integer.hashCode(this.f162288a) * 31, 31), 31, this.f162290c);
    }
}
