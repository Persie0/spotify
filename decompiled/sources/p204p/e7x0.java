package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class e7x0 {

    /* JADX INFO: renamed from: a */
    public final i8b0 f57018a;

    /* JADX INFO: renamed from: b */
    public final i8b0 f57019b;

    public e7x0(i8b0 i8b0Var, i8b0 i8b0Var2) {
        this.f57018a = i8b0Var;
        this.f57019b = i8b0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e7x0)) {
            return false;
        }
        e7x0 e7x0Var = (e7x0) obj;
        return wj50.m88271j(this.f57018a, e7x0Var.f57018a) && wj50.m88271j(this.f57019b, e7x0Var.f57019b);
    }

    public final int hashCode() {
        return this.f57019b.hashCode() + (this.f57018a.hashCode() * 31);
    }
}
