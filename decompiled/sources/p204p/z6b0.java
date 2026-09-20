package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class z6b0 extends t7b0 {

    /* JADX INFO: renamed from: a */
    public final boolean f279820a;

    public z6b0(boolean z) {
        this.f279820a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z6b0) && this.f279820a == ((z6b0) obj).f279820a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f279820a);
    }
}
