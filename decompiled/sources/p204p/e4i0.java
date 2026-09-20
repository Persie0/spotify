package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class e4i0 {

    /* JADX INFO: renamed from: a */
    public final int f56101a;

    /* JADX INFO: renamed from: b */
    public final int f56102b;

    /* JADX INFO: renamed from: c */
    public final float f56103c;

    public e4i0(int i, int i2, float f) {
        this.f56101a = i;
        this.f56102b = i2;
        this.f56103c = f;
    }

    /* JADX INFO: renamed from: a */
    public static e4i0 m37779a(int i) {
        int i2 = (i >> 13) & 7;
        if (i2 == 0) {
            return null;
        }
        return new e4i0(i2, (i >> 10) & 7, ((i & 511) * ((i & 512) != 0 ? -1 : 1)) / 10.0f);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e4i0)) {
            return false;
        }
        e4i0 e4i0Var = (e4i0) obj;
        return this.f56101a == e4i0Var.f56101a && this.f56102b == e4i0Var.f56102b && Float.compare(this.f56103c, e4i0Var.f56103c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f56103c) + (((this.f56101a * 31) + this.f56102b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GainField{name=");
        sb.append(this.f56101a);
        sb.append(", originator=");
        sb.append(this.f56102b);
        sb.append(", gain=");
        return ms2.m62684i(sb, this.f56103c, '}');
    }
}
