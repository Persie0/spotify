package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class s991 {

    /* JADX INFO: renamed from: a */
    public final boolean f206889a;

    public s991(boolean z) {
        this.f206889a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s991) && this.f206889a == ((s991) obj).f206889a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f206889a);
    }
}
