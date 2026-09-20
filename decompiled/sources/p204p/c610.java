package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@rtz0
public final class c610 {
    public static final b610 Companion = new b610();

    /* JADX INFO: renamed from: c */
    public static final fr70[] f34331c = {q3d0.m72078I(2, u410.f226550c), null};

    /* JADX INFO: renamed from: a */
    public final List f34332a;

    /* JADX INFO: renamed from: b */
    public final Boolean f34333b;

    public /* synthetic */ c610(int i, List list, Boolean bool) {
        if ((i & 1) == 0) {
            this.f34332a = null;
        } else {
            this.f34332a = list;
        }
        if ((i & 2) == 0) {
            this.f34333b = null;
        } else {
            this.f34333b = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c610)) {
            return false;
        }
        c610 c610Var = (c610) obj;
        return wj50.m88271j(this.f34332a, c610Var.f34332a) && wj50.m88271j(this.f34333b, c610Var.f34333b);
    }

    public final int hashCode() {
        List list = this.f34332a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.f34333b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public c610(List list, Boolean bool) {
        this.f34332a = list;
        this.f34333b = bool;
    }
}
