package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class zvc0 implements rxc0 {

    /* JADX INFO: renamed from: a */
    public final long f286683a;

    /* JADX INFO: renamed from: b */
    public final t0d0 f286684b;

    public zvc0(long j, t0d0 t0d0Var) {
        this.f286683a = j;
        this.f286684b = t0d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zvc0)) {
            return false;
        }
        zvc0 zvc0Var = (zvc0) obj;
        return this.f286683a == zvc0Var.f286683a && wj50.m88271j(this.f286684b, zvc0Var.f286684b);
    }

    public final int hashCode() {
        return this.f286684b.hashCode() + (Long.hashCode(this.f286683a) * 31);
    }
}
