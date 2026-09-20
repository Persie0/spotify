package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class hnf0 implements lpf0 {

    /* JADX INFO: renamed from: a */
    public final boolean f93330a;

    public hnf0(boolean z) {
        this.f93330a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hnf0) && this.f93330a == ((hnf0) obj).f93330a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f93330a);
    }
}
