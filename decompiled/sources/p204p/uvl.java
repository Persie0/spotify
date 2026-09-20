package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class uvl implements vvl {

    /* JADX INFO: renamed from: a */
    public final int f234465a;

    public uvl(int i) {
        this.f234465a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uvl) && this.f234465a == ((uvl) obj).f234465a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f234465a);
    }
}
