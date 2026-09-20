package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class hvw0 implements moc1 {

    /* JADX INFO: renamed from: a */
    public final String f95803a;

    /* JADX INFO: renamed from: b */
    public final String f95804b;

    /* JADX INFO: renamed from: c */
    public final String f95805c;

    public hvw0(String str, String str2, String str3) {
        this.f95803a = str;
        this.f95804b = str2;
        this.f95805c = str3;
    }

    @Override // p204p.moc1
    /* JADX INFO: renamed from: a */
    public final int mo28648a() {
        return 8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hvw0)) {
            return false;
        }
        hvw0 hvw0Var = (hvw0) obj;
        return wj50.m88271j(this.f95803a, hvw0Var.f95803a) && wj50.m88271j(this.f95804b, hvw0Var.f95804b) && wj50.m88271j(this.f95805c, hvw0Var.f95805c);
    }

    public final int hashCode() {
        return this.f95805c.hashCode() + s571.m77243b(this.f95803a.hashCode() * 31, 31, this.f95804b);
    }
}
