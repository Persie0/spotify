package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class uin0 implements vin0 {

    /* JADX INFO: renamed from: a */
    public final float f230738a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f230739b;

    /* JADX INFO: renamed from: c */
    public final m730 f230740c;

    public uin0(float f, ArrayList arrayList, m730 m730Var) {
        this.f230738a = f;
        this.f230739b = arrayList;
        this.f230740c = m730Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uin0)) {
            return false;
        }
        uin0 uin0Var = (uin0) obj;
        return ybs.m93301b(this.f230738a, uin0Var.f230738a) && this.f230739b.equals(uin0Var.f230739b) && this.f230740c.equals(uin0Var.f230740c);
    }

    public final int hashCode() {
        return this.f230740c.hashCode() + lq51.m59700f(this.f230739b, Float.hashCode(this.f230738a) * 31, 31);
    }
}
