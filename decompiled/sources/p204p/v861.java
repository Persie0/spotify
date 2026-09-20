package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class v861 implements w861 {

    /* JADX INFO: renamed from: a */
    public final int f238414a;

    public v861(int i) {
        this.f238414a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v861) && this.f238414a == ((v861) obj).f238414a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f238414a);
    }
}
