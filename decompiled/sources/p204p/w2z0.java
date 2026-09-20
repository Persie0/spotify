package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class w2z0 {

    /* JADX INFO: renamed from: a */
    public final int f247446a;

    public /* synthetic */ w2z0(int i) {
        this.f247446a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w2z0) {
            return this.f247446a == ((w2z0) obj).f247446a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f247446a);
    }

    public final String toString() {
        return edb.m38563l("RenderContentUpdate(id=", this.f247446a, ")");
    }
}
