package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ml90 extends nl90 {

    /* JADX INFO: renamed from: a */
    public final boolean f144778a;

    public ml90(boolean z) {
        this.f144778a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ml90) && this.f144778a == ((ml90) obj).f144778a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f144778a);
    }
}
