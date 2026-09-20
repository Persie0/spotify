package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class uhx0 implements aix0 {

    /* JADX INFO: renamed from: a */
    public final String f230544a;

    /* JADX INFO: renamed from: b */
    public final int f230545b;

    public uhx0(String str, int i) {
        this.f230544a = str;
        this.f230545b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uhx0)) {
            return false;
        }
        uhx0 uhx0Var = (uhx0) obj;
        return wj50.m88271j(this.f230544a, uhx0Var.f230544a) && this.f230545b == uhx0Var.f230545b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f230545b) + (this.f230544a.hashCode() * 31);
    }
}
