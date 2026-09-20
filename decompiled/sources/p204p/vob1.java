package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class vob1 extends wob1 {

    /* JADX INFO: renamed from: a */
    public final int f243448a;

    public vob1(int i) {
        this.f243448a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vob1) && this.f243448a == ((vob1) obj).f243448a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f243448a);
    }
}
