package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
@rtz0
public final class o810 {
    public static final n810 Companion = new n810();

    /* JADX INFO: renamed from: b */
    public static final fr70[] f162671b = {q3d0.m72078I(2, u410.f226552d)};

    /* JADX INFO: renamed from: a */
    public final List f162672a;

    public /* synthetic */ o810(int i, List list) {
        if (1 == (i & 1)) {
            this.f162672a = list;
        } else {
            edo.m38617p(i, 1, m810.f140894a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o810) && wj50.m88271j(this.f162672a, ((o810) obj).f162672a);
    }

    public final int hashCode() {
        return this.f162672a.hashCode();
    }
}
