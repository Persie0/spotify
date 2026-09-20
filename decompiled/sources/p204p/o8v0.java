package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class o8v0 {

    /* JADX INFO: renamed from: a */
    public final Object f162881a;

    /* JADX INFO: renamed from: b */
    public final int f162882b;

    public o8v0(int i, List list) {
        this.f162881a = list;
        this.f162882b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8v0)) {
            return false;
        }
        o8v0 o8v0Var = (o8v0) obj;
        return this.f162881a.equals(o8v0Var.f162881a) && this.f162882b == o8v0Var.f162882b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f162882b) + (this.f162881a.hashCode() * 31);
    }
}
