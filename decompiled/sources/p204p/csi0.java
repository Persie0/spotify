package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class csi0 implements dsi0 {

    /* JADX INFO: renamed from: a */
    public final boolean f41620a;

    public csi0(boolean z) {
        this.f41620a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof csi0) && this.f41620a == ((csi0) obj).f41620a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f41620a);
    }
}
