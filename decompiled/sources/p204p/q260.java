package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class q260 {

    /* JADX INFO: renamed from: a */
    public final int f184506a;

    /* JADX INFO: renamed from: b */
    public final List f184507b;

    public q260(int i, ro80 ro80Var) {
        this.f184506a = i;
        this.f184507b = ro80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q260)) {
            return false;
        }
        q260 q260Var = (q260) obj;
        return this.f184506a == q260Var.f184506a && wj50.m88271j(this.f184507b, q260Var.f184507b);
    }

    public final int hashCode() {
        return this.f184507b.hashCode() + (Integer.hashCode(this.f184506a) * 31);
    }
}
