package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class fk20 {

    /* JADX INFO: renamed from: a */
    public final String f70455a;

    /* JADX INFO: renamed from: b */
    public final int f70456b;

    /* JADX INFO: renamed from: c */
    public final boolean f70457c;

    /* JADX INFO: renamed from: d */
    public final eh00 f70458d;

    /* JADX INFO: renamed from: e */
    public final eh00 f70459e;

    public fk20(String str, int i, boolean z, eh00 eh00Var, eh00 eh00Var2) {
        this.f70455a = str;
        this.f70456b = i;
        this.f70457c = z;
        this.f70458d = eh00Var;
        this.f70459e = eh00Var2;
    }

    /* JADX INFO: renamed from: a */
    public final eh00 m41865a() {
        return this.f70458d;
    }

    /* JADX INFO: renamed from: b */
    public final eh00 m41866b() {
        return this.f70459e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fk20)) {
            return false;
        }
        fk20 fk20Var = (fk20) obj;
        return wj50.m88271j(this.f70455a, fk20Var.f70455a) && this.f70456b == fk20Var.f70456b && this.f70457c == fk20Var.f70457c && wj50.m88271j(this.f70458d, fk20Var.f70458d) && wj50.m88271j(this.f70459e, fk20Var.f70459e);
    }

    public final int hashCode() {
        return this.f70459e.hashCode() + p1v.m68853j(s571.m77245d(f710.m40938f(this.f70456b, this.f70455a.hashCode() * 31, 31), 31, this.f70457c), this.f70458d, 31);
    }
}
