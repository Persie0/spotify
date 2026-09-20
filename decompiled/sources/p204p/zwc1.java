package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class zwc1 implements axc1 {

    /* JADX INFO: renamed from: a */
    public final double f286960a;

    /* JADX INFO: renamed from: b */
    public final boolean f286961b;

    public zwc1(double d, boolean z) {
        this.f286960a = d;
        this.f286961b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zwc1)) {
            return false;
        }
        zwc1 zwc1Var = (zwc1) obj;
        return Double.compare(this.f286960a, zwc1Var.f286960a) == 0 && this.f286961b == zwc1Var.f286961b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f286961b) + (Double.hashCode(this.f286960a) * 31);
    }
}
