package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class u220 {

    /* JADX INFO: renamed from: a */
    public final String f225962a;

    /* JADX INFO: renamed from: b */
    public final boolean f225963b;

    /* JADX INFO: renamed from: c */
    public final qf40 f225964c;

    public u220(String str, qf40 qf40Var, boolean z) {
        this.f225962a = str;
        this.f225963b = z;
        this.f225964c = qf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u220)) {
            return false;
        }
        u220 u220Var = (u220) obj;
        return wj50.m88271j(this.f225962a, u220Var.f225962a) && this.f225963b == u220Var.f225963b && wj50.m88271j(this.f225964c, u220Var.f225964c);
    }

    public final int hashCode() {
        return this.f225964c.hashCode() + s571.m77245d(this.f225962a.hashCode() * 31, 31, this.f225963b);
    }
}
