package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jvb1 {

    /* JADX INFO: renamed from: a */
    public final rko f116296a;

    /* JADX INFO: renamed from: b */
    public final rko f116297b;

    public jvb1(rko rkoVar, rko rkoVar2) {
        this.f116296a = rkoVar;
        this.f116297b = rkoVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jvb1)) {
            return false;
        }
        jvb1 jvb1Var = (jvb1) obj;
        return wj50.m88271j(this.f116296a, jvb1Var.f116296a) && wj50.m88271j(this.f116297b, jvb1Var.f116297b);
    }

    public final int hashCode() {
        return this.f116297b.hashCode() + (this.f116296a.hashCode() * 31);
    }
}
