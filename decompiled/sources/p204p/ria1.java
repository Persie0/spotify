package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ria1 extends sia1 {

    /* JADX INFO: renamed from: a */
    public final boolean f199470a;

    public ria1(boolean z) {
        this.f199470a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ria1) && this.f199470a == ((ria1) obj).f199470a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f199470a);
    }
}
