package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class v0x extends u2x {

    /* JADX INFO: renamed from: a */
    public final String f236152a;

    /* JADX INFO: renamed from: b */
    public final fq01 f236153b;

    /* JADX INFO: renamed from: c */
    public final ccl0 f236154c;

    static {
        wg61 wg61Var = fq01.f72032c;
    }

    public v0x(String str, fq01 fq01Var, ccl0 ccl0Var) {
        this.f236152a = str;
        this.f236153b = fq01Var;
        this.f236154c = ccl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0x)) {
            return false;
        }
        v0x v0xVar = (v0x) obj;
        return wj50.m88271j(this.f236152a, v0xVar.f236152a) && wj50.m88271j(this.f236153b, v0xVar.f236153b) && wj50.m88271j(this.f236154c, v0xVar.f236154c);
    }

    public final int hashCode() {
        int iHashCode = (this.f236153b.hashCode() + (this.f236152a.hashCode() * 31)) * 31;
        ccl0 ccl0Var = this.f236154c;
        return iHashCode + (ccl0Var == null ? 0 : ccl0Var.hashCode());
    }
}
