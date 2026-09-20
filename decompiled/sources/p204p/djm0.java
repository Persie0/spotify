package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class djm0 implements dkm0, fkm0 {

    /* JADX INFO: renamed from: a */
    public final String f49705a;

    /* JADX INFO: renamed from: b */
    public final gkm0 f49706b;

    public djm0(String str, gkm0 gkm0Var) {
        this.f49705a = str;
        this.f49706b = gkm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djm0)) {
            return false;
        }
        djm0 djm0Var = (djm0) obj;
        return wj50.m88271j(this.f49705a, djm0Var.f49705a) && wj50.m88271j(this.f49706b, djm0Var.f49706b);
    }

    public final int hashCode() {
        return this.f49706b.hashCode() + (this.f49705a.hashCode() * 31);
    }
}
