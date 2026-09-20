package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class i9z extends l9z {

    /* JADX INFO: renamed from: a */
    public final boolean f100105a;

    public i9z(boolean z) {
        this.f100105a = z;
    }

    @Override // p204p.l9z
    /* JADX INFO: renamed from: a */
    public final boolean mo50003a() {
        return this.f100105a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i9z) && this.f100105a == ((i9z) obj).f100105a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f100105a);
    }
}
