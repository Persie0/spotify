package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@rtz0
public final class sci {
    public static final rci Companion = new rci();

    /* JADX INFO: renamed from: b */
    public static final fr70[] f207748b = {q3d0.m72078I(2, ssh.f213617Z)};

    /* JADX INFO: renamed from: a */
    public final List f207749a;

    public /* synthetic */ sci(int i, List list) {
        if (1 == (i & 1)) {
            this.f207749a = list;
        } else {
            edo.m38617p(i, 1, qci.f187372a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sci) && wj50.m88271j(this.f207749a, ((sci) obj).f207749a);
    }

    public final int hashCode() {
        return this.f207749a.hashCode();
    }
}
