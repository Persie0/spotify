package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@rtz0
public final class u951 {
    public static final t951 Companion = new t951();

    /* JADX INFO: renamed from: d */
    public static final fr70[] f228078d = {null, null, q3d0.m72078I(2, st31.f213785X0)};

    /* JADX INFO: renamed from: a */
    public final String f228079a;

    /* JADX INFO: renamed from: b */
    public final el50 f228080b;

    /* JADX INFO: renamed from: c */
    public final List f228081c;

    public /* synthetic */ u951(int i, String str, el50 el50Var, List list) {
        if (7 != (i & 7)) {
            edo.m38617p(i, 7, s951.f206865a.getDescriptor());
            throw null;
        }
        this.f228079a = str;
        this.f228080b = el50Var;
        this.f228081c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u951)) {
            return false;
        }
        u951 u951Var = (u951) obj;
        return wj50.m88271j(this.f228079a, u951Var.f228079a) && wj50.m88271j(this.f228080b, u951Var.f228080b) && wj50.m88271j(this.f228081c, u951Var.f228081c);
    }

    public final int hashCode() {
        return this.f228081c.hashCode() + ((this.f228080b.hashCode() + (this.f228079a.hashCode() * 31)) * 31);
    }
}
