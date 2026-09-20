package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@rtz0
public final class k4j {
    public static final j4j Companion = new j4j();

    /* JADX INFO: renamed from: b */
    public static final fr70[] f119235b = {q3d0.m72078I(2, ssh.f213606Q0)};

    /* JADX INFO: renamed from: a */
    public final List f119236a;

    public /* synthetic */ k4j(int i, List list) {
        if (1 == (i & 1)) {
            this.f119236a = list;
        } else {
            edo.m38617p(i, 1, i4j.f98534a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k4j) && wj50.m88271j(this.f119236a, ((k4j) obj).f119236a);
    }

    public final int hashCode() {
        return this.f119236a.hashCode();
    }
}
