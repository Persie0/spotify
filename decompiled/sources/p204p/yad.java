package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class yad implements abd {

    /* JADX INFO: renamed from: a */
    public final int f270873a;

    public yad(int i) {
        this.f270873a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yad) && this.f270873a == ((yad) obj).f270873a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f270873a);
    }
}
