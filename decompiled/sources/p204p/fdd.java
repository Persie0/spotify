package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class fdd implements qdd {

    /* JADX INFO: renamed from: a */
    public final String f68472a;

    /* JADX INFO: renamed from: b */
    public final xcl0 f68473b;

    public fdd(String str, xcl0 xcl0Var) {
        this.f68472a = str;
        this.f68473b = xcl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fdd)) {
            return false;
        }
        fdd fddVar = (fdd) obj;
        return wj50.m88271j(this.f68472a, fddVar.f68472a) && wj50.m88271j(this.f68473b, fddVar.f68473b);
    }

    public final int hashCode() {
        return this.f68473b.hashCode() + (this.f68472a.hashCode() * 31);
    }
}
