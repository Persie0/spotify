package p204p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class p6u0 {

    /* JADX INFO: renamed from: a */
    public final int f174496a;

    /* JADX INFO: renamed from: b */
    public final int f174497b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f174498c = new LinkedHashMap();

    public p6u0(int i, int i2) {
        this.f174496a = i;
        this.f174497b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6u0)) {
            return false;
        }
        p6u0 p6u0Var = (p6u0) obj;
        return this.f174496a == p6u0Var.f174496a && this.f174497b == p6u0Var.f174497b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f174497b) + (Integer.hashCode(this.f174496a) * 31);
    }
}
