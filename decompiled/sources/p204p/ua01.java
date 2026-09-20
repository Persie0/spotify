package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ua01 {

    /* JADX INFO: renamed from: a */
    public final int f228319a;

    /* JADX INFO: renamed from: b */
    public final int f228320b;

    /* JADX INFO: renamed from: c */
    public final b450 f228321c;

    /* JADX INFO: renamed from: d */
    public final List f228322d;

    public ua01(int i, int i2, b450 b450Var, List list) {
        this.f228319a = i;
        this.f228320b = i2;
        this.f228321c = b450Var;
        this.f228322d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ua01)) {
            return false;
        }
        ua01 ua01Var = (ua01) obj;
        return this.f228319a == ua01Var.f228319a && this.f228320b == ua01Var.f228320b && wj50.m88271j(this.f228321c, ua01Var.f228321c) && wj50.m88271j(this.f228322d, ua01Var.f228322d);
    }

    public final int hashCode() {
        return this.f228322d.hashCode() + stz0.m79353g(mt60.m62800g(this.f228320b, Integer.hashCode(this.f228319a) * 31, 31), 31, this.f228321c);
    }
}
