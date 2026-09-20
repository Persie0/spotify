package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class bws0 extends gws0 {

    /* JADX INFO: renamed from: a */
    public final String f31692a;

    /* JADX INFO: renamed from: b */
    public final String f31693b;

    /* JADX INFO: renamed from: c */
    public final String f31694c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f31695d;

    public bws0(String str, String str2, String str3, ArrayList arrayList) {
        this.f31692a = str;
        this.f31693b = str2;
        this.f31694c = str3;
        this.f31695d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bws0)) {
            return false;
        }
        bws0 bws0Var = (bws0) obj;
        return wj50.m88271j(this.f31692a, bws0Var.f31692a) && wj50.m88271j(this.f31693b, bws0Var.f31693b) && wj50.m88271j(this.f31694c, bws0Var.f31694c) && this.f31695d.equals(bws0Var.f31695d);
    }

    public final int hashCode() {
        String str = this.f31692a;
        return this.f31695d.hashCode() + s571.m77243b(s571.m77243b((str == null ? 0 : str.hashCode()) * 31, 31, this.f31693b), 31, this.f31694c);
    }
}
