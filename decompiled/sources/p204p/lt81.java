package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@rtz0
public final class lt81 {
    public static final kt81 Companion = new kt81();

    /* JADX INFO: renamed from: c */
    public static final fr70[] f136725c = {q3d0.m72078I(2, c781.f34815d), q3d0.m72078I(2, c781.f34816e)};

    /* JADX INFO: renamed from: a */
    public final List f136726a;

    /* JADX INFO: renamed from: b */
    public final List f136727b;

    public /* synthetic */ lt81(int i, List list, List list2) {
        if (3 != (i & 3)) {
            edo.m38617p(i, 3, jt81.f115763a.getDescriptor());
            throw null;
        }
        this.f136726a = list;
        this.f136727b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lt81)) {
            return false;
        }
        lt81 lt81Var = (lt81) obj;
        return wj50.m88271j(this.f136726a, lt81Var.f136726a) && wj50.m88271j(this.f136727b, lt81Var.f136727b);
    }

    public final int hashCode() {
        return this.f136727b.hashCode() + (this.f136726a.hashCode() * 31);
    }
}
