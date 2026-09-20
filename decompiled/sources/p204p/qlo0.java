package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class qlo0 implements rlo0 {

    /* JADX INFO: renamed from: a */
    public final String f189892a;

    /* JADX INFO: renamed from: b */
    public final String f189893b;

    /* JADX INFO: renamed from: c */
    public final String f189894c;

    public qlo0(String str, String str2, String str3) {
        this.f189892a = str;
        this.f189893b = str2;
        this.f189894c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qlo0)) {
            return false;
        }
        qlo0 qlo0Var = (qlo0) obj;
        return wj50.m88271j(this.f189892a, qlo0Var.f189892a) && wj50.m88271j(this.f189893b, qlo0Var.f189893b) && wj50.m88271j(this.f189894c, qlo0Var.f189894c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f189892a.hashCode() * 31, 31, this.f189893b);
        String str = this.f189894c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
