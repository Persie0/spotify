package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class xab0 {

    /* JADX INFO: renamed from: a */
    public final s7f f259643a;

    /* JADX INFO: renamed from: b */
    public final String f259644b;

    /* JADX INFO: renamed from: c */
    public final String f259645c;

    /* JADX INFO: renamed from: d */
    public final String f259646d;

    /* JADX INFO: renamed from: e */
    public final String f259647e;

    /* JADX INFO: renamed from: f */
    public final String f259648f;

    public xab0(s7f s7fVar, String str, String str2, String str3, String str4, String str5) {
        this.f259643a = s7fVar;
        this.f259644b = str;
        this.f259645c = str2;
        this.f259646d = str3;
        this.f259647e = str4;
        this.f259648f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xab0)) {
            return false;
        }
        xab0 xab0Var = (xab0) obj;
        return wj50.m88271j(this.f259643a, xab0Var.f259643a) && wj50.m88271j(this.f259644b, xab0Var.f259644b) && wj50.m88271j(this.f259645c, xab0Var.f259645c) && wj50.m88271j(this.f259646d, xab0Var.f259646d) && wj50.m88271j(this.f259647e, xab0Var.f259647e) && wj50.m88271j(this.f259648f, xab0Var.f259648f);
    }

    public final int hashCode() {
        return this.f259648f.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f259643a.hashCode() * 31, 31, this.f259644b), 31, this.f259645c), 31, this.f259646d), 31, this.f259647e);
    }
}
