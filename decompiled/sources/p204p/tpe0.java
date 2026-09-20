package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class tpe0 implements wpe0 {

    /* JADX INFO: renamed from: a */
    public final String f222521a;

    /* JADX INFO: renamed from: b */
    public final String f222522b;

    public tpe0(String str, String str2) {
        this.f222521a = str;
        this.f222522b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tpe0)) {
            return false;
        }
        tpe0 tpe0Var = (tpe0) obj;
        return wj50.m88271j(this.f222521a, tpe0Var.f222521a) && wj50.m88271j(this.f222522b, tpe0Var.f222522b);
    }

    public final int hashCode() {
        return this.f222522b.hashCode() + (this.f222521a.hashCode() * 31);
    }
}
