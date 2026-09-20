package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class uh40 implements ci40 {

    /* JADX INFO: renamed from: a */
    public final boolean f230358a;

    public uh40(boolean z) {
        this.f230358a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uh40) && this.f230358a == ((uh40) obj).f230358a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f230358a);
    }
}
