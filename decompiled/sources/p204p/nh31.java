package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class nh31 implements mi31 {

    /* JADX INFO: renamed from: a */
    public final boolean f153854a;

    public nh31(boolean z) {
        this.f153854a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nh31) && this.f153854a == ((nh31) obj).f153854a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f153854a);
    }
}
