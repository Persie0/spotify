package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
@rtz0
public final class tz51 {
    public static final sz51 Companion = new sz51();

    /* JADX INFO: renamed from: b */
    public static final fr70[] f225161b = {q3d0.m72078I(2, uv51.f234358Y)};

    /* JADX INFO: renamed from: a */
    public final List f225162a;

    public /* synthetic */ tz51(int i, List list) {
        if (1 == (i & 1)) {
            this.f225162a = list;
        } else {
            edo.m38617p(i, 1, rz51.f204073a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tz51) && wj50.m88271j(this.f225162a, ((tz51) obj).f225162a);
    }

    public final int hashCode() {
        return this.f225162a.hashCode();
    }
}
