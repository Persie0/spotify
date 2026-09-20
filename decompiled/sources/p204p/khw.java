package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class khw {

    /* JADX INFO: renamed from: a */
    public final Object f122733a;

    public khw(Object obj) {
        this.f122733a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof khw) && this.f122733a.equals(((khw) obj).f122733a);
    }

    public final int hashCode() {
        return this.f122733a.hashCode() + (Boolean.hashCode(true) * 31);
    }
}
