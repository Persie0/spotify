package androidx.compose.p002ui.text.font;

/* JADX INFO: loaded from: classes.dex */
public final class FontSynthesis {

    /* JADX INFO: renamed from: a */
    public final int f517a;

    public final boolean equals(Object obj) {
        if (obj instanceof FontSynthesis) {
            return this.f517a == ((FontSynthesis) obj).f517a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f517a);
    }

    public final String toString() {
        int i = this.f517a;
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return "Weight";
        }
        if (i == 2) {
            return "Style";
        }
        return i == 65535 ? "All" : "Invalid";
    }
}
