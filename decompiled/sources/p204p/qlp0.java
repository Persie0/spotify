package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qlp0 {

    /* JADX INFO: renamed from: a */
    public final String f189895a;

    /* JADX INFO: renamed from: b */
    public final String f189896b;

    /* JADX INFO: renamed from: c */
    public final klu0 f189897c;

    public qlp0(String str, String str2, klu0 klu0Var) {
        this.f189895a = str;
        this.f189896b = str2;
        this.f189897c = klu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qlp0)) {
            return false;
        }
        qlp0 qlp0Var = (qlp0) obj;
        return wj50.m88271j(this.f189895a, qlp0Var.f189895a) && wj50.m88271j(this.f189896b, qlp0Var.f189896b) && this.f189897c.equals(qlp0Var.f189897c);
    }

    public final int hashCode() {
        return this.f189897c.hashCode() + s571.m77243b(this.f189895a.hashCode() * 31, 31, this.f189896b);
    }
}
