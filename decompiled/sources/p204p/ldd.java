package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ldd implements qdd {

    /* JADX INFO: renamed from: a */
    public final ocl0 f132142a;

    /* JADX INFO: renamed from: b */
    public final String f132143b;

    public ldd(ocl0 ocl0Var, String str) {
        this.f132142a = ocl0Var;
        this.f132143b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ldd)) {
            return false;
        }
        ldd lddVar = (ldd) obj;
        return wj50.m88271j(this.f132142a, lddVar.f132142a) && wj50.m88271j(this.f132143b, lddVar.f132143b);
    }

    public final int hashCode() {
        return this.f132143b.hashCode() + (this.f132142a.hashCode() * 31);
    }
}
