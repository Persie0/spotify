package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class tl0 {

    /* JADX INFO: renamed from: a */
    public final Object f221283a;

    /* JADX INFO: renamed from: b */
    public final Object f221284b;

    /* JADX INFO: renamed from: c */
    public final int f221285c;

    /* JADX INFO: renamed from: d */
    public final int f221286d;

    /* JADX INFO: renamed from: e */
    public final int f221287e;

    /* JADX INFO: renamed from: f */
    public final int f221288f;

    /* JADX INFO: renamed from: g */
    public final int f221289g;

    public tl0(List list, List list2, int i, int i2, int i3, int i4, int i5) {
        this.f221283a = list;
        this.f221284b = list2;
        this.f221285c = i;
        this.f221286d = i2;
        this.f221287e = i3;
        this.f221288f = i4;
        this.f221289g = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tl0)) {
            return false;
        }
        tl0 tl0Var = (tl0) obj;
        return this.f221283a.equals(tl0Var.f221283a) && this.f221284b.equals(tl0Var.f221284b) && this.f221285c == tl0Var.f221285c && this.f221286d == tl0Var.f221286d && this.f221287e == tl0Var.f221287e && this.f221288f == tl0Var.f221288f && this.f221289g == tl0Var.f221289g;
    }

    public final int hashCode() {
        return edb.m38547C(this.f221289g) + f710.m40938f(this.f221288f, mt60.m62800g(this.f221287e, mt60.m62800g(this.f221286d, mt60.m62800g(this.f221285c, dq60.m36604d(this.f221283a.hashCode() * 31, 31, this.f221284b), 31), 31), 31), 31);
    }
}
