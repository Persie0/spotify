package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class cor0 {

    /* JADX INFO: renamed from: a */
    public final boolean f40330a;

    public cor0(boolean z) {
        this.f40330a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cor0) && this.f40330a == ((cor0) obj).f40330a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f40330a);
    }
}
