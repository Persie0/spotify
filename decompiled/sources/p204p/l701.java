package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class l701 {

    /* JADX INFO: renamed from: a */
    public final qe70 f130527a;

    /* JADX INFO: renamed from: b */
    public final qe70 f130528b;

    /* JADX INFO: renamed from: c */
    public final qe70 f130529c;

    /* JADX WARN: Multi-variable type inference failed */
    public l701(gh00 gh00Var, gh00 gh00Var2, gh00 gh00Var3) {
        this.f130527a = (qe70) gh00Var;
        this.f130528b = (qe70) gh00Var2;
        this.f130529c = (qe70) gh00Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l701)) {
            return false;
        }
        l701 l701Var = (l701) obj;
        return this.f130527a.equals(l701Var.f130527a) && this.f130528b.equals(l701Var.f130528b) && this.f130529c.equals(l701Var.f130529c);
    }

    public final int hashCode() {
        return this.f130529c.hashCode() + ((this.f130528b.hashCode() + (this.f130527a.hashCode() * 31)) * 31);
    }
}
