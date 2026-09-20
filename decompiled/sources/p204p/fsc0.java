package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class fsc0 implements isc0 {

    /* JADX INFO: renamed from: a */
    public final gtc0 f72826a;

    /* JADX INFO: renamed from: b */
    public final String f72827b;

    public fsc0(gtc0 gtc0Var, String str) {
        this.f72826a = gtc0Var;
        this.f72827b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fsc0)) {
            return false;
        }
        fsc0 fsc0Var = (fsc0) obj;
        return wj50.m88271j(this.f72826a, fsc0Var.f72826a) && wj50.m88271j(this.f72827b, fsc0Var.f72827b);
    }

    public final int hashCode() {
        gtc0 gtc0Var = this.f72826a;
        int iHashCode = (gtc0Var == null ? 0 : gtc0Var.hashCode()) * 31;
        String str = this.f72827b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
