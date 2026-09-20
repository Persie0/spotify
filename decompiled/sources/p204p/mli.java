package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class mli implements sli {

    /* JADX INFO: renamed from: a */
    public final dp11 f144849a;

    /* JADX INFO: renamed from: b */
    public final int f144850b;

    public mli(dp11 dp11Var, int i) {
        this.f144849a = dp11Var;
        this.f144850b = i;
    }

    /* JADX INFO: renamed from: a */
    public final dp11 m62234a() {
        return this.f144849a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mli)) {
            return false;
        }
        mli mliVar = (mli) obj;
        return wj50.m88271j(this.f144849a, mliVar.f144849a) && this.f144850b == mliVar.f144850b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f144850b) + (this.f144849a.hashCode() * 31);
    }
}
