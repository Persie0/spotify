package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ke00 {

    /* JADX INFO: renamed from: a */
    public final float f121761a;

    /* JADX INFO: renamed from: b */
    public final float f121762b;

    public ke00(float f, float f2) {
        this.f121761a = f;
        this.f121762b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ke00)) {
            return false;
        }
        ke00 ke00Var = (ke00) obj;
        return ybs.m93301b(this.f121761a, ke00Var.f121761a) && Float.compare(this.f121762b, ke00Var.f121762b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f121762b) + (Float.hashCode(this.f121761a) * 31);
    }
}
