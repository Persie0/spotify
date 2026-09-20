package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class o8c0 extends q8c0 {

    /* JADX INFO: renamed from: a */
    public final boolean f162773a;

    public o8c0(boolean z) {
        this.f162773a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o8c0) && this.f162773a == ((o8c0) obj).f162773a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f162773a);
    }
}
