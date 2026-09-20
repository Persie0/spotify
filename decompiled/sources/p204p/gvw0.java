package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class gvw0 implements moc1 {

    /* JADX INFO: renamed from: a */
    public final String f84848a;

    /* JADX INFO: renamed from: b */
    public final String f84849b;

    /* JADX INFO: renamed from: c */
    public final String f84850c;

    public gvw0(String str, String str2, String str3) {
        this.f84848a = str;
        this.f84849b = str2;
        this.f84850c = str3;
    }

    @Override // p204p.moc1
    /* JADX INFO: renamed from: a */
    public final int mo28648a() {
        return 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gvw0)) {
            return false;
        }
        gvw0 gvw0Var = (gvw0) obj;
        return wj50.m88271j(this.f84848a, gvw0Var.f84848a) && wj50.m88271j(this.f84849b, gvw0Var.f84849b) && wj50.m88271j(this.f84850c, gvw0Var.f84850c);
    }

    public final int hashCode() {
        return this.f84850c.hashCode() + s571.m77243b(this.f84848a.hashCode() * 31, 31, this.f84849b);
    }
}
