package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ciw0 {

    /* JADX INFO: renamed from: a */
    public final String f38438a;

    /* JADX INFO: renamed from: b */
    public final String f38439b;

    /* JADX INFO: renamed from: c */
    public final String f38440c;

    /* JADX INFO: renamed from: d */
    public final String f38441d;

    public ciw0(String str, String str2, String str3, String str4) {
        this.f38438a = str;
        this.f38439b = str2;
        this.f38440c = str3;
        this.f38441d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ciw0)) {
            return false;
        }
        ciw0 ciw0Var = (ciw0) obj;
        return wj50.m88271j(this.f38438a, ciw0Var.f38438a) && wj50.m88271j(this.f38439b, ciw0Var.f38439b) && wj50.m88271j(this.f38440c, ciw0Var.f38440c) && wj50.m88271j(this.f38441d, ciw0Var.f38441d);
    }

    public final int hashCode() {
        return this.f38441d.hashCode() + s571.m77243b(s571.m77243b(this.f38438a.hashCode() * 31, 31, this.f38439b), 31, this.f38440c);
    }
}
