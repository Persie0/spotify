package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ci51 {

    /* JADX INFO: renamed from: a */
    public final String f38229a;

    /* JADX INFO: renamed from: b */
    public final String f38230b;

    /* JADX INFO: renamed from: c */
    public final String f38231c;

    public ci51(String str, String str2, String str3) {
        this.f38229a = str;
        this.f38230b = str2;
        this.f38231c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ci51)) {
            return false;
        }
        ci51 ci51Var = (ci51) obj;
        return wj50.m88271j(this.f38229a, ci51Var.f38229a) && wj50.m88271j(this.f38230b, ci51Var.f38230b) && wj50.m88271j(this.f38231c, ci51Var.f38231c);
    }

    public final int hashCode() {
        return this.f38231c.hashCode() + s571.m77243b(this.f38229a.hashCode() * 31, 31, this.f38230b);
    }
}
