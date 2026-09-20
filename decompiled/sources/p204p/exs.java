package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class exs implements gxs {

    /* JADX INFO: renamed from: a */
    public final boolean f63840a;

    public exs(boolean z) {
        this.f63840a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof exs) && this.f63840a == ((exs) obj).f63840a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f63840a);
    }
}
