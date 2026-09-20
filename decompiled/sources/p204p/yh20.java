package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class yh20 {

    /* JADX INFO: renamed from: a */
    public final boolean f272716a;

    /* JADX INFO: renamed from: b */
    public final qe70 f272717b;

    /* JADX WARN: Multi-variable type inference failed */
    public yh20(boolean z, th00 th00Var) {
        this.f272716a = z;
        this.f272717b = (qe70) th00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yh20)) {
            return false;
        }
        yh20 yh20Var = (yh20) obj;
        return this.f272716a == yh20Var.f272716a && this.f272717b.equals(yh20Var.f272717b);
    }

    public final int hashCode() {
        return this.f272717b.hashCode() + (Boolean.hashCode(this.f272716a) * 31);
    }
}
