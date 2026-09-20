package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ncn0 extends ucn0 {

    /* JADX INFO: renamed from: c */
    public final float f152562c;

    /* JADX INFO: renamed from: d */
    public final float f152563d;

    public ncn0(float f, float f2) {
        super(3);
        this.f152562c = f;
        this.f152563d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ncn0)) {
            return false;
        }
        ncn0 ncn0Var = (ncn0) obj;
        return Float.compare(this.f152562c, ncn0Var.f152562c) == 0 && Float.compare(this.f152563d, ncn0Var.f152563d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f152563d) + (Float.hashCode(this.f152562c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeLineTo(dx=");
        sb.append(this.f152562c);
        sb.append(", dy=");
        return ms2.m62684i(sb, this.f152563d, ')');
    }
}
