package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class so0 {

    /* JADX INFO: renamed from: a */
    public final String f211068a;

    public /* synthetic */ so0(String str) {
        this.f211068a = str;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ so0 m78596a(String str) {
        return new so0(str);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m78597b(String str, String str2) {
        return wj50.m88271j(str, str2);
    }

    /* JADX INFO: renamed from: c */
    public static int m78598c(String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: d */
    public static String m78599d(String str) {
        return s571.m77251j("AdIdentifier(value=", str, ")");
    }

    /* JADX INFO: renamed from: e */
    public static final String m78600e(String str) {
        return edb.m38564m("spotify:ad:", str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof so0) {
            return wj50.m88271j(this.f211068a, ((so0) obj).f211068a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f211068a.hashCode();
    }

    public final String toString() {
        return m78599d(this.f211068a);
    }
}
