package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class bor extends uor {

    /* JADX INFO: renamed from: a */
    public final boolean f29240a;

    public bor(boolean z) {
        this.f29240a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bor) && this.f29240a == ((bor) obj).f29240a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f29240a);
    }
}
