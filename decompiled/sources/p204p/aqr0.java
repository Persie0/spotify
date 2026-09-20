package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class aqr0 {

    /* JADX INFO: renamed from: a */
    public final String f18765a;

    /* JADX INFO: renamed from: b */
    public final String f18766b;

    /* JADX INFO: renamed from: c */
    public final String f18767c;

    /* JADX INFO: renamed from: d */
    public final boolean f18768d;

    /* JADX INFO: renamed from: e */
    public final boolean f18769e;

    public aqr0(String str, String str2, String str3, boolean z, boolean z2) {
        this.f18765a = str;
        this.f18766b = str2;
        this.f18767c = str3;
        this.f18768d = z;
        this.f18769e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqr0)) {
            return false;
        }
        aqr0 aqr0Var = (aqr0) obj;
        return wj50.m88271j(this.f18765a, aqr0Var.f18765a) && wj50.m88271j(this.f18766b, aqr0Var.f18766b) && wj50.m88271j(this.f18767c, aqr0Var.f18767c) && this.f18768d == aqr0Var.f18768d && this.f18769e == aqr0Var.f18769e;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f18765a.hashCode() * 31, 31, this.f18766b);
        String str = this.f18767c;
        return Boolean.hashCode(this.f18769e) + s571.m77245d((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f18768d);
    }
}
