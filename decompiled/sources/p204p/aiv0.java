package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@rtz0
public final class aiv0 {
    public static final zhv0 Companion = new zhv0();

    /* JADX INFO: renamed from: b */
    public static final fr70[] f16099b = {q3d0.m72078I(2, o5t0.f162081a1)};

    /* JADX INFO: renamed from: a */
    public final List f16100a;

    public /* synthetic */ aiv0(int i, List list) {
        if (1 == (i & 1)) {
            this.f16100a = list;
        } else {
            edo.m38617p(i, 1, yhv0.f272984a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aiv0) && wj50.m88271j(this.f16100a, ((aiv0) obj).f16100a);
    }

    public final int hashCode() {
        return this.f16100a.hashCode();
    }
}
