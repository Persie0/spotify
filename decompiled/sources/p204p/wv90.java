package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class wv90 implements ow90 {

    /* JADX INFO: renamed from: a */
    public final boolean f255435a;

    /* JADX INFO: renamed from: b */
    public final String f255436b;

    /* JADX INFO: renamed from: c */
    public final boolean f255437c;

    /* JADX INFO: renamed from: d */
    public final d850 f255438d;

    public /* synthetic */ wv90(String str, int i, boolean z, boolean z2) {
        this(str, (d850) null, z, (i & 4) != 0 ? false : z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wv90)) {
            return false;
        }
        wv90 wv90Var = (wv90) obj;
        return this.f255435a == wv90Var.f255435a && wj50.m88271j(this.f255436b, wv90Var.f255436b) && this.f255437c == wv90Var.f255437c && wj50.m88271j(this.f255438d, wv90Var.f255438d);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77243b(Boolean.hashCode(this.f255435a) * 31, 31, this.f255436b), 31, this.f255437c);
        d850 d850Var = this.f255438d;
        return iM77245d + (d850Var == null ? 0 : d850Var.hashCode());
    }

    public wv90(String str, d850 d850Var, boolean z, boolean z2) {
        this.f255435a = z;
        this.f255436b = str;
        this.f255437c = z2;
        this.f255438d = d850Var;
    }
}
