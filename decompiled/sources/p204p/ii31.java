package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ii31 implements mi31 {

    /* JADX INFO: renamed from: a */
    public final boolean f102429a;

    public ii31(boolean z) {
        this.f102429a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ii31) && this.f102429a == ((ii31) obj).f102429a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f102429a);
    }
}
