package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@rtz0
public final class k280 {
    public static final j280 Companion = new j280();

    /* JADX INFO: renamed from: c */
    public static final fr70[] f118548c = {q3d0.m72078I(2, wv30.f255375Z0), null};

    /* JADX INFO: renamed from: a */
    public final List f118549a;

    /* JADX INFO: renamed from: b */
    public final String f118550b;

    public /* synthetic */ k280(String str, int i, List list) {
        if (3 != (i & 3)) {
            edo.m38617p(i, 3, i280.f97764a.getDescriptor());
            throw null;
        }
        this.f118549a = list;
        this.f118550b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k280)) {
            return false;
        }
        k280 k280Var = (k280) obj;
        return wj50.m88271j(this.f118549a, k280Var.f118549a) && wj50.m88271j(this.f118550b, k280Var.f118550b);
    }

    public final int hashCode() {
        return this.f118550b.hashCode() + (this.f118549a.hashCode() * 31);
    }
}
