package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class eij implements gij {

    /* JADX INFO: renamed from: a */
    public final int f59894a;

    public eij(int i) {
        this.f59894a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eij) && this.f59894a == ((eij) obj).f59894a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f59894a);
    }
}
