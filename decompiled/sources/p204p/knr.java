package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class knr extends pnr {

    /* JADX INFO: renamed from: a */
    public final boolean f124462a;

    public knr(boolean z) {
        this.f124462a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof knr) && this.f124462a == ((knr) obj).f124462a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f124462a);
    }
}
