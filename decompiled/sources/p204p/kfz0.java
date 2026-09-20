package p204p;

import java.util.TreeMap;

/* JADX INFO: loaded from: classes6.dex */
public final class kfz0 {

    /* JADX INFO: renamed from: a */
    public final TreeMap f122247a;

    /* JADX INFO: renamed from: b */
    public final int f122248b;

    public kfz0(TreeMap treeMap, int i) {
        this.f122247a = treeMap;
        this.f122248b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kfz0)) {
            return false;
        }
        kfz0 kfz0Var = (kfz0) obj;
        return wj50.m88271j(this.f122247a, kfz0Var.f122247a) && this.f122248b == kfz0Var.f122248b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f122248b) + (this.f122247a.hashCode() * 31);
    }
}
