package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@rtz0
public final class u1g0 {
    public static final t1g0 Companion = new t1g0();

    /* JADX INFO: renamed from: c */
    public static final fr70[] f225816c = {q3d0.m72078I(2, sfe0.f208556X), null};

    /* JADX INFO: renamed from: a */
    public final Set f225817a;

    /* JADX INFO: renamed from: b */
    public final int f225818b;

    public /* synthetic */ u1g0(int i, int i2, Set set) {
        this.f225817a = (i & 1) == 0 ? gbu.f78413a : set;
        if ((i & 2) == 0) {
            this.f225818b = 0;
        } else {
            this.f225818b = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1g0)) {
            return false;
        }
        u1g0 u1g0Var = (u1g0) obj;
        return wj50.m88271j(this.f225817a, u1g0Var.f225817a) && this.f225818b == u1g0Var.f225818b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f225818b) + (this.f225817a.hashCode() * 31);
    }

    public u1g0(int i, Set set) {
        this.f225817a = set;
        this.f225818b = i;
    }
}
