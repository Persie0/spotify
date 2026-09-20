package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ci30 implements ei30 {

    /* JADX INFO: renamed from: a */
    public final String f38199a;

    /* JADX INFO: renamed from: b */
    public final String f38200b;

    /* JADX INFO: renamed from: c */
    public final iv61 f38201c;

    public ci30(String str, String str2, iv61 iv61Var) {
        this.f38199a = str;
        this.f38200b = str2;
        this.f38201c = iv61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ci30)) {
            return false;
        }
        ci30 ci30Var = (ci30) obj;
        return wj50.m88271j(this.f38199a, ci30Var.f38199a) && wj50.m88271j(this.f38200b, ci30Var.f38200b) && wj50.m88271j(this.f38201c, ci30Var.f38201c);
    }

    public final int hashCode() {
        return this.f38201c.hashCode() + s571.m77243b(this.f38199a.hashCode() * 31, 31, this.f38200b);
    }
}
