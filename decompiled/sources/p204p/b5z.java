package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class b5z extends d5z {

    /* JADX INFO: renamed from: a */
    public final i4z f23791a;

    /* JADX INFO: renamed from: b */
    public final j4z f23792b;

    public b5z(i4z i4zVar, j4z j4zVar) {
        this.f23791a = i4zVar;
        this.f23792b = j4zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b5z)) {
            return false;
        }
        b5z b5zVar = (b5z) obj;
        return wj50.m88271j(this.f23791a, b5zVar.f23791a) && wj50.m88271j(this.f23792b, b5zVar.f23792b);
    }

    public final int hashCode() {
        return this.f23792b.hashCode() + (this.f23791a.hashCode() * 31);
    }
}
