package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class k7e0 extends m7e0 {

    /* JADX INFO: renamed from: a */
    public final boolean f120076a;

    public k7e0(boolean z) {
        this.f120076a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k7e0) && this.f120076a == ((k7e0) obj).f120076a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f120076a);
    }
}
