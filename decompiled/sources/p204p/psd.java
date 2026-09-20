package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class psd {

    /* JADX INFO: renamed from: a */
    public final String f180816a;

    /* JADX INFO: renamed from: b */
    public final String f180817b;

    /* JADX INFO: renamed from: c */
    public final d850 f180818c;

    public psd(String str, String str2, d850 d850Var) {
        this.f180816a = str;
        this.f180817b = str2;
        this.f180818c = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof psd)) {
            return false;
        }
        psd psdVar = (psd) obj;
        return wj50.m88271j(this.f180816a, psdVar.f180816a) && wj50.m88271j(this.f180817b, psdVar.f180817b) && wj50.m88271j(this.f180818c, psdVar.f180818c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f180816a.hashCode() * 31, 31, this.f180817b);
        d850 d850Var = this.f180818c;
        return iM77243b + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
