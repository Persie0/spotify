package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class hvb extends kvb {

    /* JADX INFO: renamed from: a */
    public final String f95642a;

    /* JADX INFO: renamed from: b */
    public final String f95643b;

    public hvb(String str, String str2) {
        this.f95642a = str;
        this.f95643b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hvb)) {
            return false;
        }
        hvb hvbVar = (hvb) obj;
        return wj50.m88271j(this.f95642a, hvbVar.f95642a) && wj50.m88271j(this.f95643b, hvbVar.f95643b);
    }

    public final int hashCode() {
        return this.f95643b.hashCode() + (this.f95642a.hashCode() * 31);
    }
}
