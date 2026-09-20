package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@rtz0
public final class a6n0 {
    public static final z5n0 Companion = new z5n0();

    /* JADX INFO: renamed from: c */
    public static final fr70[] f12826c = {null, q3d0.m72078I(2, ytl0.f276161Y0)};

    /* JADX INFO: renamed from: a */
    public final String f12827a;

    /* JADX INFO: renamed from: b */
    public final List f12828b;

    public /* synthetic */ a6n0(String str, int i, List list) {
        if (3 != (i & 3)) {
            edo.m38617p(i, 3, y5n0.f269495a.getDescriptor());
            throw null;
        }
        this.f12827a = str;
        this.f12828b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6n0)) {
            return false;
        }
        a6n0 a6n0Var = (a6n0) obj;
        return wj50.m88271j(this.f12827a, a6n0Var.f12827a) && wj50.m88271j(this.f12828b, a6n0Var.f12828b);
    }

    public final int hashCode() {
        return this.f12828b.hashCode() + (this.f12827a.hashCode() * 31);
    }
}
