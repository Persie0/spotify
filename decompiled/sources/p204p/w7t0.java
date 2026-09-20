package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class w7t0 implements x7t0 {

    /* JADX INFO: renamed from: a */
    public final int f248781a;

    /* JADX INFO: renamed from: b */
    public final int f248782b;

    /* JADX INFO: renamed from: c */
    public final int f248783c;

    public w7t0(int i, int i2, int i3) {
        this.f248781a = i;
        this.f248782b = i2;
        this.f248783c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7t0)) {
            return false;
        }
        w7t0 w7t0Var = (w7t0) obj;
        return this.f248781a == w7t0Var.f248781a && this.f248782b == w7t0Var.f248782b && this.f248783c == w7t0Var.f248783c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f248783c) + mt60.m62800g(this.f248782b, Integer.hashCode(this.f248781a) * 31, 31);
    }
}
