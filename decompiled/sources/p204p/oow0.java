package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class oow0 {

    /* JADX INFO: renamed from: a */
    public final qla1 f167706a;

    /* JADX INFO: renamed from: b */
    public final String f167707b;

    /* JADX INFO: renamed from: c */
    public final String f167708c;

    /* JADX INFO: renamed from: d */
    public final String f167709d;

    public oow0(qla1 qla1Var, String str, String str2, String str3) {
        this.f167706a = qla1Var;
        this.f167707b = str;
        this.f167708c = str2;
        this.f167709d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oow0)) {
            return false;
        }
        oow0 oow0Var = (oow0) obj;
        return wj50.m88271j(this.f167706a, oow0Var.f167706a) && wj50.m88271j(this.f167707b, oow0Var.f167707b) && wj50.m88271j(this.f167708c, oow0Var.f167708c) && wj50.m88271j(this.f167709d, oow0Var.f167709d);
    }

    public final int hashCode() {
        return this.f167709d.hashCode() + s571.m77243b(s571.m77243b(this.f167706a.hashCode() * 31, 31, this.f167707b), 31, this.f167708c);
    }
}
