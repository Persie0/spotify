package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class xqz0 implements yqz0 {

    /* JADX INFO: renamed from: a */
    public final String f265160a;

    /* JADX INFO: renamed from: b */
    public final String f265161b;

    public xqz0(String str, String str2) {
        this.f265160a = str;
        this.f265161b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqz0)) {
            return false;
        }
        xqz0 xqz0Var = (xqz0) obj;
        return wj50.m88271j(this.f265160a, xqz0Var.f265160a) && wj50.m88271j(this.f265161b, xqz0Var.f265161b);
    }

    public final int hashCode() {
        return this.f265161b.hashCode() + (this.f265160a.hashCode() * 31);
    }
}
