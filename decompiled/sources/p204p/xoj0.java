package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class xoj0 {

    /* JADX INFO: renamed from: a */
    public final float f264291a;

    /* JADX INFO: renamed from: b */
    public final float f264292b;

    public xoj0(float f, float f2) {
        this.f264291a = f;
        this.f264292b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xoj0)) {
            return false;
        }
        xoj0 xoj0Var = (xoj0) obj;
        return ybs.m93301b(this.f264291a, xoj0Var.f264291a) && ybs.m93301b(this.f264292b, xoj0Var.f264292b);
    }

    public final int hashCode() {
        return Float.hashCode(this.f264292b) + (Float.hashCode(this.f264291a) * 31);
    }
}
