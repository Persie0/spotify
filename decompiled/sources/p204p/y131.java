package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class y131 {

    /* JADX INFO: renamed from: a */
    public final boolean f268167a;

    public y131(boolean z) {
        this.f268167a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y131) && this.f268167a == ((y131) obj).f268167a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f268167a);
    }
}
