package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ww91 {

    /* JADX INFO: renamed from: a */
    public final String f255735a;

    /* JADX INFO: renamed from: b */
    public final int f255736b;

    public ww91(String str, int i) {
        this.f255735a = str;
        this.f255736b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ww91)) {
            return false;
        }
        ww91 ww91Var = (ww91) obj;
        return wj50.m88271j(this.f255735a, ww91Var.f255735a) && this.f255736b == ww91Var.f255736b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f255736b) + (this.f255735a.hashCode() * 31);
    }
}
