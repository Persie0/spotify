package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class js6 {

    /* JADX INFO: renamed from: a */
    public final String f115402a;

    /* JADX INFO: renamed from: b */
    public final boolean f115403b;

    /* JADX INFO: renamed from: c */
    public final int f115404c;

    public js6(String str, boolean z, int i) {
        this.f115402a = str;
        this.f115403b = z;
        this.f115404c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof js6)) {
            return false;
        }
        js6 js6Var = (js6) obj;
        return this.f115402a.equals(js6Var.f115402a) && this.f115403b == js6Var.f115403b && this.f115404c == js6Var.f115404c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f115404c) + s571.m77245d(this.f115402a.hashCode() * 31, 31, this.f115403b);
    }
}
