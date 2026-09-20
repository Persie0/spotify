package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class gi11 implements ktx {

    /* JADX INFO: renamed from: a */
    public final String f80006a;

    /* JADX INFO: renamed from: b */
    public final String f80007b;

    /* JADX INFO: renamed from: c */
    public final String f80008c;

    /* JADX INFO: renamed from: d */
    public final String f80009d;

    public gi11(String str, String str2, String str3, String str4) {
        this.f80006a = str;
        this.f80007b = str2;
        this.f80008c = str3;
        this.f80009d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gi11)) {
            return false;
        }
        gi11 gi11Var = (gi11) obj;
        return wj50.m88271j(this.f80006a, gi11Var.f80006a) && wj50.m88271j(this.f80007b, gi11Var.f80007b) && wj50.m88271j(this.f80008c, gi11Var.f80008c) && wj50.m88271j(this.f80009d, gi11Var.f80009d);
    }

    public final int hashCode() {
        return this.f80009d.hashCode() + s571.m77243b(s571.m77243b(this.f80006a.hashCode() * 31, 31, this.f80007b), 31, this.f80008c);
    }
}
