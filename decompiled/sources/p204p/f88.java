package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class f88 {

    /* JADX INFO: renamed from: a */
    public final int f66881a;

    /* JADX INFO: renamed from: b */
    public final boolean f66882b;

    public f88(int i, boolean z) {
        this.f66881a = i;
        this.f66882b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f88)) {
            return false;
        }
        f88 f88Var = (f88) obj;
        return this.f66881a == f88Var.f66881a && this.f66882b == f88Var.f66882b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f66882b) + (Integer.hashCode(this.f66881a) * 31);
    }
}
