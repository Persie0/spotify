package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class gg8 {

    /* JADX INFO: renamed from: a */
    public final int f79567a;

    /* JADX INFO: renamed from: b */
    public final fg8 f79568b;

    public gg8(int i, fg8 fg8Var) {
        this.f79567a = i;
        this.f79568b = fg8Var;
    }

    /* JADX INFO: renamed from: a */
    public final int m44661a() {
        return this.f79567a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gg8)) {
            return false;
        }
        gg8 gg8Var = (gg8) obj;
        return this.f79567a == gg8Var.f79567a && this.f79568b == gg8Var.f79568b;
    }

    public final int hashCode() {
        return this.f79568b.hashCode() + (Integer.hashCode(this.f79567a) * 31);
    }
}
