package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ofj implements pfj {

    /* JADX INFO: renamed from: a */
    public final qf40 f164773a;

    /* JADX INFO: renamed from: b */
    public final boolean f164774b;

    /* JADX INFO: renamed from: c */
    public final String f164775c;

    public ofj(int i, String str, qf40 qf40Var) {
        boolean z = (i & 2) == 0;
        str = (i & 4) != 0 ? null : str;
        this.f164773a = qf40Var;
        this.f164774b = z;
        this.f164775c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ofj)) {
            return false;
        }
        ofj ofjVar = (ofj) obj;
        return wj50.m88271j(this.f164773a, ofjVar.f164773a) && this.f164774b == ofjVar.f164774b && wj50.m88271j(this.f164775c, ofjVar.f164775c);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(this.f164773a.hashCode() * 31, 31, this.f164774b);
        String str = this.f164775c;
        return iM77245d + (str == null ? 0 : str.hashCode());
    }
}
