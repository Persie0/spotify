package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class xp51 {

    /* JADX INFO: renamed from: a */
    public final int f264509a;

    /* JADX INFO: renamed from: b */
    public final lnn0 f264510b;

    public xp51(int i, lnn0 lnn0Var) {
        this.f264509a = i;
        this.f264510b = lnn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xp51)) {
            return false;
        }
        xp51 xp51Var = (xp51) obj;
        return this.f264509a == xp51Var.f264509a && this.f264510b == xp51Var.f264510b;
    }

    public final int hashCode() {
        return this.f264510b.hashCode() + (Integer.hashCode(this.f264509a) * 31);
    }
}
