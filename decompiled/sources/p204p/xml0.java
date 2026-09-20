package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class xml0 implements dbv {

    /* JADX INFO: renamed from: a */
    public final String f263400a;

    /* JADX INFO: renamed from: b */
    public final String f263401b;

    /* JADX INFO: renamed from: c */
    public final cbv f263402c;

    public xml0(String str, String str2, cbv cbvVar) {
        this.f263400a = str;
        this.f263401b = str2;
        this.f263402c = cbvVar;
    }

    @Override // p204p.dbv
    /* JADX INFO: renamed from: a */
    public final cbv mo35608a() {
        return this.f263402c;
    }

    @Override // p204p.dbv
    /* JADX INFO: renamed from: b */
    public final String mo35609b() {
        return this.f263401b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xml0)) {
            return false;
        }
        xml0 xml0Var = (xml0) obj;
        return wj50.m88271j(this.f263400a, xml0Var.f263400a) && wj50.m88271j(this.f263401b, xml0Var.f263401b) && wj50.m88271j(this.f263402c, xml0Var.f263402c);
    }

    @Override // p204p.dbv
    public final String getFormat() {
        return this.f263400a;
    }

    public final int hashCode() {
        return this.f263402c.hashCode() + s571.m77243b(this.f263400a.hashCode() * 31, 31, this.f263401b);
    }
}
