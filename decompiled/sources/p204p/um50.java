package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class um50 extends wm50 {

    /* JADX INFO: renamed from: a */
    public final boolean f231742a;

    public um50(boolean z) {
        this.f231742a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof um50) && this.f231742a == ((um50) obj).f231742a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f231742a);
    }
}
