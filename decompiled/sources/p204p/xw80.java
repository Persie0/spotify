package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class xw80 {

    /* JADX INFO: renamed from: a */
    public final l590 f266613a;

    /* JADX INFO: renamed from: b */
    public final Object f266614b;

    public xw80(l590 l590Var, List list) {
        this.f266613a = l590Var;
        this.f266614b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xw80)) {
            return false;
        }
        xw80 xw80Var = (xw80) obj;
        return this.f266613a.equals(xw80Var.f266613a) && this.f266614b.equals(xw80Var.f266614b);
    }

    public final int hashCode() {
        return this.f266614b.hashCode() + (this.f266613a.hashCode() * 31);
    }
}
