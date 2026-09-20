package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ms80 implements os80 {

    /* JADX INFO: renamed from: a */
    public final ndl f146721a;

    public ms80(ndl ndlVar) {
        this.f146721a = ndlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ms80) && this.f146721a.equals(((ms80) obj).f146721a);
    }

    public final int hashCode() {
        return this.f146721a.f152799a.hashCode();
    }
}
