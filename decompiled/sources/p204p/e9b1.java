package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class e9b1 {

    /* JADX INFO: renamed from: a */
    public final List f57403a;

    /* JADX INFO: renamed from: b */
    public final int f57404b;

    public e9b1(int i, List list) {
        this.f57403a = list;
        this.f57404b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e9b1)) {
            return false;
        }
        e9b1 e9b1Var = (e9b1) obj;
        return wj50.m88271j(this.f57403a, e9b1Var.f57403a) && this.f57404b == e9b1Var.f57404b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f57404b) + (this.f57403a.hashCode() * 31);
    }
}
