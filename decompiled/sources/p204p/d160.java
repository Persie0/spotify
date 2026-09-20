package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class d160 implements h160 {

    /* JADX INFO: renamed from: a */
    public final boolean f44170a;

    public d160(boolean z) {
        this.f44170a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d160) && this.f44170a == ((d160) obj).f44170a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f44170a);
    }
}
