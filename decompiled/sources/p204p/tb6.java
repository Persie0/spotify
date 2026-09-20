package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class tb6 {

    /* JADX INFO: renamed from: a */
    public final List f218760a;

    /* JADX INFO: renamed from: b */
    public final ejy0 f218761b;

    /* JADX INFO: renamed from: c */
    public final int f218762c;

    public tb6(List list, ejy0 ejy0Var, int i) {
        this.f218760a = list;
        this.f218761b = ejy0Var;
        this.f218762c = i;
    }

    /* JADX INFO: renamed from: a */
    public static tb6 m80378a(tb6 tb6Var, ejy0 ejy0Var, int i, int i2) {
        List list = tb6Var.f218760a;
        if ((i2 & 4) != 0) {
            i = tb6Var.f218762c;
        }
        tb6Var.getClass();
        return new tb6(list, ejy0Var, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tb6)) {
            return false;
        }
        tb6 tb6Var = (tb6) obj;
        return wj50.m88271j(this.f218760a, tb6Var.f218760a) && this.f218761b == tb6Var.f218761b && this.f218762c == tb6Var.f218762c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f218762c) + ((this.f218761b.hashCode() + (this.f218760a.hashCode() * 31)) * 31);
    }

    public /* synthetic */ tb6(List list) {
        this(list, ejy0.f60319a, -1);
    }
}
