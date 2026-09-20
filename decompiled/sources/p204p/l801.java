package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class l801 implements q801 {

    /* JADX INFO: renamed from: a */
    public final String f130769a;

    /* JADX INFO: renamed from: b */
    public final d850 f130770b;

    public l801(String str, d850 d850Var) {
        this.f130769a = str;
        this.f130770b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l801)) {
            return false;
        }
        l801 l801Var = (l801) obj;
        return wj50.m88271j(this.f130769a, l801Var.f130769a) && wj50.m88271j(this.f130770b, l801Var.f130770b);
    }

    public final int hashCode() {
        return this.f130770b.hashCode() + (this.f130769a.hashCode() * 31);
    }
}
