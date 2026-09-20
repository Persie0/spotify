package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class aa81 {

    /* JADX INFO: renamed from: a */
    public final int f13791a;

    /* JADX INFO: renamed from: b */
    public final int f13792b;

    /* JADX INFO: renamed from: c */
    public final boolean f13793c;

    public aa81(int i, int i2, boolean z) {
        this.f13791a = i;
        this.f13792b = i2;
        this.f13793c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa81)) {
            return false;
        }
        aa81 aa81Var = (aa81) obj;
        return this.f13791a == aa81Var.f13791a && this.f13792b == aa81Var.f13792b && this.f13793c == aa81Var.f13793c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13793c) + mt60.m62800g(this.f13792b, Integer.hashCode(this.f13791a) * 31, 31);
    }
}
