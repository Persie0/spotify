package p204p;

/* JADX INFO: loaded from: classes.dex */
@rtz0
public final class t8v {
    public static final s8v Companion = new s8v();

    /* JADX INFO: renamed from: a */
    public final String f218137a;

    /* JADX INFO: renamed from: b */
    public final String f218138b;

    public /* synthetic */ t8v(int i, String str, String str2) {
        if (1 != (i & 1)) {
            edo.m38617p(i, 1, r8v.f196840a.getDescriptor());
            throw null;
        }
        this.f218137a = str;
        if ((i & 2) == 0) {
            this.f218138b = null;
        } else {
            this.f218138b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8v)) {
            return false;
        }
        t8v t8vVar = (t8v) obj;
        return wj50.m88271j(this.f218137a, t8vVar.f218137a) && wj50.m88271j(this.f218138b, t8vVar.f218138b);
    }

    public final int hashCode() {
        int iHashCode = this.f218137a.hashCode() * 31;
        String str = this.f218138b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public t8v(String str, String str2) {
        this.f218137a = str;
        this.f218138b = str2;
    }
}
