package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class w060 implements x060 {

    /* JADX INFO: renamed from: a */
    public final boolean f246651a;

    /* JADX INFO: renamed from: b */
    public final boolean f246652b;

    public w060(boolean z, boolean z2) {
        this.f246651a = z;
        this.f246652b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w060)) {
            return false;
        }
        w060 w060Var = (w060) obj;
        return this.f246651a == w060Var.f246651a && this.f246652b == w060Var.f246652b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f246652b) + (Boolean.hashCode(this.f246651a) * 31);
    }
}
