package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class mc61 {

    /* JADX INFO: renamed from: a */
    public final gc61 f142079a;

    /* JADX INFO: renamed from: b */
    public final int f142080b;

    /* JADX INFO: renamed from: c */
    public final String f142081c;

    /* JADX INFO: renamed from: d */
    public final int f142082d;

    public mc61(gc61 gc61Var, int i, String str, int i2) {
        this.f142079a = gc61Var;
        this.f142080b = i;
        this.f142081c = str;
        this.f142082d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mc61)) {
            return false;
        }
        mc61 mc61Var = (mc61) obj;
        return wj50.m88271j(this.f142079a, mc61Var.f142079a) && this.f142080b == mc61Var.f142080b && wj50.m88271j(this.f142081c, mc61Var.f142081c) && this.f142082d == mc61Var.f142082d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f142082d) + s571.m77243b(mt60.m62800g(this.f142080b, this.f142079a.hashCode() * 31, 31), 31, this.f142081c);
    }
}
