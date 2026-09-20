package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class c4d implements h5d {

    /* JADX INFO: renamed from: a */
    public final String f33923a;

    /* JADX INFO: renamed from: b */
    public final z650 f33924b;

    public c4d(String str, z650 z650Var) {
        this.f33923a = str;
        this.f33924b = z650Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4d)) {
            return false;
        }
        c4d c4dVar = (c4d) obj;
        return wj50.m88271j(this.f33923a, c4dVar.f33923a) && wj50.m88271j(this.f33924b, c4dVar.f33924b);
    }

    public final int hashCode() {
        int iHashCode = this.f33923a.hashCode() * 31;
        z650 z650Var = this.f33924b;
        return iHashCode + (z650Var == null ? 0 : z650Var.f279709a.hashCode());
    }
}
