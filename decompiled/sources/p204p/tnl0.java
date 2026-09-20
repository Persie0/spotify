package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class tnl0 {

    /* JADX INFO: renamed from: a */
    public final int f222001a;

    public tnl0(int i) {
        this.f222001a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tnl0) && this.f222001a == ((tnl0) obj).f222001a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f222001a);
    }
}
