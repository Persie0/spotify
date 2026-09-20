package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class tam implements wam {

    /* JADX INFO: renamed from: b */
    public final qe70 f218631b;

    /* JADX INFO: renamed from: c */
    public final mb61 f218632c;

    /* JADX WARN: Multi-variable type inference failed */
    public tam(gh00 gh00Var, th00 th00Var) {
        this.f218631b = (qe70) gh00Var;
        this.f218632c = (mb61) th00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tam)) {
            return false;
        }
        tam tamVar = (tam) obj;
        return this.f218631b.equals(tamVar.f218631b) && this.f218632c.equals(tamVar.f218632c);
    }

    public final int hashCode() {
        return this.f218632c.hashCode() + (this.f218631b.hashCode() * 31);
    }
}
