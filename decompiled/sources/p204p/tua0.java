package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class tua0 implements fz0 {

    /* JADX INFO: renamed from: a */
    public final yzt f223803a;

    /* JADX INFO: renamed from: b */
    public final String f223804b;

    /* JADX INFO: renamed from: c */
    public final String f223805c;

    /* JADX INFO: renamed from: d */
    public final int f223806d;

    public tua0(yzt yztVar, String str, String str2, int i) {
        this.f223803a = yztVar;
        this.f223804b = str;
        this.f223805c = str2;
        this.f223806d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tua0)) {
            return false;
        }
        tua0 tua0Var = (tua0) obj;
        return wj50.m88271j(this.f223803a, tua0Var.f223803a) && wj50.m88271j(this.f223804b, tua0Var.f223804b) && wj50.m88271j(this.f223805c, tua0Var.f223805c) && this.f223806d == tua0Var.f223806d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f223806d) + s571.m77243b(s571.m77243b(this.f223803a.hashCode() * 31, 31, this.f223804b), 31, this.f223805c);
    }
}
