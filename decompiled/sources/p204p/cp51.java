package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class cp51 implements dp51 {

    /* JADX INFO: renamed from: a */
    public final int f40465a;

    public cp51(int i) {
        this.f40465a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cp51) && this.f40465a == ((cp51) obj).f40465a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f40465a);
    }
}
