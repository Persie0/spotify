package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class j7x0 extends l7x0 {

    /* JADX INFO: renamed from: a */
    public final int f109726a;

    public j7x0(int i) {
        this.f109726a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j7x0) && this.f109726a == ((j7x0) obj).f109726a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f109726a);
    }
}
