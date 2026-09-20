package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class yd6 {

    /* JADX INFO: renamed from: a */
    public final zzb f271687a;

    /* JADX INFO: renamed from: b */
    public final int f271688b;

    /* JADX INFO: renamed from: c */
    public final AbstractC1961i f271689c;

    /* JADX INFO: renamed from: d */
    public final boolean f271690d;

    public yd6(zzb zzbVar, int i, AbstractC1961i abstractC1961i, boolean z) {
        this.f271687a = zzbVar;
        this.f271688b = i;
        this.f271689c = abstractC1961i;
        this.f271690d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd6)) {
            return false;
        }
        yd6 yd6Var = (yd6) obj;
        return wj50.m88271j(this.f271687a, yd6Var.f271687a) && this.f271688b == yd6Var.f271688b && wj50.m88271j(this.f271689c, yd6Var.f271689c) && this.f271690d == yd6Var.f271690d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f271690d) + ((this.f271689c.hashCode() + mt60.m62800g(this.f271688b, this.f271687a.hashCode() * 31, 31)) * 31);
    }
}
