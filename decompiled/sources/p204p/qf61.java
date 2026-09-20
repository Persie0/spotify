package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class qf61 {

    /* JADX INFO: renamed from: a */
    public final boolean f188131a;

    public qf61(boolean z) {
        this.f188131a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qf61) && this.f188131a == ((qf61) obj).f188131a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f188131a);
    }
}
