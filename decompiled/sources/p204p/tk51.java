package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class tk51 {

    /* JADX INFO: renamed from: a */
    public final int f221089a;

    public tk51(int i) {
        this.f221089a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tk51) && this.f221089a == ((tk51) obj).f221089a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f221089a);
    }
}
