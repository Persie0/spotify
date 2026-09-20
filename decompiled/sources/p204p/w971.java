package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class w971 implements vwf {

    /* JADX INFO: renamed from: a */
    public final String f249106a;

    /* JADX INFO: renamed from: b */
    public final String f249107b;

    /* JADX INFO: renamed from: c */
    public final String f249108c;

    /* JADX INFO: renamed from: d */
    public final String f249109d;

    /* JADX INFO: renamed from: e */
    public final String f249110e;

    public w971(String str, String str2, String str3, String str4, String str5) {
        this.f249106a = str;
        this.f249107b = str2;
        this.f249108c = str3;
        this.f249109d = str4;
        this.f249110e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w971)) {
            return false;
        }
        w971 w971Var = (w971) obj;
        return wj50.m88271j(this.f249106a, w971Var.f249106a) && wj50.m88271j(this.f249107b, w971Var.f249107b) && wj50.m88271j(this.f249108c, w971Var.f249108c) && wj50.m88271j(this.f249109d, w971Var.f249109d) && wj50.m88271j(this.f249110e, w971Var.f249110e);
    }

    public final int hashCode() {
        return this.f249110e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f249106a.hashCode() * 31, 31, this.f249107b), 31, this.f249108c), 31, this.f249109d);
    }
}
