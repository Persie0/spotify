package p204p;

/* JADX INFO: renamed from: p.kz */
/* JADX INFO: loaded from: classes8.dex */
public final class C2071kz implements k10 {

    /* JADX INFO: renamed from: a */
    public final float f127957a;

    public C2071kz(float f) {
        this.f127957a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2071kz) && Float.compare(this.f127957a, ((C2071kz) obj).f127957a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f127957a);
    }
}
