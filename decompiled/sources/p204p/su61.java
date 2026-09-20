package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@rtz0
public final class su61 {
    public static final ru61 Companion = new ru61();

    /* JADX INFO: renamed from: b */
    public static final fr70[] f214023b = {q3d0.m72078I(2, uv51.f234347O0)};

    /* JADX INFO: renamed from: a */
    public final List f214024a;

    public /* synthetic */ su61(int i, List list) {
        if (1 == (i & 1)) {
            this.f214024a = list;
        } else {
            edo.m38617p(i, 1, qu61.f192576a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof su61) && wj50.m88271j(this.f214024a, ((su61) obj).f214024a);
    }

    public final int hashCode() {
        return this.f214024a.hashCode();
    }

    public su61(List list) {
        this.f214024a = list;
    }
}
