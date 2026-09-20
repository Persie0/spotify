package p204p;

/* JADX INFO: renamed from: p.mz */
/* JADX INFO: loaded from: classes8.dex */
public final class C2145mz implements k10 {

    /* JADX INFO: renamed from: a */
    public final float f148569a;

    public C2145mz(float f) {
        this.f148569a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2145mz) && Float.compare(this.f148569a, ((C2145mz) obj).f148569a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f148569a);
    }
}
