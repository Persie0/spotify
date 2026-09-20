package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class e7t {

    /* JADX INFO: renamed from: a */
    public final String f57003a;

    /* JADX INFO: renamed from: b */
    public final int f57004b;

    /* JADX INFO: renamed from: c */
    public final String f57005c;

    /* JADX INFO: renamed from: d */
    public final boolean f57006d;

    public e7t(String str, int i, String str2, boolean z) {
        this.f57003a = str;
        this.f57004b = i;
        this.f57005c = str2;
        this.f57006d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e7t)) {
            return false;
        }
        e7t e7tVar = (e7t) obj;
        return wj50.m88271j(this.f57003a, e7tVar.f57003a) && this.f57004b == e7tVar.f57004b && wj50.m88271j(this.f57005c, e7tVar.f57005c) && this.f57006d == e7tVar.f57006d;
    }

    public final int hashCode() {
        int iM40938f = f710.m40938f(this.f57004b, this.f57003a.hashCode() * 31, 31);
        String str = this.f57005c;
        return Boolean.hashCode(this.f57006d) + ((iM40938f + (str == null ? 0 : str.hashCode())) * 31);
    }

    public /* synthetic */ e7t(String str, String str2, boolean z, int i) {
        this(str, 2, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? false : z);
    }
}
