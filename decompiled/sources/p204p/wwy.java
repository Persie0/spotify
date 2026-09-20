package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class wwy {

    /* JADX INFO: renamed from: a */
    public final int f255853a;

    /* JADX INFO: renamed from: b */
    public final int f255854b;

    /* JADX INFO: renamed from: c */
    public final int f255855c;

    public wwy(int i, int i2, int i3) {
        this.f255853a = i;
        this.f255854b = i2;
        this.f255855c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wwy)) {
            return false;
        }
        wwy wwyVar = (wwy) obj;
        return this.f255853a == wwyVar.f255853a && this.f255854b == wwyVar.f255854b && this.f255855c == wwyVar.f255855c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f255855c) + mt60.m62800g(this.f255854b, Integer.hashCode(this.f255853a) * 31, 31);
    }
}
