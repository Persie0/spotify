package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xtv0 extends buv0 {

    /* JADX INFO: renamed from: a */
    public final boolean f265934a;

    public xtv0(boolean z) {
        this.f265934a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xtv0) && this.f265934a == ((xtv0) obj).f265934a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f265934a);
    }
}
