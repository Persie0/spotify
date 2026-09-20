package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gh11 implements ih11 {

    /* JADX INFO: renamed from: a */
    public final boolean f79786a;

    public gh11(boolean z) {
        this.f79786a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gh11) && this.f79786a == ((gh11) obj).f79786a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f79786a);
    }
}
