package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class u8u {

    /* JADX INFO: renamed from: a */
    public final int f228017a;

    /* JADX INFO: renamed from: a */
    public static String m82593a(int i) {
        if (i == 0) {
            return "EmojiSupportMatch.Default";
        }
        if (i == 1) {
            return "EmojiSupportMatch.None";
        }
        return i == 2 ? "EmojiSupportMatch.All" : dq60.m36613m("Invalid(value=", i, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u8u) {
            return this.f228017a == ((u8u) obj).f228017a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f228017a);
    }

    public final String toString() {
        return m82593a(this.f228017a);
    }
}
