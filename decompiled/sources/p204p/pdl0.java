package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class pdl0 implements rdl0 {

    /* JADX INFO: renamed from: a */
    public final String f176488a;

    /* JADX INFO: renamed from: b */
    public final String f176489b;

    /* JADX INFO: renamed from: c */
    public final int f176490c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f176491d;

    /* JADX INFO: renamed from: e */
    public final String f176492e;

    public pdl0(int i, String str, String str2, String str3, ArrayList arrayList) {
        this.f176488a = str;
        this.f176489b = str2;
        this.f176490c = i;
        this.f176491d = arrayList;
        this.f176492e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pdl0)) {
            return false;
        }
        pdl0 pdl0Var = (pdl0) obj;
        return this.f176488a.equals(pdl0Var.f176488a) && wj50.m88271j(this.f176489b, pdl0Var.f176489b) && this.f176490c == pdl0Var.f176490c && this.f176491d.equals(pdl0Var.f176491d) && wj50.m88271j(this.f176492e, pdl0Var.f176492e);
    }

    public final int hashCode() {
        return this.f176492e.hashCode() + lq51.m59700f(this.f176491d, mt60.m62800g(this.f176490c, s571.m77243b(this.f176488a.hashCode() * 31, 31, this.f176489b), 31), 31);
    }
}
