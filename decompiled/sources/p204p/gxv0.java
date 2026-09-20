package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class gxv0 {

    /* JADX INFO: renamed from: a */
    public final String f85344a;

    /* JADX INFO: renamed from: b */
    public final String f85345b;

    /* JADX INFO: renamed from: c */
    public final String f85346c;

    /* JADX INFO: renamed from: d */
    public final String f85347d;

    public gxv0(String str, String str2, String str3, String str4) {
        this.f85344a = str;
        this.f85345b = str2;
        this.f85346c = str3;
        this.f85347d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxv0)) {
            return false;
        }
        gxv0 gxv0Var = (gxv0) obj;
        return wj50.m88271j(this.f85344a, gxv0Var.f85344a) && wj50.m88271j(this.f85345b, gxv0Var.f85345b) && wj50.m88271j(this.f85346c, gxv0Var.f85346c) && wj50.m88271j(this.f85347d, gxv0Var.f85347d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f85344a.hashCode() * 31, 31, this.f85345b), 31, this.f85346c);
        String str = this.f85347d;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
