package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class qh31 implements mi31 {

    /* JADX INFO: renamed from: a */
    public final String f188616a;

    /* JADX INFO: renamed from: b */
    public final boolean f188617b;

    public qh31(String str, boolean z) {
        this.f188616a = str;
        this.f188617b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qh31)) {
            return false;
        }
        qh31 qh31Var = (qh31) obj;
        return wj50.m88271j(this.f188616a, qh31Var.f188616a) && this.f188617b == qh31Var.f188617b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f188617b) + (this.f188616a.hashCode() * 31);
    }
}
