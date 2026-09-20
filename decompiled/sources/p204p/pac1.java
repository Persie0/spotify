package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class pac1 {

    /* JADX INFO: renamed from: a */
    public final int f175502a;

    public pac1(int i) {
        this.f175502a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pac1) && this.f175502a == ((pac1) obj).f175502a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f175502a);
    }
}
