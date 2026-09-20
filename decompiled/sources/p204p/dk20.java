package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class dk20 {

    /* JADX INFO: renamed from: a */
    public final int f49827a;

    public dk20(int i) {
        this.f49827a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dk20) && this.f49827a == ((dk20) obj).f49827a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f49827a);
    }
}
