package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
@rtz0
public final class q14 {
    public static final p14 Companion = new p14();

    /* JADX INFO: renamed from: c */
    public static final fr70[] f184204c = {q3d0.m72078I(2, l12.f128576U0), q3d0.m72078I(2, l12.f128577V0)};

    /* JADX INFO: renamed from: a */
    public final Set f184205a;

    /* JADX INFO: renamed from: b */
    public final Set f184206b;

    public /* synthetic */ q14(int i, Set set, Set set2) {
        if (3 != (i & 3)) {
            edo.m38617p(i, 3, o14.f160614a.getDescriptor());
            throw null;
        }
        this.f184205a = set;
        this.f184206b = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q14)) {
            return false;
        }
        q14 q14Var = (q14) obj;
        return wj50.m88271j(this.f184205a, q14Var.f184205a) && wj50.m88271j(this.f184206b, q14Var.f184206b);
    }

    public final int hashCode() {
        return this.f184206b.hashCode() + (this.f184205a.hashCode() * 31);
    }

    public q14(Set set, Set set2) {
        this.f184205a = set;
        this.f184206b = set2;
    }
}
