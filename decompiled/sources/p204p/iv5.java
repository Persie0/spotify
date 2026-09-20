package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class iv5 extends ov5 {

    /* JADX INFO: renamed from: a */
    public final boolean f106138a;

    public iv5(boolean z) {
        this.f106138a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iv5) && this.f106138a == ((iv5) obj).f106138a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f106138a);
    }
}
