package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class dpt0 extends vpt0 {

    /* JADX INFO: renamed from: a */
    public final boolean f51744a;

    public dpt0(boolean z) {
        this.f51744a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dpt0) && this.f51744a == ((dpt0) obj).f51744a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f51744a);
    }
}
