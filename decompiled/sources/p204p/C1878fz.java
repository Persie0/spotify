package p204p;

/* JADX INFO: renamed from: p.fz */
/* JADX INFO: loaded from: classes8.dex */
public final class C1878fz implements j10 {

    /* JADX INFO: renamed from: a */
    public final float f74876a;

    public C1878fz(float f) {
        this.f74876a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1878fz) && Float.compare(this.f74876a, ((C1878fz) obj).f74876a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f74876a);
    }
}
