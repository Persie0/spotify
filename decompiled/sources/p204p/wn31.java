package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class wn31 {

    /* JADX INFO: renamed from: a */
    public final String f253059a;

    /* JADX INFO: renamed from: b */
    public final String f253060b;

    public wn31(String str, String str2) {
        this.f253059a = str;
        this.f253060b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wn31)) {
            return false;
        }
        wn31 wn31Var = (wn31) obj;
        return wj50.m88271j(this.f253059a, wn31Var.f253059a) && wj50.m88271j(this.f253060b, wn31Var.f253060b);
    }

    public final int hashCode() {
        return this.f253060b.hashCode() + (this.f253059a.hashCode() * 31);
    }
}
