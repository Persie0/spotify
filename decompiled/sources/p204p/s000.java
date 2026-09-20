package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class s000 implements oi0 {

    /* JADX INFO: renamed from: a */
    public final int f204277a;

    public s000(int i) {
        this.f204277a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s000) && this.f204277a == ((s000) obj).f204277a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f204277a);
    }
}
