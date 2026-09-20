package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class dyf0 implements eyf0 {

    /* JADX INFO: renamed from: a */
    public final boolean f54333a;

    public dyf0(boolean z) {
        this.f54333a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dyf0) && this.f54333a == ((dyf0) obj).f54333a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f54333a);
    }
}
