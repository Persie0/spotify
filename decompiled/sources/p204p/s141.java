package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class s141 implements a241 {

    /* JADX INFO: renamed from: a */
    public final float f204595a;

    public s141(float f) {
        this.f204595a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s141) && Float.compare(this.f204595a, ((s141) obj).f204595a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f204595a);
    }
}
