package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class h7c0 extends x7c0 {

    /* JADX INFO: renamed from: a */
    public final boolean f88405a;

    public h7c0(boolean z) {
        this.f88405a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h7c0) && this.f88405a == ((h7c0) obj).f88405a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f88405a);
    }
}
