package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gfi {

    /* JADX INFO: renamed from: a */
    public final String f79355a;

    /* JADX INFO: renamed from: b */
    public final String f79356b;

    /* JADX INFO: renamed from: c */
    public final String f79357c;

    /* JADX INFO: renamed from: d */
    public final String f79358d;

    /* JADX INFO: renamed from: e */
    public final String f79359e;

    /* JADX INFO: renamed from: f */
    public final String f79360f;

    /* JADX INFO: renamed from: g */
    public final String f79361g;

    public gfi(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f79355a = str;
        this.f79356b = str2;
        this.f79357c = str3;
        this.f79358d = str4;
        this.f79359e = str5;
        this.f79360f = str6;
        this.f79361g = str7;
    }

    /* JADX INFO: renamed from: a */
    public final String m44618a() {
        return this.f79355a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gfi)) {
            return false;
        }
        gfi gfiVar = (gfi) obj;
        return wj50.m88271j(this.f79355a, gfiVar.f79355a) && wj50.m88271j(this.f79356b, gfiVar.f79356b) && wj50.m88271j(this.f79357c, gfiVar.f79357c) && wj50.m88271j(this.f79358d, gfiVar.f79358d) && wj50.m88271j(this.f79359e, gfiVar.f79359e) && wj50.m88271j(this.f79360f, gfiVar.f79360f) && wj50.m88271j(this.f79361g, gfiVar.f79361g);
    }

    public final int hashCode() {
        return this.f79361g.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f79355a.hashCode() * 31, 31, this.f79356b), 31, this.f79357c), 31, this.f79358d), 31, this.f79359e), 31, this.f79360f);
    }
}
