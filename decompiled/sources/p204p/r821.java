package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class r821 implements b921 {

    /* JADX INFO: renamed from: a */
    public final boolean f196699a;

    public r821(boolean z) {
        this.f196699a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r821) && this.f196699a == ((r821) obj).f196699a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f196699a);
    }
}
