package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class tqz0 implements vqz0 {

    /* JADX INFO: renamed from: a */
    public final String f222923a;

    /* JADX INFO: renamed from: b */
    public final String f222924b;

    /* JADX INFO: renamed from: c */
    public final String f222925c;

    public tqz0(String str, String str2, String str3) {
        this.f222923a = str;
        this.f222924b = str2;
        this.f222925c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tqz0)) {
            return false;
        }
        tqz0 tqz0Var = (tqz0) obj;
        return wj50.m88271j(this.f222923a, tqz0Var.f222923a) && wj50.m88271j(this.f222924b, tqz0Var.f222924b) && wj50.m88271j(this.f222925c, tqz0Var.f222925c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f222923a.hashCode() * 31, 31, this.f222924b);
        String str = this.f222925c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
