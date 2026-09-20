package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class o031 {

    /* JADX INFO: renamed from: a */
    public final int f160224a;

    /* JADX INFO: renamed from: b */
    public final yz21 f160225b;

    public o031(int i, yz21 yz21Var) {
        this.f160224a = i;
        this.f160225b = yz21Var;
    }

    /* JADX INFO: renamed from: a */
    public final yz21 m65974a() {
        return this.f160225b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o031)) {
            return false;
        }
        o031 o031Var = (o031) obj;
        return this.f160224a == o031Var.f160224a && wj50.m88271j(this.f160225b, o031Var.f160225b);
    }

    public final int hashCode() {
        return this.f160225b.hashCode() + (Integer.hashCode(this.f160224a) * 31);
    }
}
