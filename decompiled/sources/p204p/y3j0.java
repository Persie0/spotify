package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class y3j0 {

    /* JADX INFO: renamed from: a */
    public final ri00 f268955a;

    /* JADX INFO: renamed from: b */
    public final qe70 f268956b;

    /* JADX INFO: renamed from: c */
    public final qe70 f268957c;

    /* JADX WARN: Multi-variable type inference failed */
    public y3j0(gh00 gh00Var, gh00 gh00Var2, th00 th00Var) {
        this.f268955a = (ri00) gh00Var;
        this.f268956b = (qe70) th00Var;
        this.f268957c = (qe70) gh00Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y3j0)) {
            return false;
        }
        y3j0 y3j0Var = (y3j0) obj;
        return this.f268955a.equals(y3j0Var.f268955a) && this.f268956b.equals(y3j0Var.f268956b) && this.f268957c.equals(y3j0Var.f268957c);
    }

    public final int hashCode() {
        return this.f268957c.hashCode() + ((this.f268956b.hashCode() + (this.f268955a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        try {
            return super.toString();
        } catch (Exception unused) {
            return "";
        }
    }
}
