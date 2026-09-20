package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class wb9 implements ob3 {

    /* JADX INFO: renamed from: a */
    public final float f249709a;

    /* JADX INFO: renamed from: b */
    public final float f249710b;

    public wb9(float f, float f2) {
        this.f249709a = f;
        this.f249710b = f2;
    }

    @Override // p204p.ob3
    /* JADX INFO: renamed from: a */
    public final long mo66602a(long j, long j2, ko70 ko70Var) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        ko70 ko70Var2 = ko70.f124556a;
        float f3 = this.f249709a;
        if (ko70Var != ko70Var2) {
            f3 *= -1;
        }
        float f4 = 1;
        float f5 = (f3 + f4) * f;
        return (((long) Math.round((f4 + this.f249710b) * f2)) & 4294967295L) | (((long) Math.round(f5)) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wb9)) {
            return false;
        }
        wb9 wb9Var = (wb9) obj;
        return Float.compare(this.f249709a, wb9Var.f249709a) == 0 && Float.compare(this.f249710b, wb9Var.f249710b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f249710b) + (Float.hashCode(this.f249709a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.f249709a);
        sb.append(", verticalBias=");
        return ms2.m62684i(sb, this.f249710b, ')');
    }
}
