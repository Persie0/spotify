package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class yx50 {

    /* JADX INFO: renamed from: a */
    public final String f277137a;

    /* JADX INFO: renamed from: a */
    public static final boolean m94808a(String str, String str2) {
        return wj50.m88271j(str, str2);
    }

    /* JADX INFO: renamed from: b */
    public static int m94809b(String str) {
        return str.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yx50) {
            return wj50.m88271j(this.f277137a, ((yx50) obj).f277137a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f277137a.hashCode();
    }

    public final String toString() {
        return s571.m77251j("SocialRadarBroadcastToken(value=", this.f277137a, ")");
    }
}
