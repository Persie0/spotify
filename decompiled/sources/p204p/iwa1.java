package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class iwa1 implements jwa1 {

    /* JADX INFO: renamed from: a */
    public final String f106373a;

    /* JADX INFO: renamed from: b */
    public final d850 f106374b;

    public iwa1(String str, d850 d850Var) {
        this.f106373a = str;
        this.f106374b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iwa1)) {
            return false;
        }
        iwa1 iwa1Var = (iwa1) obj;
        return wj50.m88271j(this.f106373a, iwa1Var.f106373a) && wj50.m88271j(this.f106374b, iwa1Var.f106374b);
    }

    public final int hashCode() {
        return this.f106374b.hashCode() + (this.f106373a.hashCode() * 31);
    }
}
