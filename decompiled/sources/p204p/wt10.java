package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class wt10 {

    /* JADX INFO: renamed from: a */
    public final String f254796a;

    /* JADX INFO: renamed from: b */
    public final String f254797b;

    /* JADX INFO: renamed from: c */
    public final int f254798c;

    public wt10(String str, String str2, int i) {
        this.f254796a = str;
        this.f254797b = str2;
        this.f254798c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wt10)) {
            return false;
        }
        wt10 wt10Var = (wt10) obj;
        return wj50.m88271j(this.f254796a, wt10Var.f254796a) && wj50.m88271j(this.f254797b, wt10Var.f254797b) && this.f254798c == wt10Var.f254798c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f254798c) + s571.m77243b(this.f254796a.hashCode() * 31, 31, this.f254797b);
    }
}
