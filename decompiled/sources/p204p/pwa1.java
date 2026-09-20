package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class pwa1 implements rwa1 {

    /* JADX INFO: renamed from: a */
    public final String f181976a;

    /* JADX INFO: renamed from: b */
    public final d850 f181977b;

    public pwa1(String str, d850 d850Var) {
        this.f181976a = str;
        this.f181977b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pwa1)) {
            return false;
        }
        pwa1 pwa1Var = (pwa1) obj;
        return wj50.m88271j(this.f181976a, pwa1Var.f181976a) && wj50.m88271j(this.f181977b, pwa1Var.f181977b);
    }

    public final int hashCode() {
        return this.f181977b.hashCode() + (this.f181976a.hashCode() * 31);
    }
}
