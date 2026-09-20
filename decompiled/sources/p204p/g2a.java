package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class g2a implements j2a {

    /* JADX INFO: renamed from: a */
    public final int f75871a;

    public g2a(int i) {
        this.f75871a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g2a) && this.f75871a == ((g2a) obj).f75871a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f75871a);
    }
}
