package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class fs71 {

    /* JADX INFO: renamed from: a */
    public final wwu f72795a;

    /* JADX INFO: renamed from: b */
    public final String f72796b;

    /* JADX INFO: renamed from: c */
    public final es71 f72797c;

    public fs71(wwu wwuVar, String str, es71 es71Var) {
        this.f72795a = wwuVar;
        this.f72796b = str;
        this.f72797c = es71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs71)) {
            return false;
        }
        fs71 fs71Var = (fs71) obj;
        return wj50.m88271j(this.f72795a, fs71Var.f72795a) && wj50.m88271j(this.f72796b, fs71Var.f72796b) && wj50.m88271j(this.f72797c, fs71Var.f72797c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f72795a.hashCode() * 31, 31, this.f72796b);
        es71 es71Var = this.f72797c;
        return iM77243b + (es71Var == null ? 0 : es71Var.f62301a.hashCode());
    }
}
