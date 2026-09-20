package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class fai extends nai {

    /* JADX INFO: renamed from: a */
    public final boolean f67563a;

    public fai(boolean z) {
        this.f67563a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fai) && this.f67563a == ((fai) obj).f67563a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f67563a);
    }
}
