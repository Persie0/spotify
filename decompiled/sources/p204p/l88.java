package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class l88 implements n88 {

    /* JADX INFO: renamed from: a */
    public final int f130820a;

    /* JADX INFO: renamed from: b */
    public final boolean f130821b;

    public l88(int i, boolean z) {
        this.f130820a = i;
        this.f130821b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l88)) {
            return false;
        }
        l88 l88Var = (l88) obj;
        return this.f130820a == l88Var.f130820a && this.f130821b == l88Var.f130821b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f130821b) + (Integer.hashCode(this.f130820a) * 31);
    }
}
