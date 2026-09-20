package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gio0 implements mio0 {

    /* JADX INFO: renamed from: a */
    public final int f80218a;

    public gio0(int i) {
        this.f80218a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gio0) && this.f80218a == ((gio0) obj).f80218a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f80218a);
    }
}
