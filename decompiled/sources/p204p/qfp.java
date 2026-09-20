package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qfp {

    /* JADX INFO: renamed from: a */
    public final String f188270a;

    /* JADX INFO: renamed from: b */
    public final String f188271b;

    /* JADX INFO: renamed from: c */
    public final String f188272c;

    /* JADX INFO: renamed from: d */
    public final String f188273d;

    public qfp(String str, String str2, String str3, String str4) {
        this.f188270a = str;
        this.f188271b = str2;
        this.f188272c = str3;
        this.f188273d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qfp)) {
            return false;
        }
        qfp qfpVar = (qfp) obj;
        return wj50.m88271j(this.f188270a, qfpVar.f188270a) && wj50.m88271j(this.f188271b, qfpVar.f188271b) && wj50.m88271j(this.f188272c, qfpVar.f188272c) && wj50.m88271j(this.f188273d, qfpVar.f188273d);
    }

    public final int hashCode() {
        return this.f188273d.hashCode() + s571.m77243b(s571.m77243b(this.f188270a.hashCode() * 31, 31, this.f188271b), 31, this.f188272c);
    }
}
