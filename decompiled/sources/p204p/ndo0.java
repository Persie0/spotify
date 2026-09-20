package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ndo0 {

    /* JADX INFO: renamed from: c */
    public static final ndo0 f152814c = new ndo0(0, false);

    /* JADX INFO: renamed from: a */
    public final boolean f152815a;

    /* JADX INFO: renamed from: b */
    public final int f152816b;

    public ndo0() {
        this.f152815a = false;
        this.f152816b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ndo0)) {
            return false;
        }
        ndo0 ndo0Var = (ndo0) obj;
        return this.f152815a == ndo0Var.f152815a && this.f152816b == ndo0Var.f152816b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f152816b) + (Boolean.hashCode(this.f152815a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f152815a + ", emojiSupportMatch=" + ((Object) u8u.m82593a(this.f152816b)) + ')';
    }

    public ndo0(int i, boolean z) {
        this.f152815a = z;
        this.f152816b = i;
    }
}
