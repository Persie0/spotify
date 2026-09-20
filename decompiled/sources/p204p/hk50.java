package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class hk50 {

    /* JADX INFO: renamed from: a */
    public final f4m0 f92352a;

    /* JADX INFO: renamed from: b */
    public final String f92353b;

    /* JADX INFO: renamed from: c */
    public final String f92354c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f92355d;

    /* JADX INFO: renamed from: e */
    public final String f92356e;

    public hk50(f4m0 f4m0Var, String str, String str2, ArrayList arrayList, String str3) {
        this.f92352a = f4m0Var;
        this.f92353b = str;
        this.f92354c = str2;
        this.f92355d = arrayList;
        this.f92356e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk50)) {
            return false;
        }
        hk50 hk50Var = (hk50) obj;
        return wj50.m88271j(this.f92352a, hk50Var.f92352a) && wj50.m88271j(this.f92353b, hk50Var.f92353b) && wj50.m88271j(this.f92354c, hk50Var.f92354c) && this.f92355d.equals(hk50Var.f92355d) && wj50.m88271j(this.f92356e, hk50Var.f92356e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f92352a.hashCode() * 31, 31, this.f92353b);
        String str = this.f92354c;
        int iM59700f = lq51.m59700f(this.f92355d, (iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f92356e;
        return iM59700f + (str2 != null ? str2.hashCode() : 0);
    }
}
