package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
@rtz0
public final class rbz0 {
    public static final qbz0 Companion = new qbz0();

    /* JADX INFO: renamed from: b */
    public static final fr70[] f197677b = {q3d0.m72078I(2, gly0.f81225t)};

    /* JADX INFO: renamed from: a */
    public final List f197678a;

    public /* synthetic */ rbz0(int i, List list) {
        if (1 == (i & 1)) {
            this.f197678a = list;
        } else {
            edo.m38617p(i, 1, pbz0.f175919a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rbz0) && wj50.m88271j(this.f197678a, ((rbz0) obj).f197678a);
    }

    public final int hashCode() {
        return this.f197678a.hashCode();
    }
}
