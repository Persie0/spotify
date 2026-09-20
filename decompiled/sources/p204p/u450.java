package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@rtz0
public final class u450 {
    public static final t450 Companion = new t450();

    /* JADX INFO: renamed from: b */
    public static final fr70[] f226598b = {q3d0.m72078I(2, wv30.f255386i)};

    /* JADX INFO: renamed from: a */
    public final List f226599a;

    public /* synthetic */ u450(int i, List list) {
        if (1 == (i & 1)) {
            this.f226599a = list;
        } else {
            edo.m38617p(i, 1, s450.f205498a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u450) && wj50.m88271j(this.f226599a, ((u450) obj).f226599a);
    }

    public final int hashCode() {
        return this.f226599a.hashCode();
    }
}
