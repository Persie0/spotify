package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class vf81 {

    /* JADX INFO: renamed from: a */
    public final String f240911a;

    /* JADX INFO: renamed from: b */
    public final String f240912b;

    /* JADX INFO: renamed from: c */
    public final String f240913c;

    public vf81(String str, String str2, String str3) {
        this.f240911a = str;
        this.f240912b = str2;
        this.f240913c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf81)) {
            return false;
        }
        vf81 vf81Var = (vf81) obj;
        return wj50.m88271j(this.f240911a, vf81Var.f240911a) && wj50.m88271j(this.f240912b, vf81Var.f240912b) && wj50.m88271j(this.f240913c, vf81Var.f240913c);
    }

    public final int hashCode() {
        String str = this.f240911a;
        int iM77243b = s571.m77243b((str == null ? 0 : str.hashCode()) * 31, 31, this.f240912b);
        String str2 = this.f240913c;
        return iM77243b + (str2 != null ? str2.hashCode() : 0);
    }
}
