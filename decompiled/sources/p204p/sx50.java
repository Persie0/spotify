package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class sx50 {

    /* JADX INFO: renamed from: a */
    public final String f214820a;

    public /* synthetic */ sx50(String str) {
        this.f214820a = str;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ sx50 m79578a(String str) {
        return new sx50(str);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m79579b(String str, String str2) {
        return wj50.m88271j(str, str2);
    }

    /* JADX INFO: renamed from: c */
    public static int m79580c(String str) {
        return str.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sx50) {
            return wj50.m88271j(this.f214820a, ((sx50) obj).f214820a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f214820a.hashCode();
    }

    public final String toString() {
        return s571.m77251j("JoinToken(value=", this.f214820a, ")");
    }
}
