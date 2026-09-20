package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class ey80 {

    /* JADX INFO: renamed from: a */
    public final int f63988a;

    /* JADX INFO: renamed from: b */
    public final List f63989b;

    public ey80(int i, List list) {
        this.f63988a = i;
        this.f63989b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey80)) {
            return false;
        }
        ey80 ey80Var = (ey80) obj;
        return this.f63988a == ey80Var.f63988a && wj50.m88271j(this.f63989b, ey80Var.f63989b);
    }

    public final int hashCode() {
        return this.f63989b.hashCode() + (Integer.hashCode(this.f63988a) * 31);
    }
}
