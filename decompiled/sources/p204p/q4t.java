package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class q4t extends o5t {

    /* JADX INFO: renamed from: a */
    public final int f185344a;

    public q4t(int i) {
        this.f185344a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q4t) && this.f185344a == ((q4t) obj).f185344a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f185344a);
    }
}
