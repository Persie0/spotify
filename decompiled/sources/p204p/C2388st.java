package p204p;

/* JADX INFO: renamed from: p.st */
/* JADX INFO: loaded from: classes4.dex */
public final class C2388st {

    /* JADX INFO: renamed from: a */
    public final boolean f213749a;

    public C2388st(boolean z) {
        this.f213749a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2388st) && this.f213749a == ((C2388st) obj).f213749a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f213749a);
    }
}
