package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class otj extends juj {

    /* JADX INFO: renamed from: a */
    public final String f169102a;

    /* JADX INFO: renamed from: b */
    public final String f169103b;

    /* JADX INFO: renamed from: c */
    public final String f169104c;

    /* JADX INFO: renamed from: d */
    public final String f169105d;

    /* JADX INFO: renamed from: e */
    public final String f169106e;

    public otj(String str, String str2, String str3, String str4, String str5) {
        this.f169102a = str;
        this.f169103b = str2;
        this.f169104c = str3;
        this.f169105d = str4;
        this.f169106e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof otj)) {
            return false;
        }
        otj otjVar = (otj) obj;
        return wj50.m88271j(this.f169102a, otjVar.f169102a) && wj50.m88271j(this.f169103b, otjVar.f169103b) && wj50.m88271j(this.f169104c, otjVar.f169104c) && wj50.m88271j(this.f169105d, otjVar.f169105d) && wj50.m88271j(this.f169106e, otjVar.f169106e);
    }

    public final int hashCode() {
        return this.f169106e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f169102a.hashCode() * 31, 31, this.f169103b), 31, this.f169104c), 31, this.f169105d);
    }
}
