package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class spr0 {

    /* JADX INFO: renamed from: a */
    public final String f212928a;

    /* JADX INFO: renamed from: b */
    public final String f212929b;

    /* JADX INFO: renamed from: c */
    public final String f212930c;

    /* JADX INFO: renamed from: d */
    public final boolean f212931d;

    public spr0(String str, String str2, String str3, boolean z) {
        this.f212928a = str;
        this.f212929b = str2;
        this.f212930c = str3;
        this.f212931d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof spr0)) {
            return false;
        }
        spr0 spr0Var = (spr0) obj;
        return wj50.m88271j(this.f212928a, spr0Var.f212928a) && wj50.m88271j(this.f212929b, spr0Var.f212929b) && wj50.m88271j(this.f212930c, spr0Var.f212930c) && this.f212931d == spr0Var.f212931d;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f212928a.hashCode() * 31, 31, this.f212929b);
        String str = this.f212930c;
        return Boolean.hashCode(this.f212931d) + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }
}
