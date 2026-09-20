package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class t1j0 extends v1j0 {

    /* JADX INFO: renamed from: a */
    public final tme1 f216286a;

    public t1j0(tme1 tme1Var) {
        this.f216286a = tme1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t1j0) && this.f216286a.equals(((t1j0) obj).f216286a);
    }

    public final int hashCode() {
        return this.f216286a.hashCode();
    }
}
