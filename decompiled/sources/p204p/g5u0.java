package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class g5u0 {

    /* JADX INFO: renamed from: a */
    public final int f76771a;

    public g5u0(int i) {
        this.f76771a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g5u0) && this.f76771a == ((g5u0) obj).f76771a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f76771a) + (Integer.hashCode(0) * 31);
    }
}
