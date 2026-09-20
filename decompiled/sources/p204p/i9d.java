package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class i9d implements lad {

    /* JADX INFO: renamed from: a */
    public final String f99987a;

    /* JADX INFO: renamed from: b */
    public final z650 f99988b;

    public i9d(String str, z650 z650Var) {
        this.f99987a = str;
        this.f99988b = z650Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9d)) {
            return false;
        }
        i9d i9dVar = (i9d) obj;
        return wj50.m88271j(this.f99987a, i9dVar.f99987a) && wj50.m88271j(this.f99988b, i9dVar.f99988b);
    }

    public final int hashCode() {
        int iHashCode = this.f99987a.hashCode() * 31;
        z650 z650Var = this.f99988b;
        return iHashCode + (z650Var == null ? 0 : z650Var.f279709a.hashCode());
    }
}
