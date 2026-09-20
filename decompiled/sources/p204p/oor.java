package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class oor extends uor {

    /* JADX INFO: renamed from: a */
    public final int f167688a;

    public oor(int i) {
        this.f167688a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oor) && this.f167688a == ((oor) obj).f167688a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f167688a);
    }
}
