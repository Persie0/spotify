package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class vhr extends yhr {

    /* JADX INFO: renamed from: a */
    public final int f241551a;

    public vhr(int i) {
        this.f241551a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vhr) && this.f241551a == ((vhr) obj).f241551a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f241551a);
    }
}
