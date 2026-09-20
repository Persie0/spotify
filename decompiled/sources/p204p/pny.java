package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class pny implements hoy {

    /* JADX INFO: renamed from: a */
    public final boolean f179542a;

    /* JADX INFO: renamed from: b */
    public final String f179543b;

    public pny(boolean z, String str) {
        this.f179542a = z;
        this.f179543b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pny)) {
            return false;
        }
        pny pnyVar = (pny) obj;
        return this.f179542a == pnyVar.f179542a && wj50.m88271j(this.f179543b, pnyVar.f179543b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f179542a) * 31;
        String str = this.f179543b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
