package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class hor0 {

    /* JADX INFO: renamed from: a */
    public final boolean f93591a;

    public hor0(boolean z) {
        this.f93591a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hor0) && this.f93591a == ((hor0) obj).f93591a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f93591a);
    }
}
