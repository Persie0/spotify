package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class vpe1 implements zpe1 {

    /* JADX INFO: renamed from: a */
    public final int f243678a;

    public vpe1(int i) {
        this.f243678a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vpe1) && this.f243678a == ((vpe1) obj).f243678a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f243678a);
    }
}
