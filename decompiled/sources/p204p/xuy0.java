package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xuy0 implements lvy0 {

    /* JADX INFO: renamed from: a */
    public final String f266224a;

    /* JADX INFO: renamed from: b */
    public final String f266225b;

    public xuy0(String str, String str2) {
        this.f266224a = str;
        this.f266225b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xuy0)) {
            return false;
        }
        xuy0 xuy0Var = (xuy0) obj;
        return wj50.m88271j(this.f266224a, xuy0Var.f266224a) && wj50.m88271j(this.f266225b, xuy0Var.f266225b);
    }

    public final int hashCode() {
        return this.f266225b.hashCode() + (this.f266224a.hashCode() * 31);
    }
}
