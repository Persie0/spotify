package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class qcd0 implements scd0 {

    /* JADX INFO: renamed from: a */
    public final String f187308a;

    /* JADX INFO: renamed from: b */
    public final rcd0 f187309b;

    public qcd0(String str, rcd0 rcd0Var) {
        this.f187308a = str;
        this.f187309b = rcd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qcd0)) {
            return false;
        }
        qcd0 qcd0Var = (qcd0) obj;
        return wj50.m88271j(this.f187308a, qcd0Var.f187308a) && wj50.m88271j(this.f187309b, qcd0Var.f187309b);
    }

    public final int hashCode() {
        return this.f187309b.f197847a.hashCode() + (this.f187308a.hashCode() * 31);
    }
}
