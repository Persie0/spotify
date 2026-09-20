package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class qf20 {

    /* JADX INFO: renamed from: a */
    public final jcl0 f188100a;

    /* JADX INFO: renamed from: b */
    public final wil f188101b;

    /* JADX INFO: renamed from: c */
    public final bd00 f188102c;

    /* JADX INFO: renamed from: d */
    public final boolean f188103d;

    public qf20(jcl0 jcl0Var, wil wilVar, bd00 bd00Var, boolean z) {
        this.f188100a = jcl0Var;
        this.f188101b = wilVar;
        this.f188102c = bd00Var;
        this.f188103d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qf20)) {
            return false;
        }
        qf20 qf20Var = (qf20) obj;
        return wj50.m88271j(this.f188100a, qf20Var.f188100a) && wj50.m88271j(this.f188101b, qf20Var.f188101b) && wj50.m88271j(this.f188102c, qf20Var.f188102c) && this.f188103d == qf20Var.f188103d;
    }

    public final int hashCode() {
        jcl0 jcl0Var = this.f188100a;
        int iHashCode = (jcl0Var == null ? 0 : jcl0Var.hashCode()) * 31;
        wil wilVar = this.f188101b;
        int iHashCode2 = (iHashCode + (wilVar == null ? 0 : wilVar.f251679a.hashCode())) * 31;
        bd00 bd00Var = this.f188102c;
        return Boolean.hashCode(this.f188103d) + ((iHashCode2 + (bd00Var != null ? bd00Var.hashCode() : 0)) * 31);
    }
}
