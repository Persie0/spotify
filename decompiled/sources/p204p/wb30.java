package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@rtz0
public final class wb30 {
    public static final vb30 Companion = new vb30();

    /* JADX INFO: renamed from: b */
    public static final fr70[] f249682b = {q3d0.m72078I(2, u410.f226546Z0)};

    /* JADX INFO: renamed from: a */
    public final List f249683a;

    public /* synthetic */ wb30(int i, List list) {
        if (1 == (i & 1)) {
            this.f249683a = list;
        } else {
            edo.m38617p(i, 1, ub30.f228628a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wb30) && wj50.m88271j(this.f249683a, ((wb30) obj).f249683a);
    }

    public final int hashCode() {
        return this.f249683a.hashCode();
    }
}
