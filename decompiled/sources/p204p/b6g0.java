package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class b6g0 {

    /* JADX INFO: renamed from: a */
    public final int f23961a;

    public b6g0(int i) {
        this.f23961a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b6g0) && this.f23961a == ((b6g0) obj).f23961a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23961a);
    }
}
