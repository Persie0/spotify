package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class bsf implements dsf {

    /* JADX INFO: renamed from: a */
    public final String f30303a;

    /* JADX INFO: renamed from: b */
    public final String f30304b;

    /* JADX INFO: renamed from: c */
    public final String f30305c;

    public bsf(String str, String str2, String str3) {
        this.f30303a = str;
        this.f30304b = str2;
        this.f30305c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bsf)) {
            return false;
        }
        bsf bsfVar = (bsf) obj;
        return wj50.m88271j(this.f30303a, bsfVar.f30303a) && wj50.m88271j(this.f30304b, bsfVar.f30304b) && wj50.m88271j(this.f30305c, bsfVar.f30305c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f30303a.hashCode() * 31, 31, this.f30304b);
        String str = this.f30305c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
