package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes7.dex */
public final class yv20 {

    /* JADX INFO: renamed from: a */
    public final ml80 f276543a;

    /* JADX INFO: renamed from: b */
    public final float f276544b;

    /* JADX INFO: renamed from: c */
    public final j4m0 f276545c;

    /* JADX INFO: renamed from: d */
    public final j4m0 f276546d;

    /* JADX INFO: renamed from: e */
    public final j4m0 f276547e;

    /* JADX INFO: renamed from: f */
    public final ml80 f276548f;

    /* JADX INFO: renamed from: g */
    public final wt20 f276549g;

    public yv20(ml80 ml80Var, float f, j4m0 j4m0Var, j4m0 j4m0Var2, j4m0 j4m0Var3, ml80 ml80Var2, wt20 wt20Var) {
        this.f276543a = ml80Var;
        this.f276544b = f;
        this.f276545c = j4m0Var;
        this.f276546d = j4m0Var2;
        this.f276547e = j4m0Var3;
        this.f276548f = ml80Var2;
        this.f276549g = wt20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yv20)) {
            return false;
        }
        yv20 yv20Var = (yv20) obj;
        return this.f276543a.equals(yv20Var.f276543a) && ybs.m93301b(this.f276544b, yv20Var.f276544b) && this.f276545c.equals(yv20Var.f276545c) && this.f276546d.equals(yv20Var.f276546d) && this.f276547e.equals(yv20Var.f276547e) && this.f276548f.equals(yv20Var.f276548f) && this.f276549g.equals(yv20Var.f276549g);
    }

    public final int hashCode() {
        return this.f276549g.hashCode() + m6b.m60989d(this.f276548f.f144774a, (this.f276547e.hashCode() + ((this.f276546d.hashCode() + ((this.f276545c.hashCode() + AbstractC0000a.m8g(this.f276543a.f144774a.hashCode() * 31, 31, this.f276544b)) * 31)) * 31)) * 31, 31);
    }
}
