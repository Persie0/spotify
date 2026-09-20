package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class c9i extends nai {

    /* JADX INFO: renamed from: a */
    public final String f35570a;

    /* JADX INFO: renamed from: b */
    public final d850 f35571b;

    public c9i(String str, d850 d850Var) {
        this.f35570a = str;
        this.f35571b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9i)) {
            return false;
        }
        c9i c9iVar = (c9i) obj;
        return wj50.m88271j(this.f35570a, c9iVar.f35570a) && wj50.m88271j(this.f35571b, c9iVar.f35571b);
    }

    public final int hashCode() {
        return this.f35571b.hashCode() + (this.f35570a.hashCode() * 31);
    }
}
