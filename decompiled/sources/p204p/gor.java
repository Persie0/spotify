package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class gor extends uor {

    /* JADX INFO: renamed from: a */
    public final boolean f83004a;

    public gor(boolean z) {
        this.f83004a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gor) && this.f83004a == ((gor) obj).f83004a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f83004a);
    }
}
