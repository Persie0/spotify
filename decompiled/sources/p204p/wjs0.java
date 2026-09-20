package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class wjs0 extends zjs0 {

    /* JADX INFO: renamed from: a */
    public final String f252041a;

    /* JADX INFO: renamed from: b */
    public final String f252042b;

    public wjs0(String str, String str2) {
        this.f252041a = str;
        this.f252042b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wjs0)) {
            return false;
        }
        wjs0 wjs0Var = (wjs0) obj;
        return wj50.m88271j(this.f252041a, wjs0Var.f252041a) && wj50.m88271j(this.f252042b, wjs0Var.f252042b);
    }

    public final int hashCode() {
        return this.f252042b.hashCode() + (this.f252041a.hashCode() * 31);
    }
}
