package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class yf90 {

    /* JADX INFO: renamed from: a */
    public final String f272182a;

    /* JADX INFO: renamed from: b */
    public final String f272183b;

    public yf90(String str, String str2) {
        this.f272182a = str;
        this.f272183b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf90)) {
            return false;
        }
        yf90 yf90Var = (yf90) obj;
        return wj50.m88271j(this.f272182a, yf90Var.f272182a) && wj50.m88271j(this.f272183b, yf90Var.f272183b);
    }

    public final int hashCode() {
        return this.f272183b.hashCode() + (this.f272182a.hashCode() * 31);
    }
}
