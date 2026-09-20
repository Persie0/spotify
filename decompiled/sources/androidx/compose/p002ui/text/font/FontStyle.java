package androidx.compose.p002ui.text.font;

/* JADX INFO: loaded from: classes.dex */
public final class FontStyle {

    /* JADX INFO: renamed from: a */
    public final int f516a;

    /* JADX INFO: renamed from: a */
    public static String m302a(int i) {
        if (i == 0) {
            return "Normal";
        }
        return i == 1 ? "Italic" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FontStyle) {
            return this.f516a == ((FontStyle) obj).f516a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f516a);
    }

    public final String toString() {
        return m302a(this.f516a);
    }
}
