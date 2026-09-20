package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ux50 {

    /* JADX INFO: renamed from: a */
    public final String f234827a;

    public /* synthetic */ ux50(String str) {
        this.f234827a = str;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m84130a(String str, String str2) {
        return wj50.m88271j(str, str2);
    }

    /* JADX INFO: renamed from: b */
    public static int m84131b(String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String m84132c() {
        return this.f234827a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ux50) {
            return wj50.m88271j(this.f234827a, ((ux50) obj).f234827a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f234827a.hashCode();
    }

    public final String toString() {
        return s571.m77251j("ConnectStateIdentifier(value=", this.f234827a, ")");
    }
}
