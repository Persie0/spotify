package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class cdd implements qdd {

    /* JADX INFO: renamed from: a */
    public final ocl0 f36869a;

    /* JADX INFO: renamed from: b */
    public final String f36870b;

    public cdd(ocl0 ocl0Var, String str) {
        this.f36869a = ocl0Var;
        this.f36870b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdd)) {
            return false;
        }
        cdd cddVar = (cdd) obj;
        return wj50.m88271j(this.f36869a, cddVar.f36869a) && wj50.m88271j(this.f36870b, cddVar.f36870b);
    }

    public final int hashCode() {
        return this.f36870b.hashCode() + (this.f36869a.hashCode() * 31);
    }
}
