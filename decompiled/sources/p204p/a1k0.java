package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class a1k0 {

    /* JADX INFO: renamed from: a */
    public final String f11432a;

    /* JADX INFO: renamed from: b */
    public final String f11433b;

    /* JADX INFO: renamed from: c */
    public final String f11434c;

    /* JADX INFO: renamed from: d */
    public final String f11435d;

    /* JADX INFO: renamed from: e */
    public final String f11436e;

    public a1k0(String str, String str2, String str3, String str4, String str5) {
        this.f11432a = str;
        this.f11433b = str2;
        this.f11434c = str3;
        this.f11435d = str4;
        this.f11436e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1k0)) {
            return false;
        }
        a1k0 a1k0Var = (a1k0) obj;
        return wj50.m88271j(this.f11432a, a1k0Var.f11432a) && wj50.m88271j(this.f11433b, a1k0Var.f11433b) && wj50.m88271j(this.f11434c, a1k0Var.f11434c) && wj50.m88271j(this.f11435d, a1k0Var.f11435d) && wj50.m88271j(this.f11436e, a1k0Var.f11436e);
    }

    public final int hashCode() {
        return this.f11436e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f11432a.hashCode() * 31, 31, this.f11433b), 31, this.f11434c), 31, this.f11435d);
    }
}
