package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class a7b0 extends t7b0 {

    /* JADX INFO: renamed from: a */
    public final boolean f13015a;

    public a7b0(boolean z) {
        this.f13015a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a7b0) && this.f13015a == ((a7b0) obj).f13015a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13015a);
    }
}
