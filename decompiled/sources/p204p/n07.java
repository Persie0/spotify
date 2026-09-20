package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class n07 {

    /* JADX INFO: renamed from: a */
    public final y67 f148920a;

    /* JADX INFO: renamed from: b */
    public final String f148921b;

    /* JADX INFO: renamed from: c */
    public final x0p0 f148922c;

    public n07(y67 y67Var, String str, x0p0 x0p0Var) {
        this.f148920a = y67Var;
        this.f148921b = str;
        this.f148922c = x0p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n07)) {
            return false;
        }
        n07 n07Var = (n07) obj;
        return wj50.m88271j(this.f148920a, n07Var.f148920a) && wj50.m88271j(this.f148921b, n07Var.f148921b) && wj50.m88271j(this.f148922c, n07Var.f148922c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f148920a.hashCode() * 31, 31, this.f148921b);
        x0p0 x0p0Var = this.f148922c;
        return iM77243b + (x0p0Var == null ? 0 : x0p0Var.hashCode());
    }
}
