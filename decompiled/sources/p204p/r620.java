package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class r620 implements v620 {

    /* JADX INFO: renamed from: a */
    public final boolean f196163a;

    public r620(boolean z) {
        this.f196163a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r620) && this.f196163a == ((r620) obj).f196163a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f196163a);
    }
}
