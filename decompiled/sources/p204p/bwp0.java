package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class bwp0 {

    /* JADX INFO: renamed from: a */
    public final int f31686a;

    public bwp0(int i) {
        this.f31686a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bwp0) && this.f31686a == ((bwp0) obj).f31686a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31686a);
    }
}
