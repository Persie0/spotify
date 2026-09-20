package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class rcn0 extends ucn0 {

    /* JADX INFO: renamed from: c */
    public final float f197899c;

    /* JADX INFO: renamed from: d */
    public final float f197900d;

    public rcn0(float f, float f2) {
        super(1);
        this.f197899c = f;
        this.f197900d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rcn0)) {
            return false;
        }
        rcn0 rcn0Var = (rcn0) obj;
        return Float.compare(this.f197899c, rcn0Var.f197899c) == 0 && Float.compare(this.f197900d, rcn0Var.f197900d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f197900d) + (Float.hashCode(this.f197899c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb.append(this.f197899c);
        sb.append(", dy=");
        return ms2.m62684i(sb, this.f197900d, ')');
    }
}
