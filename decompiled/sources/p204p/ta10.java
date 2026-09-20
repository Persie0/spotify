package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@rtz0
public final class ta10 {
    public static final sa10 Companion = new sa10();

    /* JADX INFO: renamed from: e */
    public static final fr70[] f218412e = {q3d0.m72078I(2, u410.f226555g), null, q3d0.m72078I(2, u410.f226556h), null};

    /* JADX INFO: renamed from: a */
    public final List f218413a;

    /* JADX INFO: renamed from: b */
    public final i0u0 f218414b;

    /* JADX INFO: renamed from: c */
    public final List f218415c;

    /* JADX INFO: renamed from: d */
    public final p0u0 f218416d;

    public /* synthetic */ ta10(int i, List list, i0u0 i0u0Var, List list2, p0u0 p0u0Var) {
        if (12 != (i & 12)) {
            edo.m38617p(i, 12, ra10.f197163a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.f218413a = null;
        } else {
            this.f218413a = list;
        }
        if ((i & 2) == 0) {
            this.f218414b = new i0u0();
        } else {
            this.f218414b = i0u0Var;
        }
        this.f218415c = list2;
        this.f218416d = p0u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ta10)) {
            return false;
        }
        ta10 ta10Var = (ta10) obj;
        return wj50.m88271j(this.f218413a, ta10Var.f218413a) && wj50.m88271j(this.f218414b, ta10Var.f218414b) && wj50.m88271j(this.f218415c, ta10Var.f218415c) && wj50.m88271j(this.f218416d, ta10Var.f218416d);
    }

    public final int hashCode() {
        List list = this.f218413a;
        return this.f218416d.hashCode() + s571.m77244c((this.f218414b.hashCode() + ((list == null ? 0 : list.hashCode()) * 31)) * 31, 31, this.f218415c);
    }
}
