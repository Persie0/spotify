package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class z4c1 {

    /* JADX INFO: renamed from: a */
    public final y4c1 f279206a;

    /* JADX INFO: renamed from: b */
    public final List f279207b;

    /* JADX INFO: renamed from: c */
    public final w4c1 f279208c;

    public z4c1(y4c1 y4c1Var, List list, w4c1 w4c1Var) {
        this.f279206a = y4c1Var;
        this.f279207b = list;
        this.f279208c = w4c1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4c1)) {
            return false;
        }
        z4c1 z4c1Var = (z4c1) obj;
        return this.f279206a == z4c1Var.f279206a && wj50.m88271j(this.f279207b, z4c1Var.f279207b) && wj50.m88271j(this.f279208c, z4c1Var.f279208c);
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(this.f279206a.hashCode() * 31, 31, this.f279207b);
        w4c1 w4c1Var = this.f279208c;
        return iM77244c + (w4c1Var == null ? 0 : w4c1Var.hashCode());
    }
}
