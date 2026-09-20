package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class sz60 {

    /* JADX INFO: renamed from: a */
    public final int f215398a;

    /* JADX INFO: renamed from: a */
    public static final boolean m79721a(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: b */
    public static int m79722b(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: c */
    public static String m79723c(int i) {
        if (i == 0) {
            return "Unspecified";
        }
        if (i == 1) {
            return "Text";
        }
        if (i == 2) {
            return "Ascii";
        }
        if (i == 3) {
            return "Number";
        }
        if (i == 4) {
            return "Phone";
        }
        if (i == 5) {
            return "Uri";
        }
        if (i == 6) {
            return "Email";
        }
        if (i == 7) {
            return "Password";
        }
        if (i == 8) {
            return "NumberPassword";
        }
        return i == 9 ? "Decimal" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sz60) {
            return this.f215398a == ((sz60) obj).f215398a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f215398a);
    }

    public final String toString() {
        return m79723c(this.f215398a);
    }
}
