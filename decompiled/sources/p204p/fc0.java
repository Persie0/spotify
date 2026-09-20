package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class fc0 {

    /* JADX INFO: renamed from: a */
    public final String f67962a;

    /* JADX INFO: renamed from: b */
    public final pu71 f67963b;

    /* JADX INFO: renamed from: c */
    public final pu71 f67964c;

    public fc0(String str, pu71 pu71Var, pu71 pu71Var2) {
        this.f67962a = str;
        this.f67963b = pu71Var;
        this.f67964c = pu71Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fc0)) {
            return false;
        }
        fc0 fc0Var = (fc0) obj;
        return wj50.m88271j(this.f67962a, fc0Var.f67962a) && wj50.m88271j(this.f67963b, fc0Var.f67963b) && wj50.m88271j(this.f67964c, fc0Var.f67964c);
    }

    public final int hashCode() {
        return this.f67964c.hashCode() + ((this.f67963b.hashCode() + (this.f67962a.hashCode() * 31)) * 31);
    }
}
