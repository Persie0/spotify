package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class vnx0 {

    /* JADX INFO: renamed from: a */
    public final String f243267a;

    /* JADX INFO: renamed from: b */
    public final String f243268b;

    /* JADX INFO: renamed from: c */
    public final coo f243269c;

    /* JADX INFO: renamed from: d */
    public final rfa0 f243270d;

    public vnx0(String str, String str2, coo cooVar, rfa0 rfa0Var) {
        this.f243267a = str;
        this.f243268b = str2;
        this.f243269c = cooVar;
        this.f243270d = rfa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vnx0)) {
            return false;
        }
        vnx0 vnx0Var = (vnx0) obj;
        return wj50.m88271j(this.f243267a, vnx0Var.f243267a) && wj50.m88271j(this.f243268b, vnx0Var.f243268b) && wj50.m88271j(this.f243269c, vnx0Var.f243269c) && wj50.m88271j(this.f243270d, vnx0Var.f243270d);
    }

    public final int hashCode() {
        String str = this.f243267a;
        int iM77243b = s571.m77243b((str == null ? 0 : str.hashCode()) * 31, 31, this.f243268b);
        coo cooVar = this.f243269c;
        int iHashCode = (iM77243b + (cooVar == null ? 0 : cooVar.hashCode())) * 31;
        rfa0 rfa0Var = this.f243270d;
        return iHashCode + (rfa0Var != null ? rfa0Var.hashCode() : 0);
    }
}
