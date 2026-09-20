package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class qou0 implements uou0 {

    /* JADX INFO: renamed from: a */
    public final boolean f191040a;

    public qou0(boolean z) {
        this.f191040a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qou0) && this.f191040a == ((qou0) obj).f191040a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f191040a);
    }
}
