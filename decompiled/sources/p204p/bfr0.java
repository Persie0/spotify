package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class bfr0 implements dfr0 {

    /* JADX INFO: renamed from: a */
    public final boolean f26773a;

    public bfr0(boolean z) {
        this.f26773a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bfr0) && this.f26773a == ((bfr0) obj).f26773a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f26773a);
    }
}
