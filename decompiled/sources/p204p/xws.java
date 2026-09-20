package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xws implements wxs {

    /* JADX INFO: renamed from: a */
    public final int f266741a;

    public xws(int i) {
        this.f266741a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xws) && this.f266741a == ((xws) obj).f266741a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f266741a);
    }
}
