package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class zlz0 implements bmz0 {

    /* JADX INFO: renamed from: a */
    public final int f284107a;

    public zlz0(int i) {
        this.f284107a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zlz0) && this.f284107a == ((zlz0) obj).f284107a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f284107a);
    }
}
