package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class g8e1 extends u8e1 {

    /* JADX INFO: renamed from: a */
    public final boolean f77471a;

    public g8e1(boolean z) {
        this.f77471a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g8e1) && this.f77471a == ((g8e1) obj).f77471a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f77471a);
    }
}
