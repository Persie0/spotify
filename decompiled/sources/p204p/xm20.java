package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class xm20 implements ym20 {

    /* JADX INFO: renamed from: a */
    public final e55 f263277a;

    public xm20(e55 e55Var) {
        this.f263277a = e55Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xm20) && this.f263277a.equals(((xm20) obj).f263277a);
    }

    public final int hashCode() {
        return this.f263277a.hashCode();
    }
}
