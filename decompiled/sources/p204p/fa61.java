package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class fa61 implements ia61 {

    /* JADX INFO: renamed from: a */
    public final int f67446a;

    /* JADX INFO: renamed from: b */
    public final int f67447b;

    public fa61(int i, int i2) {
        this.f67446a = i;
        this.f67447b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa61)) {
            return false;
        }
        fa61 fa61Var = (fa61) obj;
        return this.f67446a == fa61Var.f67446a && this.f67447b == fa61Var.f67447b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f67447b) + (Integer.hashCode(this.f67446a) * 31);
    }
}
