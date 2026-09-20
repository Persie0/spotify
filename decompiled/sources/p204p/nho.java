package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class nho implements qho {

    /* JADX INFO: renamed from: a */
    public final ifo f154041a;

    public nho(ifo ifoVar) {
        this.f154041a = ifoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nho) && wj50.m88271j(this.f154041a, ((nho) obj).f154041a);
    }

    public final int hashCode() {
        return this.f154041a.hashCode();
    }
}
