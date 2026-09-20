package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class cu00 implements du00 {

    /* JADX INFO: renamed from: a */
    public final boolean f42010a;

    public cu00(boolean z) {
        this.f42010a = z;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m33854a() {
        return this.f42010a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cu00) && this.f42010a == ((cu00) obj).f42010a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f42010a);
    }
}
