package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@rtz0
public final class i3z {
    public static final e3z Companion = new e3z();

    /* JADX INFO: renamed from: c */
    public static final fr70[] f98353c = {null, q3d0.m72078I(2, i4y.f98658t)};

    /* JADX INFO: renamed from: a */
    public final boolean f98354a;

    /* JADX INFO: renamed from: b */
    public final List f98355b;

    public i3z() {
        this.f98354a = false;
        this.f98355b = lau.f131415a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3z)) {
            return false;
        }
        i3z i3zVar = (i3z) obj;
        return this.f98354a == i3zVar.f98354a && wj50.m88271j(this.f98355b, i3zVar.f98355b);
    }

    public final int hashCode() {
        return this.f98355b.hashCode() + (Boolean.hashCode(this.f98354a) * 31);
    }

    public /* synthetic */ i3z(int i, boolean z, List list) {
        if (3 != (i & 3)) {
            edo.m38617p(i, 3, d3z.f45036a.getDescriptor());
            throw null;
        }
        this.f98354a = z;
        this.f98355b = list;
    }
}
