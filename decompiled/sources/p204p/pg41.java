package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes.dex */
public final class pg41 implements w9z {

    /* JADX INFO: renamed from: a */
    public final float f177225a;

    /* JADX INFO: renamed from: b */
    public final float f177226b;

    /* JADX INFO: renamed from: c */
    public final Object f177227c;

    public pg41(float f, float f2, Object obj) {
        this.f177225a = f;
        this.f177226b = f2;
        this.f177227c = obj;
    }

    @Override // p204p.n05
    /* JADX INFO: renamed from: a */
    public final g5b1 mo31113a(tm91 tm91Var) {
        return new va91(this.f177225a, this.f177226b, jg31.m53266d(tm91Var, this.f177227c));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pg41) {
            pg41 pg41Var = (pg41) obj;
            if (pg41Var.f177225a == this.f177225a && pg41Var.f177226b == this.f177226b && wj50.m88271j(pg41Var.f177227c, this.f177227c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f177227c;
        return Float.hashCode(this.f177226b) + AbstractC0000a.m8g((obj != null ? obj.hashCode() : 0) * 31, 31, this.f177225a);
    }

    public /* synthetic */ pg41(Object obj, int i) {
        this(1.0f, 1500.0f, (i & 4) != 0 ? null : obj);
    }
}
