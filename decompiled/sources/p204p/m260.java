package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class m260 {

    /* JADX INFO: renamed from: a */
    public final int f139233a;

    /* JADX INFO: renamed from: b */
    public final List f139234b;

    public m260(int i, ro80 ro80Var) {
        this.f139233a = i;
        this.f139234b = ro80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m260)) {
            return false;
        }
        m260 m260Var = (m260) obj;
        return this.f139233a == m260Var.f139233a && wj50.m88271j(this.f139234b, m260Var.f139234b);
    }

    public final int hashCode() {
        return this.f139234b.hashCode() + (Integer.hashCode(this.f139233a) * 31);
    }
}
