package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class sin0 {

    /* JADX INFO: renamed from: a */
    public final float f209574a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f209575b;

    /* JADX INFO: renamed from: c */
    public final m730 f209576c;

    public sin0(float f, ArrayList arrayList, m730 m730Var) {
        this.f209574a = f;
        this.f209575b = arrayList;
        this.f209576c = m730Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sin0)) {
            return false;
        }
        sin0 sin0Var = (sin0) obj;
        return ybs.m93301b(this.f209574a, sin0Var.f209574a) && this.f209575b.equals(sin0Var.f209575b) && this.f209576c.equals(sin0Var.f209576c);
    }

    public final int hashCode() {
        return this.f209576c.hashCode() + lq51.m59700f(this.f209575b, Float.hashCode(this.f209574a) * 31, 31);
    }
}
