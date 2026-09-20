package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class rq50 implements hr50 {

    /* JADX INFO: renamed from: a */
    public final String f201757a;

    /* JADX INFO: renamed from: b */
    public final boolean f201758b;

    public rq50(String str, boolean z) {
        this.f201757a = str;
        this.f201758b = z;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m76222a() {
        return this.f201758b;
    }

    /* JADX INFO: renamed from: b */
    public final String m76223b() {
        return this.f201757a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rq50)) {
            return false;
        }
        rq50 rq50Var = (rq50) obj;
        return wj50.m88271j(this.f201757a, rq50Var.f201757a) && this.f201758b == rq50Var.f201758b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f201758b) + (this.f201757a.hashCode() * 31);
    }
}
