package p204p;

/* JADX INFO: renamed from: p.uz */
/* JADX INFO: loaded from: classes7.dex */
public final class C2476uz implements h10 {

    /* JADX INFO: renamed from: a */
    public final boolean f235396a;

    public C2476uz(boolean z) {
        this.f235396a = z;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m84277a() {
        return this.f235396a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2476uz) && this.f235396a == ((C2476uz) obj).f235396a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f235396a);
    }
}
