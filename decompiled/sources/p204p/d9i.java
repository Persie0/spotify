package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class d9i extends nai {

    /* JADX INFO: renamed from: a */
    public final String f46838a;

    /* JADX INFO: renamed from: b */
    public final d850 f46839b;

    public d9i(String str, d850 d850Var) {
        this.f46838a = str;
        this.f46839b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d9i)) {
            return false;
        }
        d9i d9iVar = (d9i) obj;
        return wj50.m88271j(this.f46838a, d9iVar.f46838a) && wj50.m88271j(this.f46839b, d9iVar.f46839b);
    }

    public final int hashCode() {
        return this.f46839b.hashCode() + (this.f46838a.hashCode() * 31);
    }
}
