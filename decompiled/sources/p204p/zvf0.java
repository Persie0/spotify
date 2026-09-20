package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class zvf0 {

    /* JADX INFO: renamed from: a */
    public final String f286701a;

    /* JADX INFO: renamed from: b */
    public final boolean f286702b;

    public zvf0(String str, boolean z, int i) {
        str = (i & 1) != 0 ? "" : str;
        z = (i & 2) != 0 ? false : z;
        this.f286701a = str;
        this.f286702b = z;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m97092a() {
        return this.f286702b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zvf0)) {
            return false;
        }
        zvf0 zvf0Var = (zvf0) obj;
        return wj50.m88271j(this.f286701a, zvf0Var.f286701a) && this.f286702b == zvf0Var.f286702b;
    }

    public final int hashCode() {
        return edb.m38547C(1) + s571.m77245d(s571.m77245d(this.f286701a.hashCode() * 31, 31, this.f286702b), 31, false);
    }
}
