package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class tb21 {

    /* JADX INFO: renamed from: a */
    public final String f218731a;

    /* JADX INFO: renamed from: b */
    public final String f218732b;

    /* JADX INFO: renamed from: c */
    public final String f218733c;

    /* JADX INFO: renamed from: d */
    public final int f218734d;

    /* JADX INFO: renamed from: e */
    public final String f218735e;

    /* JADX INFO: renamed from: f */
    public final String f218736f;

    public tb21(int i, String str, String str2, String str3, String str4) {
        this.f218731a = str;
        this.f218732b = str2;
        this.f218733c = str3;
        this.f218734d = i;
        this.f218735e = str4;
        this.f218736f = i == 1 ? "spotify:internal:allboarding:origin:home-audiobooks-sub-feed-reentry" : null;
    }

    /* JADX INFO: renamed from: a */
    public final String m80374a() {
        return this.f218733c;
    }

    /* JADX INFO: renamed from: b */
    public final String m80375b() {
        return this.f218735e;
    }

    /* JADX INFO: renamed from: c */
    public final String m80376c() {
        return this.f218732b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tb21)) {
            return false;
        }
        tb21 tb21Var = (tb21) obj;
        return this.f218731a.equals(tb21Var.f218731a) && this.f218732b.equals(tb21Var.f218732b) && this.f218733c.equals(tb21Var.f218733c) && this.f218734d == tb21Var.f218734d && this.f218735e.equals(tb21Var.f218735e);
    }

    public final int hashCode() {
        return this.f218735e.hashCode() + f710.m40938f(this.f218734d, s571.m77243b(s571.m77243b(this.f218731a.hashCode() * 31, 31, this.f218732b), 31, this.f218733c), 31);
    }
}
