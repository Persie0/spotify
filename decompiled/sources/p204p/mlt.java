package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class mlt implements nmt {

    /* JADX INFO: renamed from: a */
    public final wb41 f144919a;

    public mlt(wb41 wb41Var) {
        this.f144919a = wb41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mlt) && this.f144919a == ((mlt) obj).f144919a;
    }

    public final int hashCode() {
        wb41 wb41Var = this.f144919a;
        if (wb41Var == null) {
            return 0;
        }
        return wb41Var.hashCode();
    }
}
