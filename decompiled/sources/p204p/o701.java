package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class o701 {

    /* JADX INFO: renamed from: a */
    public final tsl f162445a;

    /* JADX INFO: renamed from: b */
    public final x10 f162446b;

    public o701(tsl tslVar, x10 x10Var) {
        this.f162445a = tslVar;
        this.f162446b = x10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o701)) {
            return false;
        }
        o701 o701Var = (o701) obj;
        if (!this.f162445a.equals(o701Var.f162445a) || !this.f162446b.equals(o701Var.f162446b)) {
            return false;
        }
        Object obj2 = gxz0.f85380Z0;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return gxz0.f85380Z0.hashCode() + ((this.f162446b.hashCode() + (this.f162445a.hashCode() * 31)) * 31);
    }
}
