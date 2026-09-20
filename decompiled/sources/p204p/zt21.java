package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zt21 implements au21 {

    /* JADX INFO: renamed from: a */
    public final tu21 f286044a;

    /* JADX INFO: renamed from: b */
    public final Throwable f286045b;

    /* JADX INFO: renamed from: c */
    public final kaa0 f286046c;

    public zt21(tu21 tu21Var, Throwable th, kaa0 kaa0Var) {
        this.f286044a = tu21Var;
        this.f286045b = th;
        this.f286046c = kaa0Var;
    }

    @Override // p204p.au21
    public final String breadcrumb() {
        return "SlotFailed: " + this.f286044a + ", error=" + this.f286045b + ", strategy=" + this.f286046c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zt21)) {
            return false;
        }
        zt21 zt21Var = (zt21) obj;
        return this.f286044a == zt21Var.f286044a && wj50.m88271j(this.f286045b, zt21Var.f286045b) && this.f286046c == zt21Var.f286046c;
    }

    public final int hashCode() {
        return this.f286046c.hashCode() + ((this.f286045b.hashCode() + (this.f286044a.hashCode() * 31)) * 31);
    }
}
