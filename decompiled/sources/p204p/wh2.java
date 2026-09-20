package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class wh2 {

    /* JADX INFO: renamed from: a */
    public final String f251232a;

    /* JADX INFO: renamed from: b */
    public final String f251233b;

    public wh2(String str, String str2) {
        this.f251232a = str;
        this.f251233b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wh2)) {
            return false;
        }
        wh2 wh2Var = (wh2) obj;
        return wj50.m88271j(this.f251232a, wh2Var.f251232a) && wj50.m88271j(this.f251233b, wh2Var.f251233b);
    }

    public final int hashCode() {
        String str = this.f251232a;
        return this.f251233b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
