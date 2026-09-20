package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class az01 extends kz01 {

    /* JADX INFO: renamed from: a */
    public final fq01 f21386a;

    /* JADX INFO: renamed from: b */
    public final ox01 f21387b;

    /* JADX INFO: renamed from: c */
    public final ho01 f21388c;

    /* JADX INFO: renamed from: d */
    public final String f21389d;

    /* JADX INFO: renamed from: e */
    public final Integer f21390e;

    /* JADX INFO: renamed from: f */
    public final ccl0 f21391f;

    /* JADX INFO: renamed from: g */
    public final z650 f21392g;

    public az01(fq01 fq01Var, ox01 ox01Var, ho01 ho01Var, String str, Integer num, ccl0 ccl0Var, z650 z650Var) {
        this.f21386a = fq01Var;
        this.f21387b = ox01Var;
        this.f21388c = ho01Var;
        this.f21389d = str;
        this.f21390e = num;
        this.f21391f = ccl0Var;
        this.f21392g = z650Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az01)) {
            return false;
        }
        az01 az01Var = (az01) obj;
        return wj50.m88271j(this.f21386a, az01Var.f21386a) && wj50.m88271j(this.f21387b, az01Var.f21387b) && wj50.m88271j(this.f21388c, az01Var.f21388c) && wj50.m88271j(this.f21389d, az01Var.f21389d) && wj50.m88271j(this.f21390e, az01Var.f21390e) && wj50.m88271j(this.f21391f, az01Var.f21391f) && wj50.m88271j(this.f21392g, az01Var.f21392g);
    }

    public final int hashCode() {
        int iHashCode = (this.f21387b.hashCode() + (this.f21386a.hashCode() * 31)) * 31;
        ho01 ho01Var = this.f21388c;
        int iHashCode2 = (iHashCode + (ho01Var == null ? 0 : ho01Var.hashCode())) * 31;
        String str = this.f21389d;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f21390e;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        ccl0 ccl0Var = this.f21391f;
        int iHashCode5 = (iHashCode4 + (ccl0Var == null ? 0 : ccl0Var.hashCode())) * 31;
        z650 z650Var = this.f21392g;
        return iHashCode5 + (z650Var != null ? z650Var.f279709a.hashCode() : 0);
    }
}
