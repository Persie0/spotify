package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class d9u0 implements f9u0 {

    /* JADX INFO: renamed from: a */
    public final boolean f46907a;

    public d9u0(boolean z) {
        this.f46907a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d9u0) && this.f46907a == ((d9u0) obj).f46907a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f46907a);
    }
}
