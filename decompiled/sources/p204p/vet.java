package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class vet {

    /* JADX INFO: renamed from: a */
    public final boolean f240808a;

    public vet(boolean z) {
        this.f240808a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vet) && this.f240808a == ((vet) obj).f240808a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f240808a);
    }
}
