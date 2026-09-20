package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class zpi {

    /* JADX INFO: renamed from: a */
    public final boolean f285132a;

    /* JADX INFO: renamed from: b */
    public final gh00 f285133b;

    public zpi(gh00 gh00Var, boolean z) {
        this.f285132a = z;
        this.f285133b = gh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zpi)) {
            return false;
        }
        zpi zpiVar = (zpi) obj;
        return this.f285132a == zpiVar.f285132a && wj50.m88271j(this.f285133b, zpiVar.f285133b);
    }

    public final int hashCode() {
        return this.f285133b.hashCode() + (Boolean.hashCode(this.f285132a) * 31);
    }
}
