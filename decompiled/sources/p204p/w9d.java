package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class w9d implements lad {

    /* JADX INFO: renamed from: a */
    public final String f249158a;

    /* JADX INFO: renamed from: b */
    public final ocl0 f249159b;

    /* JADX INFO: renamed from: c */
    public final long f249160c;

    public w9d(String str, ocl0 ocl0Var, long j) {
        this.f249158a = str;
        this.f249159b = ocl0Var;
        this.f249160c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9d)) {
            return false;
        }
        w9d w9dVar = (w9d) obj;
        return wj50.m88271j(this.f249158a, w9dVar.f249158a) && wj50.m88271j(this.f249159b, w9dVar.f249159b) && this.f249160c == w9dVar.f249160c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f249160c) + ((this.f249159b.hashCode() + (this.f249158a.hashCode() * 31)) * 31);
    }
}
