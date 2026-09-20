package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class laj0 {

    /* JADX INFO: renamed from: a */
    public final wwu f131352a;

    /* JADX INFO: renamed from: b */
    public final String f131353b;

    /* JADX INFO: renamed from: c */
    public final String f131354c;

    public laj0(wwu wwuVar, String str, String str2) {
        this.f131352a = wwuVar;
        this.f131353b = str;
        this.f131354c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof laj0)) {
            return false;
        }
        laj0 laj0Var = (laj0) obj;
        return wj50.m88271j(this.f131352a, laj0Var.f131352a) && wj50.m88271j(this.f131353b, laj0Var.f131353b) && wj50.m88271j(this.f131354c, laj0Var.f131354c);
    }

    public final int hashCode() {
        return this.f131354c.hashCode() + s571.m77243b(this.f131352a.hashCode() * 31, 31, this.f131353b);
    }
}
