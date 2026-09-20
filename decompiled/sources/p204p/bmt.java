package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class bmt implements pmt {

    /* JADX INFO: renamed from: a */
    public final String f28613a;

    /* JADX INFO: renamed from: b */
    public final String f28614b;

    /* JADX INFO: renamed from: c */
    public final String f28615c;

    public bmt(String str, String str2, String str3) {
        this.f28613a = str;
        this.f28614b = str2;
        this.f28615c = str3;
    }

    /* JADX INFO: renamed from: b */
    public final String m29891b() {
        return this.f28615c;
    }

    /* JADX INFO: renamed from: c */
    public final String m29892c() {
        return this.f28614b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bmt)) {
            return false;
        }
        bmt bmtVar = (bmt) obj;
        return wj50.m88271j(this.f28613a, bmtVar.f28613a) && wj50.m88271j(this.f28614b, bmtVar.f28614b) && wj50.m88271j(this.f28615c, bmtVar.f28615c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f28613a.hashCode() * 31, 31, this.f28614b);
        String str = this.f28615c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }

    /* JADX INFO: renamed from: t */
    public final String m29893t() {
        return this.f28613a;
    }
}
