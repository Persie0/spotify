package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class cs20 {

    /* JADX INFO: renamed from: a */
    public final float f41445a;

    /* JADX INFO: renamed from: b */
    public final float f41446b;

    /* JADX INFO: renamed from: c */
    public final float f41447c;

    public cs20(float f, float f2) {
        this.f41445a = f;
        this.f41446b = f2;
        this.f41447c = f / f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cs20)) {
            return false;
        }
        cs20 cs20Var = (cs20) obj;
        return Float.compare(this.f41445a, cs20Var.f41445a) == 0 && Float.compare(this.f41446b, cs20Var.f41446b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f41446b) + (Float.hashCode(this.f41445a) * 31);
    }
}
