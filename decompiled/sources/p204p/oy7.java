package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class oy7 extends gke {

    /* JADX INFO: renamed from: a */
    public final dy7 f171680a;

    public oy7(dy7 dy7Var) {
        this.f171680a = dy7Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gke)) {
            return false;
        }
        gke gkeVar = (gke) obj;
        Object obj2 = eke.f60435a;
        if (obj2.equals(obj2)) {
            return this.f171680a.equals(((oy7) gkeVar).f171680a);
        }
        return false;
    }

    public final int hashCode() {
        return ((eke.f60435a.hashCode() ^ 1000003) * 1000003) ^ this.f171680a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + eke.f60435a + ", androidClientInfo=" + this.f171680a + "}";
    }
}
