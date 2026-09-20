package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class fcn0 extends ucn0 {

    /* JADX INFO: renamed from: c */
    public final float f68160c;

    /* JADX INFO: renamed from: d */
    public final float f68161d;

    public fcn0(float f, float f2) {
        super(3);
        this.f68160c = f;
        this.f68161d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fcn0)) {
            return false;
        }
        fcn0 fcn0Var = (fcn0) obj;
        return Float.compare(this.f68160c, fcn0Var.f68160c) == 0 && Float.compare(this.f68161d, fcn0Var.f68161d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f68161d) + (Float.hashCode(this.f68160c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineTo(x=");
        sb.append(this.f68160c);
        sb.append(", y=");
        return ms2.m62684i(sb, this.f68161d, ')');
    }
}
