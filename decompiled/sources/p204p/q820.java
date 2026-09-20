package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class q820 {

    /* JADX INFO: renamed from: a */
    public final boolean f186220a;

    /* JADX INFO: renamed from: b */
    public final Object f186221b;

    /* JADX INFO: renamed from: c */
    public final boolean f186222c;

    public q820(List list, boolean z, boolean z2) {
        this.f186220a = z;
        this.f186221b = list;
        this.f186222c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q820)) {
            return false;
        }
        q820 q820Var = (q820) obj;
        return this.f186220a == q820Var.f186220a && this.f186221b.equals(q820Var.f186221b) && this.f186222c == q820Var.f186222c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f186222c) + dq60.m36604d(Boolean.hashCode(this.f186220a) * 31, 31, this.f186221b);
    }
}
