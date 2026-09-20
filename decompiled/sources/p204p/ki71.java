package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ki71 {

    /* JADX INFO: renamed from: a */
    public final String f122874a;

    /* JADX INFO: renamed from: b */
    public final int f122875b;

    /* JADX INFO: renamed from: c */
    public final int f122876c;

    public ki71(String str, int i, int i2) {
        this.f122874a = str;
        this.f122875b = i;
        this.f122876c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ki71)) {
            return false;
        }
        ki71 ki71Var = (ki71) obj;
        return wj50.m88271j(this.f122874a, ki71Var.f122874a) && this.f122875b == ki71Var.f122875b && this.f122876c == ki71Var.f122876c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f122876c) + mt60.m62800g(this.f122875b, this.f122874a.hashCode() * 31, 31);
    }
}
