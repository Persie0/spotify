package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class kll {

    /* JADX INFO: renamed from: a */
    public final pll f123921a;

    /* JADX INFO: renamed from: b */
    public final boolean f123922b;

    public kll(pll pllVar, boolean z) {
        this.f123921a = pllVar;
        this.f123922b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kll)) {
            return false;
        }
        kll kllVar = (kll) obj;
        return wj50.m88271j(this.f123921a, kllVar.f123921a) && this.f123922b == kllVar.f123922b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f123922b) + (this.f123921a.hashCode() * 31);
    }
}
