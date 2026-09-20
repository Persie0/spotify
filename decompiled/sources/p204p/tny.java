package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class tny implements hoy {

    /* JADX INFO: renamed from: a */
    public final boolean f222105a;

    public tny(boolean z) {
        this.f222105a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tny) && this.f222105a == ((tny) obj).f222105a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f222105a);
    }
}
