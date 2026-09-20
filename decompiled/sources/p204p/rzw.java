package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class rzw implements s2x {

    /* JADX INFO: renamed from: a */
    public final boolean f204245a;

    public rzw(boolean z) {
        this.f204245a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rzw) && this.f204245a == ((rzw) obj).f204245a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f204245a);
    }
}
