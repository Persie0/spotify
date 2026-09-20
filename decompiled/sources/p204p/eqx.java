package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class eqx {

    /* JADX INFO: renamed from: a */
    public final boolean f61973a;

    /* JADX INFO: renamed from: b */
    public final int f61974b;

    public eqx(boolean z, int i) {
        this.f61973a = z;
        this.f61974b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqx)) {
            return false;
        }
        eqx eqxVar = (eqx) obj;
        return this.f61973a == eqxVar.f61973a && this.f61974b == eqxVar.f61974b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f61974b) + (Boolean.hashCode(this.f61973a) * 31);
    }
}
