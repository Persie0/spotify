package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class st8 implements vt8 {

    /* JADX INFO: renamed from: a */
    public final int f213839a;

    public st8(int i) {
        this.f213839a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof st8) && this.f213839a == ((st8) obj).f213839a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f213839a);
    }
}
