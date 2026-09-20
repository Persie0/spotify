package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class q1o0 implements w1o0 {

    /* JADX INFO: renamed from: a */
    public final int f184386a;

    public q1o0(int i) {
        this.f184386a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q1o0) && this.f184386a == ((q1o0) obj).f184386a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f184386a);
    }
}
