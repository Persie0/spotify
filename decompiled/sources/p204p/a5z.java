package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class a5z extends d5z {

    /* JADX INFO: renamed from: a */
    public final i4z f12650a;

    /* JADX INFO: renamed from: b */
    public final j4z f12651b;

    public a5z(i4z i4zVar, j4z j4zVar) {
        this.f12650a = i4zVar;
        this.f12651b = j4zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a5z)) {
            return false;
        }
        a5z a5zVar = (a5z) obj;
        return wj50.m88271j(this.f12650a, a5zVar.f12650a) && wj50.m88271j(this.f12651b, a5zVar.f12651b);
    }

    public final int hashCode() {
        return this.f12651b.hashCode() + (this.f12650a.hashCode() * 31);
    }
}
