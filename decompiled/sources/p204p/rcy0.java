package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class rcy0 extends scy0 {

    /* JADX INFO: renamed from: b */
    public final r391 f197951b;

    /* JADX INFO: renamed from: c */
    public final ob71 f197952c;

    public rcy0(r391 r391Var, ob71 ob71Var) {
        super(4);
        this.f197951b = r391Var;
        this.f197952c = ob71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rcy0)) {
            return false;
        }
        rcy0 rcy0Var = (rcy0) obj;
        return wj50.m88271j(this.f197951b, rcy0Var.f197951b) && wj50.m88271j(this.f197952c, rcy0Var.f197952c);
    }

    public final int hashCode() {
        int iHashCode = this.f197951b.hashCode() * 31;
        ob71 ob71Var = this.f197952c;
        return iHashCode + (ob71Var == null ? 0 : ob71Var.hashCode());
    }
}
