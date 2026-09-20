package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class e7f {

    /* JADX INFO: renamed from: a */
    public final int f56927a;

    /* JADX INFO: renamed from: b */
    public final int f56928b;

    /* JADX INFO: renamed from: c */
    public final int f56929c;

    public e7f(int i, int i2, int i3) {
        this.f56927a = i;
        this.f56928b = i2;
        this.f56929c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e7f)) {
            return false;
        }
        e7f e7fVar = (e7f) obj;
        return this.f56927a == e7fVar.f56927a && this.f56928b == e7fVar.f56928b && this.f56929c == e7fVar.f56929c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f56929c) + mt60.m62800g(this.f56928b, Integer.hashCode(this.f56927a) * 31, 31);
    }
}
