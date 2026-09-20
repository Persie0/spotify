package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class zlo0 implements amo0 {

    /* JADX INFO: renamed from: a */
    public final hrw f284041a;

    public zlo0(hrw hrwVar) {
        this.f284041a = hrwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zlo0) && this.f284041a.equals(((zlo0) obj).f284041a);
    }

    public final int hashCode() {
        return this.f284041a.hashCode();
    }
}
