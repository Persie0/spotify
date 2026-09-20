package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class zr01 {

    /* JADX INFO: renamed from: a */
    public final List f285503a;

    /* JADX INFO: renamed from: b */
    public final int f285504b;

    public zr01(int i, List list) {
        this.f285503a = list;
        this.f285504b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zr01)) {
            return false;
        }
        zr01 zr01Var = (zr01) obj;
        return wj50.m88271j(this.f285503a, zr01Var.f285503a) && this.f285504b == zr01Var.f285504b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f285504b) + (this.f285503a.hashCode() * 31);
    }
}
