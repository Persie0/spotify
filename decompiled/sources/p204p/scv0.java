package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class scv0 implements bdv0 {

    /* JADX INFO: renamed from: a */
    public final String f207806a;

    /* JADX INFO: renamed from: b */
    public final String f207807b;

    /* JADX INFO: renamed from: c */
    public final String f207808c;

    public scv0(String str, String str2, String str3) {
        this.f207806a = str;
        this.f207807b = str2;
        this.f207808c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof scv0)) {
            return false;
        }
        scv0 scv0Var = (scv0) obj;
        return wj50.m88271j(this.f207806a, scv0Var.f207806a) && wj50.m88271j(this.f207807b, scv0Var.f207807b) && wj50.m88271j(this.f207808c, scv0Var.f207808c);
    }

    public final int hashCode() {
        return this.f207808c.hashCode() + s571.m77243b(this.f207806a.hashCode() * 31, 31, this.f207807b);
    }
}
