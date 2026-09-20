package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qel0 implements sel0 {

    /* JADX INFO: renamed from: a */
    public final boolean f187969a;

    public qel0(boolean z) {
        this.f187969a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qel0) && this.f187969a == ((qel0) obj).f187969a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f187969a);
    }
}
