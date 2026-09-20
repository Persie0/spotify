package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class yf31 extends ag31 {

    /* JADX INFO: renamed from: a */
    public final String f272113a;

    /* JADX INFO: renamed from: b */
    public final String f272114b;

    public yf31(String str, String str2) {
        this.f272113a = str;
        this.f272114b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf31)) {
            return false;
        }
        yf31 yf31Var = (yf31) obj;
        return wj50.m88271j(this.f272113a, yf31Var.f272113a) && wj50.m88271j(this.f272114b, yf31Var.f272114b);
    }

    public final int hashCode() {
        return this.f272114b.hashCode() + (this.f272113a.hashCode() * 31);
    }
}
