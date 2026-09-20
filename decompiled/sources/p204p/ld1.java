package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class ld1 {

    /* JADX INFO: renamed from: a */
    public final String f132023a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f132024b;

    /* JADX INFO: renamed from: c */
    public final w00 f132025c;

    public ld1(String str, ArrayList arrayList, w00 w00Var) {
        this.f132023a = str;
        this.f132024b = arrayList;
        this.f132025c = w00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ld1)) {
            return false;
        }
        ld1 ld1Var = (ld1) obj;
        return this.f132023a.equals(ld1Var.f132023a) && this.f132024b.equals(ld1Var.f132024b) && this.f132025c.equals(ld1Var.f132025c);
    }

    public final int hashCode() {
        return this.f132025c.hashCode() + lq51.m59700f(this.f132024b, this.f132023a.hashCode() * 31, 31);
    }
}
