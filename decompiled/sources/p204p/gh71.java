package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class gh71 implements ktx {

    /* JADX INFO: renamed from: a */
    public final int f79847a;

    /* JADX INFO: renamed from: b */
    public final int f79848b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f79849c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f79850d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f79851e;

    public gh71(int i, int i2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f79847a = i;
        this.f79848b = i2;
        this.f79849c = arrayList;
        this.f79850d = arrayList2;
        this.f79851e = arrayList3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gh71)) {
            return false;
        }
        gh71 gh71Var = (gh71) obj;
        return this.f79847a == gh71Var.f79847a && this.f79848b == gh71Var.f79848b && this.f79849c.equals(gh71Var.f79849c) && this.f79850d.equals(gh71Var.f79850d) && this.f79851e.equals(gh71Var.f79851e);
    }

    public final int hashCode() {
        return this.f79851e.hashCode() + lq51.m59700f(this.f79850d, lq51.m59700f(this.f79849c, mt60.m62800g(this.f79848b, Integer.hashCode(this.f79847a) * 31, 31), 31), 31);
    }
}
