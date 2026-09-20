package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class uny implements hoy {

    /* JADX INFO: renamed from: a */
    public final boolean f232283a;

    public uny(boolean z) {
        this.f232283a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uny) && this.f232283a == ((uny) obj).f232283a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f232283a);
    }
}
