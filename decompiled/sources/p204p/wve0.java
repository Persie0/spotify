package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class wve0 extends yve0 {

    /* JADX INFO: renamed from: a */
    public final String f255482a;

    /* JADX INFO: renamed from: b */
    public final String f255483b;

    /* JADX INFO: renamed from: c */
    public final String f255484c;

    public wve0(String str, String str2, String str3) {
        this.f255482a = str;
        this.f255483b = str2;
        this.f255484c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wve0)) {
            return false;
        }
        wve0 wve0Var = (wve0) obj;
        return wj50.m88271j(this.f255482a, wve0Var.f255482a) && wj50.m88271j(this.f255483b, wve0Var.f255483b) && wj50.m88271j(this.f255484c, wve0Var.f255484c);
    }

    public final int hashCode() {
        return this.f255484c.hashCode() + s571.m77243b(this.f255482a.hashCode() * 31, 31, this.f255483b);
    }
}
