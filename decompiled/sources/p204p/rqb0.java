package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class rqb0 implements tqb0 {

    /* JADX INFO: renamed from: a */
    public final int f201791a;

    public rqb0(int i) {
        this.f201791a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rqb0) && this.f201791a == ((rqb0) obj).f201791a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f201791a);
    }
}
