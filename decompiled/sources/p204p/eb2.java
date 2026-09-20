package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class eb2 implements hb2 {

    /* JADX INFO: renamed from: a */
    public final int f57783a;

    public eb2(int i) {
        this.f57783a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eb2) && this.f57783a == ((eb2) obj).f57783a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f57783a);
    }
}
