package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class rdu0 {

    /* JADX INFO: renamed from: a */
    public final String f198208a;

    /* JADX INFO: renamed from: b */
    public final String f198209b;

    /* JADX INFO: renamed from: c */
    public final boolean f198210c;

    /* JADX INFO: renamed from: d */
    public final boolean f198211d;

    /* JADX INFO: renamed from: e */
    public final String f198212e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f198213f;

    public rdu0(String str, String str2, boolean z, boolean z2, String str3, ArrayList arrayList) {
        this.f198208a = str;
        this.f198209b = str2;
        this.f198210c = z;
        this.f198211d = z2;
        this.f198212e = str3;
        this.f198213f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rdu0)) {
            return false;
        }
        rdu0 rdu0Var = (rdu0) obj;
        return wj50.m88271j(this.f198208a, rdu0Var.f198208a) && wj50.m88271j(this.f198209b, rdu0Var.f198209b) && this.f198210c == rdu0Var.f198210c && this.f198211d == rdu0Var.f198211d && wj50.m88271j(this.f198212e, rdu0Var.f198212e) && this.f198213f.equals(rdu0Var.f198213f);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77243b(this.f198208a.hashCode() * 31, 31, this.f198209b), 31, this.f198210c), 31, this.f198211d);
        String str = this.f198212e;
        return this.f198213f.hashCode() + ((iM77245d + (str == null ? 0 : str.hashCode())) * 31);
    }
}
