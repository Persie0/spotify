package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class xka0 {

    /* JADX INFO: renamed from: g */
    public static final xka0 f262315g;

    /* JADX INFO: renamed from: a */
    public final List f262316a;

    /* JADX INFO: renamed from: b */
    public final int f262317b;

    /* JADX INFO: renamed from: c */
    public final int f262318c;

    /* JADX INFO: renamed from: d */
    public final int f262319d;

    /* JADX INFO: renamed from: e */
    public final List f262320e;

    /* JADX INFO: renamed from: f */
    public final jhq0 f262321f;

    static {
        jhq0 jhq0Var = jhq0.f112551d;
        lau lauVar = lau.f131415a;
        f262315g = new xka0(lauVar, 1, 1, 1, lauVar, jhq0Var);
    }

    public xka0(List list, int i, int i2, int i3, List list2, jhq0 jhq0Var) {
        this.f262316a = list;
        this.f262317b = i;
        this.f262318c = i2;
        this.f262319d = i3;
        this.f262320e = list2;
        this.f262321f = jhq0Var;
    }

    /* JADX INFO: renamed from: a */
    public static xka0 m91267a(xka0 xka0Var, List list, int i, int i2, int i3, List list2, jhq0 jhq0Var, int i4) {
        if ((i4 & 1) != 0) {
            list = xka0Var.f262316a;
        }
        List list3 = list;
        if ((i4 & 2) != 0) {
            i = xka0Var.f262317b;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            i2 = xka0Var.f262318c;
        }
        int i6 = i2;
        if ((i4 & 8) != 0) {
            i3 = xka0Var.f262319d;
        }
        int i7 = i3;
        if ((i4 & 16) != 0) {
            list2 = xka0Var.f262320e;
        }
        List list4 = list2;
        if ((i4 & 32) != 0) {
            jhq0Var = xka0Var.f262321f;
        }
        xka0Var.getClass();
        return new xka0(list3, i5, i6, i7, list4, jhq0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xka0)) {
            return false;
        }
        xka0 xka0Var = (xka0) obj;
        return wj50.m88271j(this.f262316a, xka0Var.f262316a) && this.f262317b == xka0Var.f262317b && this.f262318c == xka0Var.f262318c && this.f262319d == xka0Var.f262319d && wj50.m88271j(this.f262320e, xka0Var.f262320e) && wj50.m88271j(this.f262321f, xka0Var.f262321f);
    }

    public final int hashCode() {
        return this.f262321f.hashCode() + s571.m77244c(f710.m40938f(this.f262319d, f710.m40938f(this.f262318c, f710.m40938f(this.f262317b, this.f262316a.hashCode() * 31, 31), 31), 31), 31, this.f262320e);
    }
}
