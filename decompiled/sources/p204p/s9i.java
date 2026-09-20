package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class s9i extends nai {

    /* JADX INFO: renamed from: a */
    public final String f206962a;

    /* JADX INFO: renamed from: b */
    public final d850 f206963b;

    public s9i(String str, d850 d850Var) {
        this.f206962a = str;
        this.f206963b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s9i)) {
            return false;
        }
        s9i s9iVar = (s9i) obj;
        return wj50.m88271j(this.f206962a, s9iVar.f206962a) && wj50.m88271j(this.f206963b, s9iVar.f206963b);
    }

    public final int hashCode() {
        return this.f206963b.hashCode() + (this.f206962a.hashCode() * 31);
    }
}
