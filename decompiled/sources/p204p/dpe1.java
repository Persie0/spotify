package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class dpe1 {

    /* JADX INFO: renamed from: a */
    public final boolean f51317a;

    public dpe1(boolean z) {
        this.f51317a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dpe1) && this.f51317a == ((dpe1) obj).f51317a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f51317a);
    }
}
