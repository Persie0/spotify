package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class e6m0 implements qfm0 {

    /* JADX INFO: renamed from: a */
    public final boolean f56668a;

    public e6m0(boolean z) {
        this.f56668a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e6m0) && this.f56668a == ((e6m0) obj).f56668a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f56668a);
    }
}
