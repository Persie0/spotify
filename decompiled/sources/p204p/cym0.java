package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class cym0 extends hrg1 {

    /* JADX INFO: renamed from: c */
    public final String f43326c;

    /* JADX INFO: renamed from: d */
    public final d850 f43327d;

    public cym0(String str, d850 d850Var) {
        this.f43326c = str;
        this.f43327d = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cym0)) {
            return false;
        }
        cym0 cym0Var = (cym0) obj;
        return wj50.m88271j(this.f43326c, cym0Var.f43326c) && wj50.m88271j(this.f43327d, cym0Var.f43327d);
    }

    public final int hashCode() {
        return this.f43327d.hashCode() + (this.f43326c.hashCode() * 31);
    }
}
