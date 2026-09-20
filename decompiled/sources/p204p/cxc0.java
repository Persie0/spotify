package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class cxc0 implements rxc0 {

    /* JADX INFO: renamed from: a */
    public final boolean f42978a;

    public cxc0(boolean z) {
        this.f42978a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cxc0) && this.f42978a == ((cxc0) obj).f42978a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f42978a);
    }
}
