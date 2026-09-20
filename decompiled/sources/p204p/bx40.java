package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class bx40 {

    /* JADX INFO: renamed from: a */
    public final int f31778a;

    /* JADX INFO: renamed from: b */
    public final int f31779b;

    /* JADX INFO: renamed from: c */
    public final Map f31780c;

    public bx40(int i, int i2, Map map) {
        this.f31778a = i;
        this.f31779b = i2;
        this.f31780c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bx40)) {
            return false;
        }
        bx40 bx40Var = (bx40) obj;
        return this.f31778a == bx40Var.f31778a && this.f31779b == bx40Var.f31779b && wj50.m88271j(this.f31780c, bx40Var.f31780c);
    }

    public final int hashCode() {
        return this.f31780c.hashCode() + mt60.m62800g(this.f31779b, Integer.hashCode(this.f31778a) * 31, 31);
    }

    public final String toString() {
        return "InsertedViewInfo(mainViewId=" + this.f31778a + ", complexViewId=" + this.f31779b + ", children=" + this.f31780c + ')';
    }

    public /* synthetic */ bx40(int i, int i2, Map map, int i3) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? -1 : i2, (i3 & 4) != 0 ? nau.f152117a : map);
    }
}
