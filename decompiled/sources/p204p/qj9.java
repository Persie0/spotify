package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class qj9 {

    /* JADX INFO: renamed from: a */
    public final String f189195a;

    /* JADX INFO: renamed from: b */
    public final String f189196b;

    /* JADX INFO: renamed from: c */
    public final String f189197c;

    public qj9(String str, String str2, String str3) {
        this.f189195a = str;
        this.f189196b = str2;
        this.f189197c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qj9)) {
            return false;
        }
        qj9 qj9Var = (qj9) obj;
        return wj50.m88271j(this.f189195a, qj9Var.f189195a) && wj50.m88271j(this.f189196b, qj9Var.f189196b) && wj50.m88271j(this.f189197c, qj9Var.f189197c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f189195a.hashCode() * 31, 31, this.f189196b);
        String str = this.f189197c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
