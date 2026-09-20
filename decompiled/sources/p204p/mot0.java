package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class mot0 extends vpt0 {

    /* JADX INFO: renamed from: a */
    public final boolean f145740a;

    /* JADX INFO: renamed from: b */
    public final Object f145741b;

    /* JADX INFO: renamed from: c */
    public final boolean f145742c;

    public mot0(List list, boolean z, boolean z2) {
        this.f145740a = z;
        this.f145741b = list;
        this.f145742c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mot0)) {
            return false;
        }
        mot0 mot0Var = (mot0) obj;
        return this.f145740a == mot0Var.f145740a && this.f145741b.equals(mot0Var.f145741b) && this.f145742c == mot0Var.f145742c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f145742c) + dq60.m36604d(Boolean.hashCode(this.f145740a) * 31, 31, this.f145741b);
    }
}
