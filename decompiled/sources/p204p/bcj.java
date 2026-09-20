package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class bcj {

    /* JADX INFO: renamed from: a */
    public final br70 f25896a;

    /* JADX INFO: renamed from: b */
    public final int f25897b;

    /* JADX INFO: renamed from: c */
    public final ib3 f25898c;

    /* JADX INFO: renamed from: d */
    public final kb3 f25899d;

    public bcj(br70 br70Var, int i, ib3 ib3Var, kb3 kb3Var) {
        this.f25896a = br70Var;
        this.f25897b = i;
        this.f25898c = ib3Var;
        this.f25899d = kb3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bcj)) {
            return false;
        }
        bcj bcjVar = (bcj) obj;
        return this.f25896a == bcjVar.f25896a && this.f25897b == bcjVar.f25897b && wj50.m88271j(this.f25898c, bcjVar.f25898c) && wj50.m88271j(this.f25899d, bcjVar.f25899d);
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f25897b, this.f25896a.hashCode() * 31, 31);
        ib3 ib3Var = this.f25898c;
        int iHashCode = (iM62800g + (ib3Var == null ? 0 : Integer.hashCode(ib3Var.f100421a))) * 31;
        kb3 kb3Var = this.f25899d;
        return iHashCode + (kb3Var != null ? Integer.hashCode(kb3Var.f121073a) : 0);
    }

    public final String toString() {
        return "ContainerSelector(type=" + this.f25896a + ", numChildren=" + this.f25897b + ", horizontalAlignment=" + this.f25898c + ", verticalAlignment=" + this.f25899d + ')';
    }

    public /* synthetic */ bcj(br70 br70Var, int i, ib3 ib3Var, kb3 kb3Var, int i2) {
        this(br70Var, i, (i2 & 4) != 0 ? null : ib3Var, (i2 & 8) != 0 ? null : kb3Var);
    }
}
