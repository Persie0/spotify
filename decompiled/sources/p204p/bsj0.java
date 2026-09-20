package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class bsj0 {

    /* JADX INFO: renamed from: a */
    public final String f30339a;

    /* JADX INFO: renamed from: b */
    public final guf f30340b;

    public bsj0(String str, guf gufVar) {
        this.f30339a = str;
        this.f30340b = gufVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bsj0)) {
            return false;
        }
        bsj0 bsj0Var = (bsj0) obj;
        return wj50.m88271j(this.f30339a, bsj0Var.f30339a) && this.f30340b.equals(bsj0Var.f30340b);
    }

    public final int hashCode() {
        return this.f30340b.hashCode() + (this.f30339a.hashCode() * 31);
    }
}
