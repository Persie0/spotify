package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class dyp0 {

    /* JADX INFO: renamed from: a */
    public final String f54427a;

    /* JADX INFO: renamed from: b */
    public final Object f54428b;

    public dyp0(String str, Object obj) {
        this.f54427a = str;
        this.f54428b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dyp0)) {
            return false;
        }
        dyp0 dyp0Var = (dyp0) obj;
        return wj50.m88271j(this.f54427a, dyp0Var.f54427a) && wj50.m88271j(this.f54428b, dyp0Var.f54428b);
    }

    public final int hashCode() {
        int iHashCode = this.f54427a.hashCode() * 31;
        Object obj = this.f54428b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }
}
