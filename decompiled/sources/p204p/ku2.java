package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ku2 implements mu2 {

    /* JADX INFO: renamed from: a */
    public final String f126434a;

    /* JADX INFO: renamed from: b */
    public final String f126435b;

    public ku2(String str, String str2) {
        this.f126434a = str;
        this.f126435b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ku2)) {
            return false;
        }
        ku2 ku2Var = (ku2) obj;
        return wj50.m88271j(this.f126434a, ku2Var.f126434a) && wj50.m88271j(this.f126435b, ku2Var.f126435b);
    }

    @Override // p204p.mu2
    public final String getSessionId() {
        return this.f126434a;
    }

    public final int hashCode() {
        return this.f126435b.hashCode() + (this.f126434a.hashCode() * 31);
    }
}
