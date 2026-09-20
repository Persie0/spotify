package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class tm5 implements xn5 {

    /* JADX INFO: renamed from: a */
    public final String f221601a;

    /* JADX INFO: renamed from: b */
    public final String f221602b;

    /* JADX INFO: renamed from: c */
    public final String f221603c;

    public tm5(String str, String str2, String str3) {
        this.f221601a = str;
        this.f221602b = str2;
        this.f221603c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tm5)) {
            return false;
        }
        tm5 tm5Var = (tm5) obj;
        return wj50.m88271j(this.f221601a, tm5Var.f221601a) && wj50.m88271j(this.f221602b, tm5Var.f221602b) && wj50.m88271j(this.f221603c, tm5Var.f221603c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f221601a.hashCode() * 31, 31, this.f221602b);
        String str = this.f221603c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
