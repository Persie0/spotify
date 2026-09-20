package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class iur {

    /* JADX INFO: renamed from: a */
    public final mb61 f106021a;

    /* JADX INFO: renamed from: b */
    public final th00 f106022b;

    /* JADX WARN: Multi-variable type inference failed */
    public iur(th00 th00Var, th00 th00Var2) {
        this.f106021a = (mb61) th00Var;
        this.f106022b = th00Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iur)) {
            return false;
        }
        iur iurVar = (iur) obj;
        return wj50.m88271j(this.f106021a, iurVar.f106021a) && wj50.m88271j(this.f106022b, iurVar.f106022b);
    }

    public final int hashCode() {
        return this.f106022b.hashCode() + (this.f106021a.hashCode() * 31);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public iur(int i, th00 th00Var) {
        int i2 = 2;
        fbk fbkVar = null;
        this(new us4(i2, 7, fbkVar), (i & 2) != 0 ? new us4(i2, 8, fbkVar) : th00Var);
    }
}
