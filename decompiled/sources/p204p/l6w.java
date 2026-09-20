package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class l6w {

    /* JADX INFO: renamed from: a */
    public final int f130487a;

    public l6w(int i) {
        this.f130487a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l6w) && this.f130487a == ((l6w) obj).f130487a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f130487a) + (Integer.hashCode(0) * 31);
    }
}
