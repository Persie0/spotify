package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class amf0 implements rmf0 {

    /* JADX INFO: renamed from: a */
    public final String f17131a;

    /* JADX INFO: renamed from: b */
    public final String f17132b;

    /* JADX INFO: renamed from: c */
    public final String f17133c;

    /* JADX INFO: renamed from: d */
    public final String f17134d;

    public amf0(String str, String str2, String str3, String str4) {
        this.f17131a = str;
        this.f17132b = str2;
        this.f17133c = str3;
        this.f17134d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amf0)) {
            return false;
        }
        amf0 amf0Var = (amf0) obj;
        return wj50.m88271j(this.f17131a, amf0Var.f17131a) && wj50.m88271j(this.f17132b, amf0Var.f17132b) && wj50.m88271j(this.f17133c, amf0Var.f17133c) && wj50.m88271j(this.f17134d, amf0Var.f17134d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f17131a.hashCode() * 31, 31, this.f17132b), 31, this.f17133c);
        String str = this.f17134d;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
