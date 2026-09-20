package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class mq2 {

    /* JADX INFO: renamed from: a */
    public final String f146142a;

    /* JADX INFO: renamed from: b */
    public final String f146143b;

    /* JADX INFO: renamed from: c */
    public final mec0 f146144c;

    /* JADX INFO: renamed from: d */
    public final String f146145d;

    /* JADX INFO: renamed from: e */
    public final String f146146e;

    /* JADX INFO: renamed from: f */
    public final String f146147f;

    public mq2(String str, String str2, String str3, String str4, String str5, mec0 mec0Var) {
        this.f146142a = str;
        this.f146143b = str2;
        this.f146144c = mec0Var;
        this.f146145d = str3;
        this.f146146e = str4;
        this.f146147f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mq2)) {
            return false;
        }
        mq2 mq2Var = (mq2) obj;
        return this.f146142a.equals(mq2Var.f146142a) && this.f146143b.equals(mq2Var.f146143b) && this.f146144c.equals(mq2Var.f146144c) && this.f146145d.equals(mq2Var.f146145d) && wj50.m88271j(this.f146146e, mq2Var.f146146e) && wj50.m88271j(this.f146147f, mq2Var.f146147f);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(fr0.m42462f(this.f146144c, s571.m77243b(this.f146142a.hashCode() * 31, 31, this.f146143b), 31), 31, this.f146145d);
        String str = this.f146146e;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f146147f;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
