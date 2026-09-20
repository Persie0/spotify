package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ovi {

    /* JADX INFO: renamed from: a */
    public final String f170508a;

    /* JADX INFO: renamed from: b */
    public final qe70 f170509b;

    /* JADX INFO: renamed from: c */
    public final qe70 f170510c;

    /* JADX WARN: Multi-variable type inference failed */
    public ovi(String str, gh00 gh00Var, th00 th00Var) {
        this.f170508a = str;
        this.f170509b = (qe70) gh00Var;
        this.f170510c = (qe70) th00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ovi)) {
            return false;
        }
        ovi oviVar = (ovi) obj;
        return wj50.m88271j(this.f170508a, oviVar.f170508a) && this.f170509b.equals(oviVar.f170509b) && this.f170510c.equals(oviVar.f170510c);
    }

    public final int hashCode() {
        return this.f170510c.hashCode() + ((this.f170509b.hashCode() + (this.f170508a.hashCode() * 31)) * 31);
    }
}
