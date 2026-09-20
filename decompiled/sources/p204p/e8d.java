package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class e8d implements lad {

    /* JADX INFO: renamed from: a */
    public final String f57142a;

    /* JADX INFO: renamed from: b */
    public final z650 f57143b;

    public e8d(String str, z650 z650Var) {
        this.f57142a = str;
        this.f57143b = z650Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8d)) {
            return false;
        }
        e8d e8dVar = (e8d) obj;
        return wj50.m88271j(this.f57142a, e8dVar.f57142a) && wj50.m88271j(this.f57143b, e8dVar.f57143b);
    }

    public final int hashCode() {
        int iHashCode = this.f57142a.hashCode() * 31;
        z650 z650Var = this.f57143b;
        return iHashCode + (z650Var == null ? 0 : z650Var.f279709a.hashCode());
    }
}
