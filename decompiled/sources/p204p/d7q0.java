package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class d7q0 extends f7q0 {

    /* JADX INFO: renamed from: a */
    public final int f46255a;

    public d7q0(int i) {
        this.f46255a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d7q0) && this.f46255a == ((d7q0) obj).f46255a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f46255a);
    }
}
