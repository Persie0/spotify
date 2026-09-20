package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class twp0 {

    /* JADX INFO: renamed from: a */
    public final int f224462a;

    /* JADX INFO: renamed from: b */
    public final rwp0 f224463b;

    public twp0(int i, rwp0 rwp0Var) {
        this.f224462a = i;
        this.f224463b = rwp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof twp0)) {
            return false;
        }
        twp0 twp0Var = (twp0) obj;
        return this.f224462a == twp0Var.f224462a && wj50.m88271j(this.f224463b, twp0Var.f224463b);
    }

    public final int hashCode() {
        return this.f224463b.hashCode() + (Integer.hashCode(this.f224462a) * 31);
    }
}
