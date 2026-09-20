package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@rtz0
public final class eu0 {
    public static final du0 Companion = new du0();

    /* JADX INFO: renamed from: b */
    public static final fr70[] f62831b = {q3d0.m72078I(2, C2439u4.f226502V0)};

    /* JADX INFO: renamed from: a */
    public final Map f62832a;

    public /* synthetic */ eu0(int i, Map map) {
        if (1 == (i & 1)) {
            this.f62832a = map;
        } else {
            edo.m38617p(i, 1, cu0.f42009a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eu0) && wj50.m88271j(this.f62832a, ((eu0) obj).f62832a);
    }

    public final int hashCode() {
        return this.f62832a.hashCode();
    }
}
