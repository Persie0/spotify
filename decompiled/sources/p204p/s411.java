package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class s411 extends v411 {

    /* JADX INFO: renamed from: a */
    public final int f205413a;

    public s411(int i) {
        this.f205413a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s411) && this.f205413a == ((s411) obj).f205413a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f205413a);
    }
}
