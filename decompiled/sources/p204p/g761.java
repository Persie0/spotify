package p204p;

import android.text.style.StyleSpan;

/* JADX INFO: loaded from: classes5.dex */
public final class g761 implements i761 {

    /* JADX INFO: renamed from: a */
    public final int f77194a;

    /* JADX INFO: renamed from: b */
    public final int f77195b;

    /* JADX INFO: renamed from: c */
    public final StyleSpan f77196c;

    public g761(int i, int i2, StyleSpan styleSpan) {
        this.f77194a = i;
        this.f77195b = i2;
        this.f77196c = styleSpan;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g761)) {
            return false;
        }
        g761 g761Var = (g761) obj;
        return this.f77194a == g761Var.f77194a && this.f77195b == g761Var.f77195b && this.f77196c.equals(g761Var.f77196c);
    }

    public final int hashCode() {
        return this.f77196c.hashCode() + mt60.m62800g(this.f77195b, Integer.hashCode(this.f77194a) * 31, 31);
    }
}
