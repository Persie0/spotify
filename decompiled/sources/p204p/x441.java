package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class x441 extends y441 {

    /* JADX INFO: renamed from: a */
    public final int f257986a;

    public x441(int i) {
        this.f257986a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x441) && this.f257986a == ((x441) obj).f257986a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f257986a);
    }
}
