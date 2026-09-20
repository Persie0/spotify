package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class rwr0 implements xwr0 {

    /* JADX INFO: renamed from: a */
    public final int f203400a;

    public rwr0(int i) {
        this.f203400a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rwr0) && this.f203400a == ((rwr0) obj).f203400a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f203400a);
    }
}
