package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class m860 implements kwh0 {

    /* JADX INFO: renamed from: a */
    public final va60 f140929a;

    /* JADX INFO: renamed from: b */
    public final boolean f140930b;

    public m860(va60 va60Var, boolean z) {
        this.f140929a = va60Var;
        this.f140930b = z;
    }

    /* JADX INFO: renamed from: b */
    public static m860 m61108b(m860 m860Var, va60 va60Var, boolean z, int i) {
        if ((i & 1) != 0) {
            va60Var = m860Var.f140929a;
        }
        if ((i & 2) != 0) {
            z = m860Var.f140930b;
        }
        m860Var.getClass();
        return new m860(va60Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m860)) {
            return false;
        }
        m860 m860Var = (m860) obj;
        return wj50.m88271j(this.f140929a, m860Var.f140929a) && this.f140930b == m860Var.f140930b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f140930b) + (this.f140929a.hashCode() * 31);
    }

    public /* synthetic */ m860() {
        this(ta60.f218464a, false);
    }
}
