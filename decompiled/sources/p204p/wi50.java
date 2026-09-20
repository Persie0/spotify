package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class wi50 implements zi50 {

    /* JADX INFO: renamed from: a */
    public final bwi f251496a;

    /* JADX INFO: renamed from: b */
    public final long f251497b;

    public wi50(bwi bwiVar, long j) {
        this.f251496a = bwiVar;
        this.f251497b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi50)) {
            return false;
        }
        wi50 wi50Var = (wi50) obj;
        return wj50.m88271j(this.f251496a, wi50Var.f251496a) && this.f251497b == wi50Var.f251497b;
    }

    @Override // p204p.zi50
    public final String getName() {
        return "connect_state_changed";
    }

    public final int hashCode() {
        return Long.hashCode(this.f251497b) + (this.f251496a.hashCode() * 31);
    }
}
