package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class l9f0 {

    /* JADX INFO: renamed from: a */
    public final rxt f131081a;

    /* JADX INFO: renamed from: b */
    public final thl f131082b;

    public l9f0(rxt rxtVar, thl thlVar) {
        this.f131081a = rxtVar;
        this.f131082b = thlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9f0)) {
            return false;
        }
        l9f0 l9f0Var = (l9f0) obj;
        return this.f131081a.equals(l9f0Var.f131081a) && this.f131082b.equals(l9f0Var.f131082b);
    }

    public final int hashCode() {
        return this.f131082b.hashCode() + (this.f131081a.hashCode() * 31);
    }
}
