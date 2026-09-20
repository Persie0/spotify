package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xv40 implements aw40 {

    /* JADX INFO: renamed from: a */
    public final String f266274a;

    /* JADX INFO: renamed from: b */
    public final String f266275b;

    public xv40(String str, String str2) {
        this.f266274a = str;
        this.f266275b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xv40)) {
            return false;
        }
        xv40 xv40Var = (xv40) obj;
        return wj50.m88271j(this.f266274a, xv40Var.f266274a) && wj50.m88271j(this.f266275b, xv40Var.f266275b);
    }

    public final int hashCode() {
        return this.f266275b.hashCode() + (this.f266274a.hashCode() * 31);
    }
}
