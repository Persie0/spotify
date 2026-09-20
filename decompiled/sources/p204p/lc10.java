package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
@rtz0
public final class lc10 {
    public static final kc10 Companion = new kc10();

    /* JADX INFO: renamed from: d */
    public static final fr70[] f131793d = {q3d0.m72078I(2, u410.f226557i), q3d0.m72078I(2, u410.f226558t), null};

    /* JADX INFO: renamed from: a */
    public final List f131794a;

    /* JADX INFO: renamed from: b */
    public final List f131795b;

    /* JADX INFO: renamed from: c */
    public final v310 f131796c;

    public /* synthetic */ lc10(int i, List list, List list2, v310 v310Var) {
        if (7 != (i & 7)) {
            edo.m38617p(i, 7, jc10.f110938a.getDescriptor());
            throw null;
        }
        this.f131794a = list;
        this.f131795b = list2;
        this.f131796c = v310Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lc10)) {
            return false;
        }
        lc10 lc10Var = (lc10) obj;
        return wj50.m88271j(this.f131794a, lc10Var.f131794a) && wj50.m88271j(this.f131795b, lc10Var.f131795b) && wj50.m88271j(this.f131796c, lc10Var.f131796c);
    }

    public final int hashCode() {
        return this.f131796c.hashCode() + s571.m77244c(this.f131794a.hashCode() * 31, 31, this.f131795b);
    }
}
