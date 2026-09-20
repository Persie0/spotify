package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class v77 extends w77 {

    /* JADX INFO: renamed from: a */
    public final int f238083a;

    public v77(int i) {
        this.f238083a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v77) && this.f238083a == ((v77) obj).f238083a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f238083a);
    }
}
