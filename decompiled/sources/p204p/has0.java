package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class has0 {

    /* JADX INFO: renamed from: a */
    public final int f89271a;

    /* JADX INFO: renamed from: b */
    public final int f89272b;

    /* JADX INFO: renamed from: c */
    public final List f89273c;

    public has0(int i, int i2, int i3, ArrayList arrayList) {
        i = (i3 & 1) != 0 ? 0 : i;
        i2 = (i3 & 2) != 0 ? 0 : i2;
        List list = (i3 & 32) != 0 ? lau.f131415a : arrayList;
        this.f89271a = i;
        this.f89272b = i2;
        this.f89273c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof has0)) {
            return false;
        }
        has0 has0Var = (has0) obj;
        return this.f89271a == has0Var.f89271a && this.f89272b == has0Var.f89272b && wj50.m88271j(this.f89273c, has0Var.f89273c);
    }

    public final int hashCode() {
        return this.f89273c.hashCode() + mt60.m62800g(0, mt60.m62800g(0, mt60.m62800g(0, mt60.m62800g(this.f89272b, Integer.hashCode(this.f89271a) * 31, 31), 31), 31), 31);
    }
}
