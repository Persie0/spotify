package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class j701 {

    /* JADX INFO: renamed from: a */
    public final qe70 f109457a;

    /* JADX INFO: renamed from: b */
    public final qe70 f109458b;

    /* JADX INFO: renamed from: c */
    public final qe70 f109459c;

    /* JADX WARN: Multi-variable type inference failed */
    public j701(gh00 gh00Var, gh00 gh00Var2, gh00 gh00Var3) {
        this.f109457a = (qe70) gh00Var;
        this.f109458b = (qe70) gh00Var2;
        this.f109459c = (qe70) gh00Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j701)) {
            return false;
        }
        j701 j701Var = (j701) obj;
        return this.f109457a.equals(j701Var.f109457a) && this.f109458b.equals(j701Var.f109458b) && this.f109459c.equals(j701Var.f109459c);
    }

    public final int hashCode() {
        return this.f109459c.hashCode() + ((this.f109458b.hashCode() + (this.f109457a.hashCode() * 31)) * 31);
    }
}
