package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class bke0 {

    /* JADX INFO: renamed from: a */
    public final String f27908a;

    /* JADX INFO: renamed from: b */
    public final String f27909b;

    /* JADX INFO: renamed from: c */
    public final String f27910c;

    /* JADX INFO: renamed from: d */
    public final String f27911d;

    /* JADX INFO: renamed from: e */
    public final String f27912e;

    public bke0(String str, String str2, String str3, String str4, String str5) {
        this.f27908a = str;
        this.f27909b = str2;
        this.f27910c = str3;
        this.f27911d = str4;
        this.f27912e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bke0)) {
            return false;
        }
        bke0 bke0Var = (bke0) obj;
        return wj50.m88271j(this.f27908a, bke0Var.f27908a) && wj50.m88271j(this.f27909b, bke0Var.f27909b) && wj50.m88271j(this.f27910c, bke0Var.f27910c) && wj50.m88271j(this.f27911d, bke0Var.f27911d) && wj50.m88271j(this.f27912e, bke0Var.f27912e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f27908a.hashCode() * 31, 31, this.f27909b);
        String str = this.f27910c;
        return this.f27912e.hashCode() + s571.m77243b((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f27911d);
    }
}
