package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class fli implements sli {

    /* JADX INFO: renamed from: a */
    public final boolean f70775a;

    public fli(boolean z) {
        this.f70775a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fli) && this.f70775a == ((fli) obj).f70775a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f70775a);
    }
}
