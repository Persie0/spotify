package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ggw0 implements hgw0 {

    /* JADX INFO: renamed from: a */
    public final int f79762a;

    public ggw0(int i) {
        this.f79762a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ggw0) && this.f79762a == ((ggw0) obj).f79762a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f79762a);
    }
}
