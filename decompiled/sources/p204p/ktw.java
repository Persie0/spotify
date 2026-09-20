package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ktw implements s2x {

    /* JADX INFO: renamed from: a */
    public final boolean f126404a;

    public ktw(boolean z) {
        this.f126404a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ktw) && this.f126404a == ((ktw) obj).f126404a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f126404a);
    }
}
