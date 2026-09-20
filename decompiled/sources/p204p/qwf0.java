package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qwf0 implements cxf0 {

    /* JADX INFO: renamed from: a */
    public final int f193338a;

    public qwf0(int i) {
        this.f193338a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qwf0) && this.f193338a == ((qwf0) obj).f193338a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f193338a);
    }
}
