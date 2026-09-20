package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class s781 {

    /* JADX INFO: renamed from: a */
    public final String f206297a;

    /* JADX INFO: renamed from: b */
    public final d850 f206298b;

    public s781(String str, d850 d850Var) {
        this.f206297a = str;
        this.f206298b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s781)) {
            return false;
        }
        s781 s781Var = (s781) obj;
        return wj50.m88271j(this.f206297a, s781Var.f206297a) && wj50.m88271j(this.f206298b, s781Var.f206298b);
    }

    public final int hashCode() {
        return this.f206298b.hashCode() + (this.f206297a.hashCode() * 31);
    }
}
