package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class j5e0 {

    /* JADX INFO: renamed from: a */
    public final int f108946a;

    public j5e0(int i) {
        this.f108946a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j5e0) && this.f108946a == ((j5e0) obj).f108946a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f108946a);
    }
}
