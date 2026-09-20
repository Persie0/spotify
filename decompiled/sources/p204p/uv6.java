package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class uv6 extends r9g1 {

    /* JADX INFO: renamed from: d */
    public final fq01 f234375d;

    /* JADX INFO: renamed from: e */
    public final ccl0 f234376e;

    static {
        wg61 wg61Var = fq01.f72032c;
    }

    public uv6(fq01 fq01Var, ccl0 ccl0Var) {
        this.f234375d = fq01Var;
        this.f234376e = ccl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uv6)) {
            return false;
        }
        uv6 uv6Var = (uv6) obj;
        return wj50.m88271j(this.f234375d, uv6Var.f234375d) && wj50.m88271j(this.f234376e, uv6Var.f234376e);
    }

    public final int hashCode() {
        int iHashCode = this.f234375d.hashCode() * 31;
        ccl0 ccl0Var = this.f234376e;
        return iHashCode + (ccl0Var == null ? 0 : ccl0Var.hashCode());
    }
}
