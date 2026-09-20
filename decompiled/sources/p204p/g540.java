package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class g540 {

    /* JADX INFO: renamed from: a */
    public final Object f76585a;

    /* JADX INFO: renamed from: b */
    public final int f76586b;

    public g540(int i, List list) {
        this.f76585a = list;
        this.f76586b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g540)) {
            return false;
        }
        g540 g540Var = (g540) obj;
        return this.f76585a.equals(g540Var.f76585a) && this.f76586b == g540Var.f76586b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f76586b) + (this.f76585a.hashCode() * 31);
    }
}
