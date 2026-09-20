package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class tc61 {

    /* JADX INFO: renamed from: a */
    public final String f219030a;

    /* JADX INFO: renamed from: b */
    public final int f219031b;

    /* JADX INFO: renamed from: c */
    public final e081 f219032c;

    public tc61(String str, int i, e081 e081Var) {
        this.f219030a = str;
        this.f219031b = i;
        this.f219032c = e081Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tc61)) {
            return false;
        }
        tc61 tc61Var = (tc61) obj;
        return wj50.m88271j(this.f219030a, tc61Var.f219030a) && this.f219031b == tc61Var.f219031b && wj50.m88271j(this.f219032c, tc61Var.f219032c);
    }

    public final int hashCode() {
        return this.f219032c.hashCode() + mt60.m62800g(this.f219031b, this.f219030a.hashCode() * 31, 31);
    }
}
