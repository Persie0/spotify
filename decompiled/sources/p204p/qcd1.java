package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class qcd1 {

    /* JADX INFO: renamed from: a */
    public final cr50 f187310a;

    /* JADX INFO: renamed from: b */
    public final ead1 f187311b;

    /* JADX INFO: renamed from: c */
    public final String f187312c;

    /* JADX INFO: renamed from: d */
    public final String f187313d;

    /* JADX INFO: renamed from: e */
    public final String f187314e;

    /* JADX INFO: renamed from: f */
    public final String f187315f;

    public qcd1(cr50 cr50Var, ead1 ead1Var, String str, String str2, String str3, String str4) {
        this.f187310a = cr50Var;
        this.f187311b = ead1Var;
        this.f187312c = str;
        this.f187313d = str2;
        this.f187314e = str3;
        this.f187315f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qcd1)) {
            return false;
        }
        qcd1 qcd1Var = (qcd1) obj;
        return wj50.m88271j(this.f187310a, qcd1Var.f187310a) && wj50.m88271j(this.f187311b, qcd1Var.f187311b) && wj50.m88271j(this.f187312c, qcd1Var.f187312c) && wj50.m88271j(this.f187313d, qcd1Var.f187313d) && wj50.m88271j(this.f187314e, qcd1Var.f187314e) && wj50.m88271j(this.f187315f, qcd1Var.f187315f);
    }

    public final int hashCode() {
        int iHashCode = this.f187310a.hashCode() * 31;
        ead1 ead1Var = this.f187311b;
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b((iHashCode + (ead1Var == null ? 0 : ead1Var.hashCode())) * 31, 31, this.f187312c), 31, this.f187313d), 31, this.f187314e);
        String str = this.f187315f;
        return iM77243b + (str != null ? str.hashCode() : 0);
    }
}
