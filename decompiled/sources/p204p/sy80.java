package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class sy80 {

    /* JADX INFO: renamed from: a */
    public final String f215186a;

    /* JADX INFO: renamed from: b */
    public final lnn0 f215187b;

    /* JADX INFO: renamed from: c */
    public final ntp0 f215188c;

    public sy80(String str, lnn0 lnn0Var, ntp0 ntp0Var) {
        this.f215186a = str;
        this.f215187b = lnn0Var;
        this.f215188c = ntp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sy80)) {
            return false;
        }
        sy80 sy80Var = (sy80) obj;
        return wj50.m88271j(this.f215186a, sy80Var.f215186a) && this.f215187b == sy80Var.f215187b && wj50.m88271j(this.f215188c, sy80Var.f215188c);
    }

    public final int hashCode() {
        return this.f215188c.hashCode() + ((this.f215187b.hashCode() + (this.f215186a.hashCode() * 31)) * 31);
    }
}
