package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class rp40 {

    /* JADX INFO: renamed from: a */
    public final String f201420a;

    /* JADX INFO: renamed from: b */
    public final int f201421b;

    public rp40(String str, int i) {
        this.f201420a = str;
        this.f201421b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rp40)) {
            return false;
        }
        rp40 rp40Var = (rp40) obj;
        return wj50.m88271j(this.f201420a, rp40Var.f201420a) && this.f201421b == rp40Var.f201421b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f201421b) + (this.f201420a.hashCode() * 31);
    }
}
