package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class dx9 implements hx9 {

    /* JADX INFO: renamed from: a */
    public final String f53906a;

    /* JADX INFO: renamed from: b */
    public final String f53907b;

    public dx9(String str, String str2) {
        this.f53906a = str;
        this.f53907b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dx9)) {
            return false;
        }
        dx9 dx9Var = (dx9) obj;
        return wj50.m88271j(this.f53906a, dx9Var.f53906a) && wj50.m88271j(this.f53907b, dx9Var.f53907b);
    }

    public final int hashCode() {
        return this.f53907b.hashCode() + (this.f53906a.hashCode() * 31);
    }
}
