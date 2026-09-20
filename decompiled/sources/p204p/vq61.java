package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class vq61 extends yq61 {

    /* JADX INFO: renamed from: a */
    public final int f243883a;

    public vq61(int i) {
        this.f243883a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vq61) && this.f243883a == ((vq61) obj).f243883a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f243883a);
    }
}
