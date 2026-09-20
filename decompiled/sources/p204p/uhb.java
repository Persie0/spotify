package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class uhb implements l630 {

    /* JADX INFO: renamed from: a */
    public final zhb f230404a;

    /* JADX INFO: renamed from: b */
    public final String f230405b;

    /* JADX INFO: renamed from: c */
    public final b250 f230406c;

    public uhb(zhb zhbVar, String str, b250 b250Var) {
        this.f230404a = zhbVar;
        this.f230405b = str;
        this.f230406c = b250Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uhb)) {
            return false;
        }
        uhb uhbVar = (uhb) obj;
        return wj50.m88271j(this.f230404a, uhbVar.f230404a) && wj50.m88271j(this.f230405b, uhbVar.f230405b) && wj50.m88271j(this.f230406c, uhbVar.f230406c);
    }

    @Override // p204p.l630
    public final String getId() {
        return this.f230405b;
    }

    public final int hashCode() {
        return this.f230406c.hashCode() + s571.m77243b(this.f230404a.hashCode() * 31, 31, this.f230405b);
    }
}
