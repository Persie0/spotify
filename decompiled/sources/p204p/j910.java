package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@rtz0
public final class j910 extends l910 {
    public static final i910 Companion = new i910();

    /* JADX INFO: renamed from: f */
    public static final fr70[] f110073f = {null, null, null, q3d0.m72078I(2, u410.f226553e)};

    /* JADX INFO: renamed from: b */
    public final String f110074b;

    /* JADX INFO: renamed from: c */
    public final String f110075c;

    /* JADX INFO: renamed from: d */
    public final String f110076d;

    /* JADX INFO: renamed from: e */
    public final List f110077e;

    public /* synthetic */ j910(int i, String str, String str2, String str3, List list) {
        if (15 != (i & 15)) {
            edo.m38617p(i, 15, h910.f88857a.getDescriptor());
            throw null;
        }
        this.f110074b = str;
        this.f110075c = str2;
        this.f110076d = str3;
        this.f110077e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j910)) {
            return false;
        }
        j910 j910Var = (j910) obj;
        return wj50.m88271j(this.f110074b, j910Var.f110074b) && wj50.m88271j(this.f110075c, j910Var.f110075c) && wj50.m88271j(this.f110076d, j910Var.f110076d) && wj50.m88271j(this.f110077e, j910Var.f110077e);
    }

    public final int hashCode() {
        return this.f110077e.hashCode() + s571.m77243b(s571.m77243b(this.f110074b.hashCode() * 31, 31, this.f110075c), 31, this.f110076d);
    }
}
