package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class j7b1 extends m7b1 {

    /* JADX INFO: renamed from: a */
    public final int f109558a;

    public j7b1(int i) {
        this.f109558a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j7b1) && this.f109558a == ((j7b1) obj).f109558a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f109558a);
    }
}
