package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class wc71 implements xc71 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f249976a;

    /* JADX INFO: renamed from: b */
    public final int f249977b;

    /* JADX INFO: renamed from: c */
    public final int f249978c;

    /* JADX INFO: renamed from: d */
    public final int f249979d;

    public wc71(int i, int i2, int i3, ArrayList arrayList) {
        this.f249976a = arrayList;
        this.f249977b = i;
        this.f249978c = i2;
        this.f249979d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wc71)) {
            return false;
        }
        wc71 wc71Var = (wc71) obj;
        return this.f249976a.equals(wc71Var.f249976a) && this.f249977b == wc71Var.f249977b && this.f249978c == wc71Var.f249978c && this.f249979d == wc71Var.f249979d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f249979d) + mt60.m62800g(this.f249978c, mt60.m62800g(this.f249977b, this.f249976a.hashCode() * 31, 31), 31);
    }
}
