package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class cav implements iav {

    /* JADX INFO: renamed from: a */
    public final int f35936a;

    public cav(int i) {
        this.f35936a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cav) && this.f35936a == ((cav) obj).f35936a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f35936a);
    }
}
