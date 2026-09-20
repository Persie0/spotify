package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class l7e0 extends m7e0 {

    /* JADX INFO: renamed from: a */
    public final int f130633a;

    public l7e0(int i) {
        this.f130633a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l7e0) && this.f130633a == ((l7e0) obj).f130633a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f130633a);
    }
}
