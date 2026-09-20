package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class zne0 extends aoe0 {

    /* JADX INFO: renamed from: a */
    public final String f284481a;

    /* JADX INFO: renamed from: b */
    public final ker0 f284482b;

    /* JADX INFO: renamed from: c */
    public final String f284483c;

    public zne0(String str, String str2, ker0 ker0Var) {
        this.f284481a = str;
        this.f284482b = ker0Var;
        this.f284483c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zne0)) {
            return false;
        }
        zne0 zne0Var = (zne0) obj;
        return wj50.m88271j(this.f284481a, zne0Var.f284481a) && this.f284482b == zne0Var.f284482b && wj50.m88271j(this.f284483c, zne0Var.f284483c);
    }

    public final int hashCode() {
        return this.f284483c.hashCode() + ((this.f284482b.hashCode() + (this.f284481a.hashCode() * 31)) * 31);
    }
}
