package p204p;

/* JADX INFO: renamed from: p.ro */
/* JADX INFO: loaded from: classes7.dex */
public final class C2345ro implements InterfaceC2582xo {

    /* JADX INFO: renamed from: a */
    public final boolean f201028a;

    public C2345ro(boolean z) {
        this.f201028a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2345ro) && this.f201028a == ((C2345ro) obj).f201028a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f201028a);
    }
}
