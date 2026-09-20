package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class zca implements ada {

    /* JADX INFO: renamed from: a */
    public final int f281484a;

    public zca(int i) {
        this.f281484a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zca) && this.f281484a == ((zca) obj).f281484a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f281484a);
    }
}
