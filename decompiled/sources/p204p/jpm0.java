package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class jpm0 {

    /* JADX INFO: renamed from: a */
    public final int f114691a;

    /* JADX INFO: renamed from: b */
    public final int f114692b;

    /* JADX INFO: renamed from: c */
    public final int f114693c;

    /* JADX INFO: renamed from: d */
    public final int f114694d;

    public jpm0(int i, int i2, int i3, int i4) {
        this.f114691a = i;
        this.f114692b = i2;
        this.f114693c = i3;
        this.f114694d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpm0)) {
            return false;
        }
        jpm0 jpm0Var = (jpm0) obj;
        return this.f114691a == jpm0Var.f114691a && this.f114692b == jpm0Var.f114692b && this.f114693c == jpm0Var.f114693c && this.f114694d == jpm0Var.f114694d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f114694d) + mt60.m62800g(this.f114693c, mt60.m62800g(this.f114692b, Integer.hashCode(this.f114691a) * 31, 31), 31);
    }
}
