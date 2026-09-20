package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class urq0 implements ktx {

    /* JADX INFO: renamed from: a */
    public final String f233444a;

    /* JADX INFO: renamed from: b */
    public final long f233445b;

    /* JADX INFO: renamed from: c */
    public final xbv f233446c;

    public urq0(String str, long j, xbv xbvVar) {
        this.f233444a = str;
        this.f233445b = j;
        this.f233446c = xbvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof urq0)) {
            return false;
        }
        urq0 urq0Var = (urq0) obj;
        return wj50.m88271j(this.f233444a, urq0Var.f233444a) && this.f233445b == urq0Var.f233445b && wj50.m88271j(this.f233446c, urq0Var.f233446c);
    }

    public final int hashCode() {
        return this.f233446c.hashCode() + dq60.m36605e(this.f233444a.hashCode() * 31, this.f233445b, 31);
    }
}
