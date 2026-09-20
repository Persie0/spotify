package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class es8 {

    /* JADX INFO: renamed from: a */
    public final String f62302a;

    /* JADX INFO: renamed from: b */
    public final String f62303b;

    /* JADX INFO: renamed from: c */
    public final boolean f62304c;

    /* JADX INFO: renamed from: d */
    public final boolean f62305d;

    /* JADX INFO: renamed from: e */
    public final String f62306e;

    public es8(String str, String str2, String str3, boolean z, boolean z2) {
        this.f62302a = str;
        this.f62303b = str2;
        this.f62304c = z;
        this.f62305d = z2;
        this.f62306e = str3;
    }

    /* JADX INFO: renamed from: a */
    public final String m39893a() {
        return this.f62303b;
    }

    /* JADX INFO: renamed from: b */
    public final String m39894b() {
        return this.f62306e;
    }

    /* JADX INFO: renamed from: c */
    public final String m39895c() {
        return this.f62302a;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m39896d() {
        return this.f62305d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof es8)) {
            return false;
        }
        es8 es8Var = (es8) obj;
        return wj50.m88271j(this.f62302a, es8Var.f62302a) && wj50.m88271j(this.f62303b, es8Var.f62303b) && this.f62304c == es8Var.f62304c && this.f62305d == es8Var.f62305d && wj50.m88271j(this.f62306e, es8Var.f62306e);
    }

    public final int hashCode() {
        return this.f62306e.hashCode() + s571.m77245d(s571.m77245d(s571.m77243b(this.f62302a.hashCode() * 31, 31, this.f62303b), 31, this.f62304c), 31, this.f62305d);
    }

    public /* synthetic */ es8(String str, String str2) {
        this(str, str2, "", true, false);
    }
}
