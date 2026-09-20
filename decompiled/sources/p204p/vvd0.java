package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class vvd0 {

    /* JADX INFO: renamed from: a */
    public final boolean f245215a;

    public vvd0(boolean z) {
        this.f245215a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vvd0) && this.f245215a == ((vvd0) obj).f245215a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f245215a);
    }
}
