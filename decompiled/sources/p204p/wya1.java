package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class wya1 {

    /* JADX INFO: renamed from: a */
    public final xam f256246a;

    /* JADX INFO: renamed from: b */
    public final String f256247b;

    public wya1(xam xamVar, String str) {
        this.f256246a = xamVar;
        this.f256247b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wya1)) {
            return false;
        }
        wya1 wya1Var = (wya1) obj;
        return wj50.m88271j(this.f256246a, wya1Var.f256246a) && wj50.m88271j(this.f256247b, wya1Var.f256247b);
    }

    public final int hashCode() {
        int iHashCode = this.f256246a.hashCode() * 31;
        String str = this.f256247b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
