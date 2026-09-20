package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class fu6 {

    /* JADX INFO: renamed from: a */
    public final int f73412a;

    /* JADX INFO: renamed from: b */
    public final String f73413b;

    /* JADX INFO: renamed from: c */
    public final String f73414c;

    /* JADX INFO: renamed from: d */
    public final String f73415d;

    /* JADX INFO: renamed from: e */
    public final boolean f73416e;

    /* JADX INFO: renamed from: f */
    public final String f73417f;

    public fu6(String str, int i, String str2, String str3, boolean z, String str4) {
        this.f73412a = i;
        this.f73413b = str;
        this.f73414c = str2;
        this.f73415d = str3;
        this.f73416e = z;
        this.f73417f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fu6)) {
            return false;
        }
        fu6 fu6Var = (fu6) obj;
        return this.f73412a == fu6Var.f73412a && this.f73413b.equals(fu6Var.f73413b) && this.f73414c.equals(fu6Var.f73414c) && this.f73415d.equals(fu6Var.f73415d) && this.f73416e == fu6Var.f73416e && this.f73417f.equals(fu6Var.f73417f);
    }

    public final int hashCode() {
        return this.f73417f.hashCode() + s571.m77245d(s571.m77243b(s571.m77243b(s571.m77243b(edb.m38547C(this.f73412a) * 31, 31, this.f73413b), 31, this.f73414c), 31, this.f73415d), 31, this.f73416e);
    }
}
