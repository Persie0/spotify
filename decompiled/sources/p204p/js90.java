package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class js90 {

    /* JADX INFO: renamed from: a */
    public final String f115450a;

    /* JADX INFO: renamed from: b */
    public final String f115451b;

    /* JADX INFO: renamed from: c */
    public final String f115452c;

    public js90(String str, String str2, String str3) {
        this.f115450a = str;
        this.f115451b = str2;
        this.f115452c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof js90)) {
            return false;
        }
        js90 js90Var = (js90) obj;
        return wj50.m88271j(this.f115450a, js90Var.f115450a) && wj50.m88271j(this.f115451b, js90Var.f115451b) && wj50.m88271j(this.f115452c, js90Var.f115452c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f115450a.hashCode() * 31, 31, this.f115451b);
        String str = this.f115452c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
