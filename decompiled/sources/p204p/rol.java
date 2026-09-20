package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class rol {

    /* JADX INFO: renamed from: a */
    public final String f201289a;

    /* JADX INFO: renamed from: b */
    public final String f201290b;

    /* JADX INFO: renamed from: c */
    public final String f201291c;

    /* JADX INFO: renamed from: d */
    public final String f201292d;

    /* JADX INFO: renamed from: e */
    public final String f201293e;

    public rol(String str, String str2, String str3, String str4, String str5) {
        this.f201289a = str;
        this.f201290b = str2;
        this.f201291c = str3;
        this.f201292d = str4;
        this.f201293e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rol)) {
            return false;
        }
        rol rolVar = (rol) obj;
        return wj50.m88271j(this.f201289a, rolVar.f201289a) && wj50.m88271j(this.f201290b, rolVar.f201290b) && wj50.m88271j(this.f201291c, rolVar.f201291c) && wj50.m88271j(this.f201292d, rolVar.f201292d) && wj50.m88271j(this.f201293e, rolVar.f201293e);
    }

    public final int hashCode() {
        return this.f201293e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f201289a.hashCode() * 31, 31, this.f201290b), 31, this.f201291c), 31, this.f201292d);
    }
}
