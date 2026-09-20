package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class eid0 implements iid0 {

    /* JADX INFO: renamed from: a */
    public final boolean f59855a;

    public eid0(boolean z) {
        this.f59855a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eid0) && this.f59855a == ((eid0) obj).f59855a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f59855a);
    }
}
