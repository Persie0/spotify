package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class smo0 {

    /* JADX INFO: renamed from: a */
    public final int f210693a;

    public smo0(int i) {
        this.f210693a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof smo0) && this.f210693a == ((smo0) obj).f210693a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f210693a);
    }
}
