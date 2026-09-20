package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class du5 implements gu5 {

    /* JADX INFO: renamed from: a */
    public final int f52976a;

    /* JADX INFO: renamed from: b */
    public final int f52977b;

    /* JADX INFO: renamed from: c */
    public final String f52978c;

    /* JADX INFO: renamed from: d */
    public final int f52979d;

    /* JADX INFO: renamed from: e */
    public final Object f52980e;

    public du5(int i, int i2, int i3, String str, List list) {
        this.f52976a = i;
        this.f52977b = i2;
        this.f52978c = str;
        this.f52979d = i3;
        this.f52980e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof du5)) {
            return false;
        }
        du5 du5Var = (du5) obj;
        return this.f52976a == du5Var.f52976a && this.f52977b == du5Var.f52977b && wj50.m88271j(this.f52978c, du5Var.f52978c) && this.f52979d == du5Var.f52979d && this.f52980e.equals(du5Var.f52980e);
    }

    public final int hashCode() {
        return this.f52980e.hashCode() + mt60.m62800g(this.f52979d, s571.m77243b(mt60.m62800g(this.f52977b, Integer.hashCode(this.f52976a) * 31, 31), 31, this.f52978c), 31);
    }
}
