package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class re61 implements te61 {

    /* JADX INFO: renamed from: a */
    public final qe70 f198295a;

    /* JADX INFO: renamed from: b */
    public final qe70 f198296b;

    /* JADX WARN: Multi-variable type inference failed */
    public re61(eh00 eh00Var, vh00 vh00Var) {
        this.f198295a = (qe70) eh00Var;
        this.f198296b = (qe70) vh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof re61)) {
            return false;
        }
        re61 re61Var = (re61) obj;
        return this.f198295a.equals(re61Var.f198295a) && this.f198296b.equals(re61Var.f198296b);
    }

    public final int hashCode() {
        return this.f198296b.hashCode() + (this.f198295a.hashCode() * 31);
    }
}
