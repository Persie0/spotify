package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@rtz0
public final class yfn0 {
    public static final xfn0 Companion = new xfn0();

    /* JADX INFO: renamed from: h */
    public static final fr70[] f272294h = {q3d0.m72078I(2, ytl0.f276166b1), null, null, null, null, null, null};

    /* JADX INFO: renamed from: a */
    public final List f272295a;

    /* JADX INFO: renamed from: b */
    public final ign0 f272296b;

    /* JADX INFO: renamed from: c */
    public final bgn0 f272297c;

    /* JADX INFO: renamed from: d */
    public final boolean f272298d;

    /* JADX INFO: renamed from: e */
    public final boolean f272299e;

    /* JADX INFO: renamed from: f */
    public final boolean f272300f;

    /* JADX INFO: renamed from: g */
    public final int f272301g;

    public /* synthetic */ yfn0(int i, List list, ign0 ign0Var, bgn0 bgn0Var, boolean z, boolean z2, boolean z3, int i2) {
        if (7 != (i & 7)) {
            edo.m38617p(i, 7, wfn0.f250877a.getDescriptor());
            throw null;
        }
        this.f272295a = list;
        this.f272296b = ign0Var;
        this.f272297c = bgn0Var;
        if ((i & 8) == 0) {
            this.f272298d = false;
        } else {
            this.f272298d = z;
        }
        if ((i & 16) == 0) {
            this.f272299e = false;
        } else {
            this.f272299e = z2;
        }
        if ((i & 32) == 0) {
            this.f272300f = false;
        } else {
            this.f272300f = z3;
        }
        if ((i & 64) == 0) {
            this.f272301g = 3;
        } else {
            this.f272301g = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yfn0)) {
            return false;
        }
        yfn0 yfn0Var = (yfn0) obj;
        return wj50.m88271j(this.f272295a, yfn0Var.f272295a) && wj50.m88271j(this.f272296b, yfn0Var.f272296b) && wj50.m88271j(this.f272297c, yfn0Var.f272297c) && this.f272298d == yfn0Var.f272298d && this.f272299e == yfn0Var.f272299e && this.f272300f == yfn0Var.f272300f && this.f272301g == yfn0Var.f272301g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f272301g) + s571.m77245d(s571.m77245d(s571.m77245d((this.f272297c.hashCode() + ((this.f272296b.hashCode() + (this.f272295a.hashCode() * 31)) * 31)) * 31, 31, this.f272298d), 31, this.f272299e), 31, this.f272300f);
    }

    public yfn0(List list, ign0 ign0Var, bgn0 bgn0Var, boolean z, boolean z2, boolean z3, int i) {
        this.f272295a = list;
        this.f272296b = ign0Var;
        this.f272297c = bgn0Var;
        this.f272298d = z;
        this.f272299e = z2;
        this.f272300f = z3;
        this.f272301g = i;
    }
}
